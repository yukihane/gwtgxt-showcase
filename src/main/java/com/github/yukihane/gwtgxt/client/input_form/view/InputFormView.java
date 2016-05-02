package com.github.yukihane.gwtgxt.client.input_form.view;

import com.github.yukihane.gwtgxt.client.input_form.presenter.IInputFormPresenter;
import com.github.yukihane.gwtgxt.client.input_form.presenter.IInputFormView;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.mvp4g.client.view.ReverseViewInterface;
import com.sencha.gxt.widget.core.client.container.SimpleContainer;
import com.sencha.gxt.widget.core.client.menu.Menu;
import com.sencha.gxt.widget.core.client.menu.MenuBar;
import com.sencha.gxt.widget.core.client.menu.MenuBarItem;
import com.sencha.gxt.widget.core.client.menu.MenuItem;

/**
 *
 */
public class InputFormView extends SimpleContainer
    implements IInputFormView, ReverseViewInterface <IInputFormPresenter> {

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
        final DockLayoutPanel layout = new DockLayoutPanel(Unit.EM);

        final Menu menu1 = new Menu();
        menu1.add(new MenuItem("Option 1"));
        menu1.add(new MenuItem("Option 2"));

        final MenuBar bar = new MenuBar();
        bar.add(new MenuBarItem("menu1", menu1));

        layout.addNorth(bar, 2);
        add(layout);
    }

}
