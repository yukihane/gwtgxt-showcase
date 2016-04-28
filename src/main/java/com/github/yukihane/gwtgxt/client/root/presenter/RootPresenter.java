package com.github.yukihane.gwtgxt.client.root.presenter;

import com.github.yukihane.gwtgxt.client.root.RootEventBus;
import com.github.yukihane.gwtgxt.client.root.view.RootView;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.LazyPresenter;
import java.util.logging.Logger;

@Presenter(view = RootView.class)
public class RootPresenter extends LazyPresenter <IRootView, RootEventBus> implements IRootPresenter {

    private static final Logger LOGGER = Logger.getLogger(RootPresenter.class.getName());

    public void onStart() {
        LOGGER.finer("called: onStart");
    }
}
