package com.company.ecommerce.web.screens.tenant;

import com.haulmont.cuba.gui.screen.*;
import com.company.ecommerce.entity.Tenant;

@UiController("ecommerce_Tenant.browse")
@UiDescriptor("tenant-browse.xml")
@LookupComponent("tenantsTable")
@LoadDataBeforeShow
public class TenantBrowse extends StandardLookup<Tenant> {
}