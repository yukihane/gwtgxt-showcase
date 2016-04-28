package com.github.yukihane.gwtgxt.client.root.presenter;

import com.google.gwt.user.client.ui.IsWidget;
import com.mvp4g.client.view.LazyView;

public interface IRootView extends LazyView {

    /**
     * @param listingView
     */
    void addListingView(IsWidget listingView);

}
