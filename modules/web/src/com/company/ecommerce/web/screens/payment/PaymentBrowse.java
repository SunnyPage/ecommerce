package com.company.ecommerce.web.screens.payment;

import com.haulmont.cuba.gui.screen.*;
import com.company.ecommerce.entity.Payment;

@UiController("ecommerce_Payment.browse")
@UiDescriptor("payment-browse.xml")
@LookupComponent("paymentsTable")
@LoadDataBeforeShow
public class PaymentBrowse extends StandardLookup<Payment> {
}