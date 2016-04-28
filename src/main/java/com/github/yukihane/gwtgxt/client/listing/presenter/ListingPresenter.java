package com.github.yukihane.gwtgxt.client.listing.presenter;

import com.github.yukihane.gwtgxt.client.listing.view.ListingView;
import com.github.yukihane.gwtgxt.client.root.RootEventBus;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.LazyPresenter;
import java.util.logging.Logger;

@Presenter(view = ListingView.class)
public class ListingPresenter extends LazyPresenter <IListingView, RootEventBus> implements IListingPresenter {

    private static final Logger LOGGER = Logger.getLogger(ListingPresenter.class.getName());

    public void onStart() {
        LOGGER.finer("called: onStart");
    }

}
