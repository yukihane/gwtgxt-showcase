package com.github.yukihane.gwtgxt.client.gwt.absolutePanel.view;

import com.github.yukihane.gwtgxt.client.gwt.absolutePanel.presenter.IAbsolutePanelPresenter;
import com.github.yukihane.gwtgxt.client.gwt.absolutePanel.presenter.IAbsolutePanelView;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.mvp4g.client.view.ReverseViewInterface;

/**
 *
 */
public class AbsolutePanelView extends Composite implements IAbsolutePanelView, ReverseViewInterface <IAbsolutePanelPresenter> {

    interface MyUiBinder extends UiBinder <Widget, AbsolutePanelView> {
    }

    private static MyUiBinder UI_BINDER = GWT.create(MyUiBinder.class);

    private IAbsolutePanelPresenter presenter;

    @Override
    public void setPresenter(final IAbsolutePanelPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public IAbsolutePanelPresenter getPresenter() {
        return presenter;
    }

    @Override
    public void createView() {
        final Widget uiBind = UI_BINDER.createAndBindUi(this);
        initWidget(uiBind);
    }
}
