package com.github.yukihane.gwtgxt.client.gwt.absolutePanel.presenter;

import com.github.yukihane.gwtgxt.client.gwt.absolutePanel.view.AbsolutePanelView;
import com.github.yukihane.gwtgxt.client.root.RootEventBus;
import com.github.yukihane.gwtgxt.client.root.model.WindowType;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.LazyPresenter;
import java.util.logging.Logger;

/**
 *
 */
@Presenter(view = AbsolutePanelView.class)
public class AbsolutePanelPresenter extends LazyPresenter <IAbsolutePanelView, RootEventBus> implements IAbsolutePanelPresenter {

    private static final Logger LOGGER = Logger.getLogger(AbsolutePanelPresenter.class.getName());

    public void onPrepare(final WindowType type) {
        if (type != WindowType.GWT) {
            return;
        }

        LOGGER.finer("called: onPrepare");
        eventBus.completePreparation(view);
    }

}
