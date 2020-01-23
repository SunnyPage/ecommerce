package com.company.ecommerce.web.screens.order;

import com.haulmont.cuba.gui.screen.*;
import com.company.ecommerce.entity.Order;

@UiController("ecommerce_Order.browse")
@UiDescriptor("order-browse.xml")
@LookupComponent("ordersTable")
@LoadDataBeforeShow
public class OrderBrowse extends StandardLookup<Order> {
}