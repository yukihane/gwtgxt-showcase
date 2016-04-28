package com.github.yukihane.gwtgxt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.SplitLayoutPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Main implements EntryPoint {

    @Override
    public void onModuleLoad() {
        final SplitLayoutPanel p = new SplitLayoutPanel();
        p.addWest(new HTML("navigation"), 128);
        p.add(new HTML("details"));

        final DockLayoutPanel appPanel = new DockLayoutPanel(Unit.EM);
        appPanel.add(p);
        RootLayoutPanel.get().add(appPanel);
    }
}
