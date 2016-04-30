package com.github.yukihane.gwtgxt.client.input_form.view;

import com.github.yukihane.gwtgxt.client.input_form.presenter.IInputFormPresenter;
import com.github.yukihane.gwtgxt.client.input_form.presenter.IInputFormView;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.mvp4g.client.view.ReverseViewInterface;

/**
 *
 */
public class InputFormView extends Composite implements IInputFormView, ReverseViewInterface<IInputFormPresenter> {

    interface InputFormViewUiBinder extends UiBinder<Widget, InputFormView> {
    }

    private static InputFormViewUiBinder UI_BINDER = GWT.create(InputFormViewUiBinder.class);

    @UiField
    Button inputForm;

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
        final Widget uiBind = UI_BINDER.createAndBindUi(this);
        initWidget(uiBind);

    }

}
