package com.github.yukihane.gwtgxt.client.listing.view;

import com.github.yukihane.gwtgxt.client.listing.presenter.IListingPresenter;
import com.github.yukihane.gwtgxt.client.listing.presenter.IListingView;
import com.mvp4g.client.view.ReverseViewInterface;

public class ListingView implements IListingView, ReverseViewInterface <IListingPresenter> {

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
        // TODO Auto-generated method stub

    }

}
