package com.github.yukihane.gwtgxt.client;

import com.github.yukihane.gwtgxt.client.grid.InlineEditingGridExample;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.container.Viewport;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Main implements EntryPoint {

    @Override
    public void onModuleLoad() {
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
        p.add(new InlineEditingGridExample());

        RootPanel.get().add(v);
    }

    private void actSelection() {
        // TODO Auto-generated method stub

    }
}
