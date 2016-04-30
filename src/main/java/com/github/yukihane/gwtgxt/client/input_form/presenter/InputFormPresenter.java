package com.github.yukihane.gwtgxt.client.input_form.presenter;

import com.github.yukihane.gwtgxt.client.input_form.view.InputFormView;
import com.github.yukihane.gwtgxt.client.root.RootEventBus;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.LazyPresenter;
import java.util.logging.Logger;

/**
 *
 */
@Presenter(view = InputFormView.class)
public class InputFormPresenter extends LazyPresenter<IInputFormView, RootEventBus> implements IInputFormPresenter {

    private static final Logger LOGGER = Logger.getLogger(InputFormPresenter.class.getName());

    public void onPrepareInputForm() {
        LOGGER.finer("called: onPrepareInputForm");
        eventBus.completePreparation(view);
    }
}
