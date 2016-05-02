package com.github.yukihane.gwtgxt.client.gwt.presenter;

import com.github.yukihane.gwtgxt.client.gwt.view.GwtView;
import com.github.yukihane.gwtgxt.client.root.RootEventBus;
import com.github.yukihane.gwtgxt.client.root.model.WindowType;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.LazyPresenter;
import java.util.logging.Logger;

/**
 *
 */
@Presenter(view = GwtView.class)
public class GwtPresenter extends LazyPresenter <IGwtView, RootEventBus> implements IGwtPresenter {

    private static final Logger LOGGER = Logger.getLogger(GwtPresenter.class.getName());

    public void onPrepare(final WindowType type) {
        if (type != WindowType.GWT) {
            return;
        }

        LOGGER.finer("called: onPrepare");
        eventBus.completePreparation(view);
    }

}
