package com.github.yukihane.gwtgxt.client.gwt.view;

import com.github.yukihane.gwtgxt.client.gwt.presenter.IGwtPresenter;
import com.github.yukihane.gwtgxt.client.gwt.presenter.IGwtView;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.mvp4g.client.view.ReverseViewInterface;

/**
 *
 */
public class GwtView extends Composite implements IGwtView, ReverseViewInterface <IGwtPresenter> {

    interface MyUiBinder extends UiBinder <Widget, GwtView> {
    }

    private static MyUiBinder UI_BINDER = GWT.create(MyUiBinder.class);

    private IGwtPresenter presenter;

    @Override
    public void setPresenter(final IGwtPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public IGwtPresenter getPresenter() {
        return presenter;
    }

    @Override
    public void createView() {
        final Widget uiBind = UI_BINDER.createAndBindUi(this);
        initWidget(uiBind);
    }
}
