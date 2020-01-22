package com.company.ecommerce.web.screens.phone;

import com.haulmont.cuba.gui.screen.*;
import com.company.ecommerce.entity.Phone;

@UiController("ecommerce_Phone.edit")
@UiDescriptor("phone-edit.xml")
@EditedEntityContainer("phoneDc")
@LoadDataBeforeShow
public class PhoneEdit extends StandardEditor<Phone> {
}