package com.github.yukihane.gwtgxt.client.gwt.absolutePanel.view;

import com.github.yukihane.gwtgxt.client.gwt.absolutePanel.presenter.IAbsolutePanelPresenter;
import com.github.yukihane.gwtgxt.client.gwt.absolutePanel.presenter.IAbsolutePanelView;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.ResizeComposite;
import com.google.gwt.user.client.ui.Widget;
import com.mvp4g.client.view.ReverseViewInterface;
import java.util.logging.Logger;

/**
 *
 */
public class AbsolutePanelView extends ResizeComposite
    implements IAbsolutePanelView, ReverseViewInterface <IAbsolutePanelPresenter> {

    private static final Logger LOGGER = Logger.getLogger(AbsolutePanelView.class.getName());

    interface MyUiBinder extends UiBinder <Widget, AbsolutePanelView> {
    }

    private static MyUiBinder UI_BINDER = GWT.create(MyUiBinder.class);

    private IAbsolutePanelPresenter presenter;

    @Override
    public void setPresenter(final IAbsolutePanelPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public IAbsolutePanelPresenter getPresenter() {
        return presenter;
    }

    @Override
    public void createView() {
        final Widget uiBind = UI_BINDER.createAndBindUi(this);
        LOGGER.finer(uiBind.getClass().getName());
        initWidget(uiBind);
    }
}
