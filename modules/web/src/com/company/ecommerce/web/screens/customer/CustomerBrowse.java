package com.company.ecommerce.web.screens.customer;

import com.haulmont.cuba.gui.screen.*;
import com.company.ecommerce.entity.Customer;

@UiController("ecommerce_Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("customersTable")
@LoadDataBeforeShow
public class CustomerBrowse extends StandardLookup<Customer> {
}