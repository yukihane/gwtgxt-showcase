package com.github.yukihane.gwtgxt.client.input_form.view;

import com.github.yukihane.gwtgxt.client.input_form.presenter.IInputFormPresenter;
import com.github.yukihane.gwtgxt.client.input_form.presenter.IInputFormView;
import com.mvp4g.client.view.ReverseViewInterface;
import com.sencha.gxt.widget.core.client.container.SimpleContainer;

/**
 *
 */
public class InputFormView extends SimpleContainer
        implements IInputFormView, ReverseViewInterface<IInputFormPresenter> {

    private IInputFormPresenter presenter;

    @Override
    public void setPresenter(final IInputFormPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public IInputFormPresenter getPresenter() {
        return presenter;
    }

    @Override
    public void createView() {
        // TODO Auto-generated method stub

    }

}
