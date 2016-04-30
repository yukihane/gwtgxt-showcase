package com.github.yukihane.gwtgxt.client.root.presenter;

import com.github.yukihane.gwtgxt.client.root.RootEventBus;
import com.github.yukihane.gwtgxt.client.root.model.WindowType;
import com.github.yukihane.gwtgxt.client.root.view.RootView;
import com.google.gwt.user.client.ui.IsWidget;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.LazyPresenter;
import java.util.logging.Logger;

@Presenter(view = RootView.class)
public class RootPresenter extends LazyPresenter<IRootView, RootEventBus> implements IRootPresenter {

    private static final Logger LOGGER = Logger.getLogger(RootPresenter.class.getName());

    private IsWidget openedWindow;

    public void onStart() {
        LOGGER.finer("called: onStart");
    }

    public void onBindListingView(final IsWidget listingView) {
        LOGGER.finer("called: onbindListingView");

        view.addListingView(listingView);
    }

    public void onOpenWindow(final WindowType type) {
        if (openedWindow != null) {
            view.closeWindow(openedWindow);
        }

        switch (type) {
        case INPUT_FORM:
            eventBus.prepareInputForm();
            break;
        default:
            throw new UnsupportedOperationException("Not defined: " + type);
        }
    }

    public void onCompletePreparation(IsWidget view) {
        LOGGER.finer("called: onCompletePreparation");
    }
}
