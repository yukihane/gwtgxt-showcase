package com.github.yukihane.gwtgxt.client.store;

import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.data.shared.Store;
import org.junit.Test;

public class MyListStoreTest {

    @Test
    public void testGetRecord() {
        final MyListStore <MyClass> store = new MyListStore<>(new ModelKeyProvider <MyClass>() {
            @Override
            public String getKey(final MyClass item) {
                return item.getId();
            }
        });

        final MyClass obj = new MyClass();
        final Store <MyClass>.Record res = store.getRecord(obj);
    }

}

class MyClass {

    private static int count = 0;

    private final int id;

    public MyClass() {
        count++;
        id = count;
    }

    public String getId() {
        return Integer.toString(id);
    }
}
