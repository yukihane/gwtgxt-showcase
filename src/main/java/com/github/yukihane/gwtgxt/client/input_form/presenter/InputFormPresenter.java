package com.github.yukihane.gwtgxt.client.input_form.presenter;

import com.github.yukihane.gwtgxt.client.input_form.view.InputFormView;
import com.github.yukihane.gwtgxt.client.root.RootEventBus;
import com.github.yukihane.gwtgxt.client.root.model.WindowType;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.LazyPresenter;
import java.util.logging.Logger;

/**
 *
 */
@Presenter(view = InputFormView.class)
public class InputFormPresenter extends LazyPresenter<IInputFormView, RootEventBus> implements IInputFormPresenter {

    private static final Logger LOGGER = Logger.getLogger(InputFormPresenter.class.getName());

    public void onPrepare(final WindowType type) {
        if (type != WindowType.INPUT_FORM) {
            return;
        }

        LOGGER.finer("called: onPrepareInputForm");
        eventBus.completePreparation(view);
    }
}
