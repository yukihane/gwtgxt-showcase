
/**
 * Sencha GXT 4.0.0 - Sencha for GWT
 * Copyright (c) 2006-2015, Sencha Inc.
 *
 * licensing@sencha.com
 * http://www.sencha.com/products/gxt/license/
 *
 * ================================================================================
 * Commercial License
 * ================================================================================
 * This version of Sencha GXT is licensed commercially and is the appropriate
 * option for the vast majority of use cases.
 *
 * Please see the Sencha GXT Licensing page at:
 * http://www.sencha.com/products/gxt/license/
 *
 * For clarification or additional options, please contact:
 * licensing@sencha.com
 * ================================================================================
 *
 *
 *
 *
 *
 *
 *
 *
 * ================================================================================
 * Disclaimer
 * ================================================================================
 * THIS SOFTWARE IS DISTRIBUTED "AS-IS" WITHOUT ANY WARRANTIES, CONDITIONS AND
 * REPRESENTATIONS WHETHER EXPRESS OR IMPLIED, INCLUDING WITHOUT LIMITATION THE
 * IMPLIED WARRANTIES AND CONDITIONS OF MERCHANTABILITY, MERCHANTABLE QUALITY,
 * FITNESS FOR A PARTICULAR PURPOSE, DURABILITY, NON-INFRINGEMENT, PERFORMANCE AND
 * THOSE ARISING BY STATUTE OR FROM CUSTOM OR USAGE OF TRADE OR COURSE OF DEALING.
 * ================================================================================
 */
package com.github.yukihane.gwtgxt.client.grid;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.widget.core.client.grid.CellSelectionModel;
import com.sencha.gxt.widget.core.client.grid.Grid;
import com.sencha.gxt.widget.core.client.grid.editing.GridEditing;
import com.sencha.gxt.widget.core.client.grid.editing.GridInlineEditing;

public class InlineEditingGridExample extends AbstractGridEditingExample {

    protected static final int MAX_HEIGHT = 600;
    protected static final int MAX_WIDTH = 800;
    protected static final int MIN_HEIGHT = 320;
    protected static final int MIN_WIDTH = 480;

    private Widget widget;

    @Override
    protected GridEditing <Plant> createGridEditing(final Grid <Plant> editableGrid) {
        return new GridInlineEditing <Plant>(editableGrid);
    }

    @Override
    public Widget asWidget() {
        if (widget == null) {
            widget = super.asWidget();
            // customize();
        }

        return widget;
    }

    public void onModuleLoad() {
        // new ExampleContainer(this)
        // .setMaxHeight(MAX_HEIGHT)
        // .setMaxWidth(MAX_WIDTH)
        // .setMinHeight(MIN_HEIGHT)
        // .setMinWidth(MIN_WIDTH)
        // .doStandalone();
        // }
        //
        // protected void customize() {
        // panel.setHeading("Inline Editable Grid");
        //
        grid.setSelectionModel(new CellSelectionModel <Plant>());
        grid.getColumnModel().getColumn(0).setHideable(false);
    }

}