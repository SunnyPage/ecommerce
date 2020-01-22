package com.company.ecommerce.web.screens.address;

import com.haulmont.cuba.gui.screen.*;
import com.company.ecommerce.entity.Address;

@UiController("ecommerce_Address.edit")
@UiDescriptor("address-edit.xml")
@EditedEntityContainer("addressDc")
@LoadDataBeforeShow
public class AddressEdit extends StandardEditor<Address> {
}