package com.github.yukihane.gwtgxt.client.root.presenter;

import com.github.yukihane.gwtgxt.client.root.RootEventBus;
import com.github.yukihane.gwtgxt.client.root.view.RootView;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.LazyPresenter;

@Presenter(view = RootView.class)
public class RootPresenter extends LazyPresenter <IRootView, RootEventBus> implements IRootPresenter {

    public void onStart() {
    }
}
