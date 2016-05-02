package com.github.yukihane.gwtgxt.client.listing.presenter;

import com.github.yukihane.gwtgxt.client.listing.view.ListingView;
import com.github.yukihane.gwtgxt.client.root.RootEventBus;
import com.github.yukihane.gwtgxt.client.root.model.WindowType;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.LazyPresenter;
import java.util.logging.Logger;

@Presenter(view = ListingView.class)
public class ListingPresenter extends LazyPresenter <IListingView, RootEventBus> implements IListingPresenter {

    private static final Logger LOGGER = Logger.getLogger(ListingPresenter.class.getName());

    public void onStart() {
        LOGGER.finer("called: onStart");
    }

    @Override
    public void bindView() {
        eventBus.bindListingView(view);
    }

    @Override
    public void actInputFormClicked() {
        LOGGER.finer("called: actInputFormClicked");
        eventBus.openWindow(WindowType.INPUT_FORM);
    }

    @Override
    public void actGwtClicked() {
        LOGGER.finer("called: actInputFormClicked");
        eventBus.openWindow(WindowType.GWT);
    }
}
