package com.github.yukihane.gwtgxt.client;

import com.github.yukihane.gwtgxt.client.grid.InlineEditingGridExample;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.sencha.gxt.widget.core.client.container.Viewport;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Main implements EntryPoint {

    @Override
    public void onModuleLoad() {
        final Viewport v = new Viewport();
        v.add(new InlineEditingGridExample());

        RootPanel.get().add(v);
    }
}
