package com.github.yukihane.gwtgxt.client.grid;

import com.github.yukihane.gwtgxt.client.store.MyListStore;
import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.widget.core.client.grid.GridView;
import com.sencha.gxt.widget.core.client.grid.GridViewConfig;

public class MyGridView<M> extends GridView <M> {

    public class MyGridViewConfig implements GridViewConfig <M> {

        @Override
        public String getColStyle(final M model, final ValueProvider <? super M, ?> valueProvider, final int rowIndex,
            final int colIndex) {

            final MyListStore <M>.MyRecord r =
                ds.hasRecord(model) ? ((MyListStore <M>.MyRecord) ds.getRecord(model)) : null;

            if (r != null && !r.isValid(valueProvider.getPath())) {
                return cellInvalid;
            }
            return "";

        }

        @Override
        public String getRowStyle(final M model, final int rowIndex) {
            return "";
        }
    }
}
