package com.company.ecommerce.web.screens.phone;

import com.haulmont.cuba.gui.screen.*;
import com.company.ecommerce.entity.Phone;

@UiController("ecommerce_Phone.browse")
@UiDescriptor("phone-browse.xml")
@LookupComponent("phonesTable")
@LoadDataBeforeShow
public class PhoneBrowse extends StandardLookup<Phone> {
}