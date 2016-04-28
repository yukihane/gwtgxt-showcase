package com.github.yukihane.gwtgxt.client.root;

import com.github.yukihane.gwtgxt.client.root.presenter.RootPresenter;
import com.mvp4g.client.annotation.Event;
import com.mvp4g.client.annotation.Events;
import com.mvp4g.client.annotation.Start;
import com.mvp4g.client.event.EventBusWithLookup;

@Events(startPresenter = RootPresenter.class)
public interface RootEventBus extends EventBusWithLookup {

    @Start
    @Event(bind = RootPresenter.class)
    void start();
}
