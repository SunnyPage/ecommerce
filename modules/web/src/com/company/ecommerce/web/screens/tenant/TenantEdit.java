package com.company.ecommerce.web.screens.tenant;

import com.haulmont.cuba.gui.screen.*;
import com.company.ecommerce.entity.Tenant;

@UiController("ecommerce_Tenant.edit")
@UiDescriptor("tenant-edit.xml")
@EditedEntityContainer("tenantDc")
@LoadDataBeforeShow
public class TenantEdit extends StandardEditor<Tenant> {
}