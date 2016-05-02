package com.github.yukihane.gwtgxt.client.root;

import com.github.yukihane.gwtgxt.client.gwt.absolutePanel.presenter.AbsolutePanelPresenter;
import com.github.yukihane.gwtgxt.client.input_form.presenter.InputFormPresenter;
import com.github.yukihane.gwtgxt.client.listing.presenter.ListingPresenter;
import com.github.yukihane.gwtgxt.client.root.model.WindowType;
import com.github.yukihane.gwtgxt.client.root.presenter.RootPresenter;
import com.google.gwt.user.client.ui.IsWidget;
import com.mvp4g.client.annotation.Event;
import com.mvp4g.client.annotation.Events;
import com.mvp4g.client.annotation.Start;
import com.mvp4g.client.event.EventBusWithLookup;

@Events(startPresenter = RootPresenter.class)
public interface RootEventBus extends EventBusWithLookup {

    @Start
    @Event(handlers = { RootPresenter.class, ListingPresenter.class, })
    void start();

    /**
     * 一覧ビューが生成されました.
     *
     * @param view
     *            一覧のビュー
     */
    @Event(handlers = RootPresenter.class)
    void bindListingView(IsWidget view);

    /**
     * @param type
     */
    @Event(handlers = RootPresenter.class)
    void openWindow(WindowType type);

    @Event(handlers = RootPresenter.class)
    void completePreparation(IsWidget view);

    @Event(handlers = { InputFormPresenter.class, AbsolutePanelPresenter.class })
    void prepare(WindowType type);
}
