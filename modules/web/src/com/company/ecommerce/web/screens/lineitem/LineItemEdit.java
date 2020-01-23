package com.company.ecommerce.web.screens.lineitem;

import com.haulmont.cuba.gui.screen.*;
import com.company.ecommerce.entity.LineItem;

@UiController("ecommerce_LineItem.edit")
@UiDescriptor("line-item-edit.xml")
@EditedEntityContainer("lineItemDc")
@LoadDataBeforeShow
public class LineItemEdit extends StandardEditor<LineItem> {
}