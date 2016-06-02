package com.github.yukihane.gwtgxt.client;

import com.github.yukihane.gwtgxt.client.grid.InlineEditingGridExample;
import com.github.yukihane.gwtgxt.client.grid.Plant;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.sencha.gxt.data.shared.ListStore;
import com.sencha.gxt.data.shared.Store;
import com.sencha.gxt.data.shared.Store.Change;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.container.Viewport;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;
import com.sencha.gxt.widget.core.client.grid.Grid;
import java.util.logging.Logger;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Main implements EntryPoint {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    private InlineEditingGridExample editingGrid;

    @Override
    public void onModuleLoad() {
        editingGrid = new InlineEditingGridExample();

        final TextButton button = new TextButton("get dirty data");
        button.addSelectHandler(new SelectHandler() {
            @Override
            public void onSelect(final SelectEvent event) {
                actSelection();
            }
        });

        final Viewport v = new Viewport();
        final DockLayoutPanel p = new DockLayoutPanel(Unit.EM);
        v.add(p);
        p.addSouth(button, 5.0);
        p.add(editingGrid);

        RootPanel.get().add(v);
    }

    private void actSelection() {
        final Grid <Plant> grid = editingGrid.grid;
        final ListStore <Plant> store = grid.getStore();
        final Plant data0 = store.get(0);

        final String name = data0.getName();
        final String light = data0.getLight();

        LOGGER.fine("name: " + name + ", light: " + light);

        final Store <Plant>.Record rec = store.getRecord(data0);
        for (final Change <Plant, ?> c : rec.getChanges()) {
            final Object tag = c.getChangeTag();
            final Object value = c.getValue();

            LOGGER.fine("tag: " + tag + ", value: " + value);
        }
    }
}
