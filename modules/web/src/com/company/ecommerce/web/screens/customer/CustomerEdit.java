package com.company.ecommerce.web.screens.customer;

import com.haulmont.cuba.gui.screen.*;
import com.company.ecommerce.entity.Customer;

@UiController("ecommerce_Customer.edit")
@UiDescriptor("customer-edit.xml")
@EditedEntityContainer("customerDc")
@LoadDataBeforeShow
public class CustomerEdit extends StandardEditor<Customer> {
}