package com.github.yukihane.gwtgxt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.container.BorderLayoutContainer;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;
import com.sencha.gxt.widget.core.client.container.Viewport;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Main implements EntryPoint {
    /**
     * The message displayed to the user when the server cannot be reached or
     * returns an error.
     */
    private static final String SERVER_ERROR = "An error occurred while " +
        "attempting to contact the server. Please check your network " + "connection and try again.";

    /**
     * Create a remote service proxy to talk to the server-side Greeting
     * service.
     */
    private final GreetingServiceAsync greetingService = GWT.create(GreetingService.class);

    private final Messages messages = GWT.create(Messages.class);

    /**
     * This is the entry point method.
     */
    @Override
    public void onModuleLoad() {
        final BorderLayoutContainer lc = new BorderLayoutContainer();
        final TextButton center = new TextButton("center");
        lc.setCenterWidget(center);
        final TextButton west = new TextButton("west");
        lc.setWestWidget(west);
        final VerticalLayoutContainer vlc = new VerticalLayoutContainer();
        // VerticalLayoutContainer に明示的に高さを指定すれば回避可能
        vlc.setHeight(200);
        vlc.add(lc, new VerticalLayoutContainer.VerticalLayoutData(1, 1));
        vlc.add(new TextButton("bottom"), new VerticalLayoutContainer.VerticalLayoutData(1, -1));
        RootPanel.get().add(vlc);
    }
}
