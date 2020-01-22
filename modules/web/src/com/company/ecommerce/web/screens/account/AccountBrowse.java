package com.company.ecommerce.web.screens.account;

import com.haulmont.cuba.gui.screen.*;
import com.company.ecommerce.entity.Account;

@UiController("ecommerce_Account.browse")
@UiDescriptor("account-browse.xml")
@LookupComponent("accountsTable")
@LoadDataBeforeShow
public class AccountBrowse extends StandardLookup<Account> {
}