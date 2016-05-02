package com.github.yukihane.gwtgxt.client.root.view;

import com.github.yukihane.gwtgxt.client.root.presenter.IRootPresenter;
import com.github.yukihane.gwtgxt.client.root.presenter.IRootView;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SplitLayoutPanel;
import com.mvp4g.client.view.ReverseViewInterface;
import java.util.logging.Logger;

public class RootView extends DockLayoutPanel implements IRootView, ReverseViewInterface <IRootPresenter> {

    private static final Logger LOGGER = Logger.getLogger(RootView.class.getName());

    private IRootPresenter presenter;

    private SplitLayoutPanel layout;

    public RootView() {
        super(Unit.EM);
    }

    @Override
    public void setPresenter(final IRootPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public IRootPresenter getPresenter() {
        return presenter;
    }

    @Override
    public void createView() {

        LOGGER.finer("called createView");

        layout = new SplitLayoutPanel();

        add(layout);
    }

    @Override
    public void addListingView(final IsWidget listingView) {
        layout.addWest(listingView, 128);
    }

    @Override
    public void closeWindow(final IsWidget widget) {
        if (widget == null) {
            return;
        }
        layout.remove(widget.asWidget());
    }

    @Override
    public void openWindow(final IsWidget widget) {
        layout.add(widget.asWidget());
    }

}
