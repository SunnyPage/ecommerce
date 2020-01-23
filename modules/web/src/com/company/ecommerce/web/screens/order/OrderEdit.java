package com.company.ecommerce.web.screens.order;

import com.haulmont.cuba.core.app.NumberIdService;
import com.haulmont.cuba.core.app.UniqueNumbersService;
import com.haulmont.cuba.gui.screen.*;
import com.company.ecommerce.entity.Order;

import javax.inject.Inject;

@UiController("ecommerce_Order.edit")
@UiDescriptor("order-edit.xml")
@EditedEntityContainer("orderDc")
@LoadDataBeforeShow
public class OrderEdit extends StandardEditor<Order> {


    @Inject
    private UniqueNumbersService uniqueNumbersService;

    @Subscribe
    public void onInitEntity(InitEntityEvent<Order> event) {
        event.getEntity().setOrderId("" + uniqueNumbersService.getNextNumber("orderId"));
    }
}