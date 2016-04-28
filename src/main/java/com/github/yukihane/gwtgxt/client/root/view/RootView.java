package com.github.yukihane.gwtgxt.client.root.view;

import com.github.yukihane.gwtgxt.client.root.presenter.IRootPresenter;
import com.github.yukihane.gwtgxt.client.root.presenter.IRootView;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.SplitLayoutPanel;
import com.mvp4g.client.view.ReverseViewInterface;

public class RootView extends DockLayoutPanel implements IRootView, ReverseViewInterface <IRootPresenter> {

    private IRootPresenter presenter;

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

        final SplitLayoutPanel p = new SplitLayoutPanel();
        p.addWest(new HTML("navigation"), 128);
        p.add(new HTML("details"));

        add(p);
    }

}
