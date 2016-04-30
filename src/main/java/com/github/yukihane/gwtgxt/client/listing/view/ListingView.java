package com.github.yukihane.gwtgxt.client.listing.view;

import com.github.yukihane.gwtgxt.client.listing.presenter.IListingPresenter;
import com.github.yukihane.gwtgxt.client.listing.presenter.IListingView;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.mvp4g.client.view.ReverseViewInterface;

public class ListingView extends Composite implements IListingView, ReverseViewInterface <IListingPresenter> {

    interface ListingViewUiBinder extends UiBinder <Widget, ListingView> {
    }

    private static ListingViewUiBinder UI_BINDER = GWT.create(ListingViewUiBinder.class);

    @UiField
    Button inputForm;

    private IListingPresenter presenter;

    @Override
    public void setPresenter(final IListingPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public IListingPresenter getPresenter() {
        return presenter;
    }

    @Override
    public void createView() {
        final Widget uiBind = UI_BINDER.createAndBindUi(this);
        initWidget(uiBind);

        inputForm.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(final ClickEvent event) {
                presenter.actInputFormClicked();
            }
        });
    }

}
