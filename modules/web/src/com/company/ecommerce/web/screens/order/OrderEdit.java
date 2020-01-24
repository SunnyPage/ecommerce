package com.company.ecommerce.web.screens.order;

import com.haulmont.cuba.core.app.NumberIdService;
import com.haulmont.cuba.core.app.UniqueNumbersService;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.model.DataContext;
import com.haulmont.cuba.gui.model.InstanceLoader;
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

    @Inject
    private Notifications notifications;

    @Inject
    private CollectionLoader<Order> ordersDl;

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        ordersDl.setParameter("OrderId", getEditedEntity().getId());
        getScreenData().loadAll();
    }

    @Subscribe
    public void onInitEntity(InitEntityEvent<Order> event) {
        event.getEntity().setOrderId("" + uniqueNumbersService.getNextNumber("orderId"));
    }

    @Subscribe(target = Target.DATA_CONTEXT)
    public void onPreCommit(DataContext.PreCommitEvent event) {

        if (getEditedEntity().getOrdered().after(getEditedEntity().getShipped()))
        {
            notifications.create(Notifications.NotificationType.ERROR).withCaption("ERROR! 'Ordered date' after 'Shipped date'").show();
            event.preventCommit();
        }
    }



}
