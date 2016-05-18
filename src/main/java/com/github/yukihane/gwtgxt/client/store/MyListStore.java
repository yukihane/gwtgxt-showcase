package com.github.yukihane.gwtgxt.client.store;

import com.sencha.gxt.data.shared.ListStore;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.data.shared.Store;
import java.util.Map;

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

    protected native final Map <String, Record> getRecords()
    /*-{
        return this.@java.util.Map::records;
    }-*/;

    public class MyRecord extends Record {

        public MyRecord(final M model) {
            super(model);
        }
    }
}
