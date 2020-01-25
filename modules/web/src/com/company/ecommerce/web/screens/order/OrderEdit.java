package com.company.ecommerce.web.screens.order;

import com.company.ecommerce.entity.DocumentType;
import com.company.ecommerce.entity.Documents;
import com.company.ecommerce.entity.Order;
import com.company.ecommerce.service.ReportLoadService;
import com.haulmont.cuba.core.app.UniqueNumbersService;
import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.data.CollectionDatasource;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.model.CollectionPropertyContainer;
import com.haulmont.cuba.gui.model.DataContext;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.reports.app.service.ReportService;
import com.haulmont.reports.entity.Report;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@UiController("ecommerce_Order.edit")
@UiDescriptor("order-edit.xml")
@EditedEntityContainer("orderDc")
@LoadDataBeforeShow
public class OrderEdit extends StandardEditor<Order> {

    @Inject
    protected ReportLoadService reportLoadService;

    @Inject
    protected ReportService reportService;

    //@Inject
    @Inject
    private CollectionPropertyContainer<Documents> documentsDc;

    @Inject
    private UniqueNumbersService uniqueNumbersService;

    @Inject
    private Notifications notifications;

    @Inject
    private CollectionLoader<Order> ordersDl;

    @Inject
    private Metadata metadata;

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

    public void generateInvoice() {

        Report invoiceReport = reportLoadService.loadReportBySystemcode("order_invoice");

        String fileName = "myFile";
        Map<String, Object> params = new HashMap<>();
        params.put("entity", getEditedEntity());
        FileDescriptor invoiceFile = reportService.createAndSaveReport(invoiceReport, params, fileName);

        Documents invoiceDocument = metadata.create(Documents.class);
        invoiceDocument.setFile(invoiceFile);
        invoiceDocument.setName(fileName);
        invoiceDocument.setType(DocumentType.INVOICE);
        invoiceDocument.setOrder(getEditedEntity());

        documentsDc.getMutableItems().add(invoiceDocument);
    }

}
