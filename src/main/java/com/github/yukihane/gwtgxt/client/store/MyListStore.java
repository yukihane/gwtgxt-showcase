package com.github.yukihane.gwtgxt.client.store;

import com.google.gwt.core.client.GWT;
import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.core.shared.FastMap;
import com.sencha.gxt.data.shared.ListStore;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.data.shared.Store;
import java.util.Map;

/**
 * @param <M>
 *            the model type
 */
public class MyListStore<M> extends ListStore <M> {

    public MyListStore(final ModelKeyProvider <? super M> keyProvider) {
        super(keyProvider);
    }

    @Override
    public Record getRecord(final M data) {
        final String key = getKeyProvider().getKey(data);
        final Map <String, Store <M>.Record> records = getRecords();
        Record rec = records.get(key);
        if (rec == null) {
            rec = new MyRecord(data);
            records.put(key, rec);
        }
        return rec;
    }

    protected Map <String, Record> getRecords() {
        if (GWT.isScript()) {
            return getRecordsJSNI();
        } else {
            throw new UnsupportedOperationException("JSNIで実装しているためJUnitテスト時はモッキングする必要があります(本例外発生箇所のコメント参照).");
            // final Field f = Store.class.getDeclaredField("records");
            // f.setAccessible(true);
            // return (Map <String, Store <M>.Record>) f.get(this);
        }
    }

    /**
     * Storeのrecordsフィールドを取得するメソッド.
     * privateで外部からのアクセス手段がない.
     * このメソッドではJSNIを使って可視性制御をスポイルすることでアクセス可能としている.
     *
     * @return records.
     */
    protected native Map <String, Record> getRecordsJSNI()
    /*-{
        return this.@com.sencha.gxt.data.shared.Store::records;
    }-*/;

    /**
     * 標準の{@link Record}にvalidation状態を持たせられるように拡張したクラス.
     * gxt2時代のコードを参考にして作成している.
     */
    public class MyRecord extends Record {

        /**
         * validかinvalidかをカラム識別子(path)をキーにして持つ.
         * (どの程度意味が有るか分からないが)valid/invalidの情報を持っていない場合にはmapのインスタンス自体を持たない(null)
         * こととしている.
         * (編集しないグリッドのカラムには不要な情報なので, 大量情報表示時などには効いてくるのではないかと思う.)
         */
        private Map <String, Boolean> validMap;

        public MyRecord(final M model) {
            super(model);
        }

        @Override
        public <V> void addChange(final ValueProvider <? super M, V> property, final V value) {

            if (validMap != null) {
                validMap.remove(property.getPath());
            }

            super.addChange(property, value);
        }

        @Override
        public void commit(final boolean fireEvent) {

            // オリジナル実装でやっている changes.clear(); と同条件でvalid情報も消す.
            if (isDirty()) {
                validMap = null;
            }

            super.commit(fireEvent);
        }

        @Override
        public void revert(final ValueProvider <? super M, ?> property) {
            if (validMap != null) {
                validMap.remove(property.getPath());
            }

            super.revert(property);
        }

        @Override
        public void revert() {
            validMap = null;

            super.revert();
        }

        /**
         * Sets whether the record is valid (defaults to true). The valid state
         * of a record is not modified or changed by the record itself.
         * Both EditorGrid and FieldBinding will set the valid state of the
         * record to match the field's valid state after an edit completes.
         * (以上, gxt2における記述)
         *
         * @param property
         *            the property name
         * @param valid
         *            true if valid, false otherwise
         */
        public void setValid(final String property, final boolean valid) {
            if (validMap == null) {
                validMap = new FastMap <Boolean>();
            }
            validMap.put(property, valid);
        }

        /**
         * Returns true if the record is valid. (以上, gxt2における記述)
         *
         * @param property
         *            the property name
         * @return true if the record is valid
         */
        public boolean isValid(final String property) {
            if (validMap == null) {
                return true;
            }
            if (validMap.containsKey(property)) {
                return validMap.get(property);
            }
            return true;
        }

    }
}
