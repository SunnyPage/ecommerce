package com.company.ecommerce.web.screens.account;

import com.haulmont.cuba.gui.screen.*;
import com.company.ecommerce.entity.Account;

@UiController("ecommerce_Account.edit")
@UiDescriptor("account-edit.xml")
@EditedEntityContainer("accountDc")
@LoadDataBeforeShow
public class AccountEdit extends StandardEditor<Account> {
}