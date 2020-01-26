package com.company.ecommerce.web.screens.payment;

import com.haulmont.cuba.gui.screen.*;
import com.company.ecommerce.entity.Payment;

@UiController("ecommerce_Payment.edit")
@UiDescriptor("payment-edit.xml")
@EditedEntityContainer("paymentDc")
@LoadDataBeforeShow
public class PaymentEdit extends StandardEditor<Payment> {
}