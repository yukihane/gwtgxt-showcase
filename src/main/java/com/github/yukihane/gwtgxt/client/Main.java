package com.github.yukihane.gwtgxt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Frame;
import com.google.gwt.user.client.ui.RootPanel;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.TabPanel;
import com.sencha.gxt.widget.core.client.container.MarginData;
import com.sencha.gxt.widget.core.client.container.Viewport;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Main implements EntryPoint {

    /**
     * This is the entry point method.
     */
    @Override
    public void onModuleLoad() {
        final Frame panel = new Frame();
        panel.setUrl("hello.html");
        final TabPanel tab = new TabPanel();
        tab.add(panel, "hello");
        final ContentPanel cp = new ContentPanel();
        cp.add(tab);
        final Viewport viewport = new Viewport();
        viewport.add(cp, new MarginData(10));
        RootPanel.get().add(viewport);
    }
}
