package com.company.ecommerce.web.screens.subcategory;

import com.haulmont.cuba.gui.screen.*;
import com.company.ecommerce.entity.SubCategory;

@UiController("ecommerce_SubCategory.edit")
@UiDescriptor("sub-category-edit.xml")
@EditedEntityContainer("subCategoryDc")
@LoadDataBeforeShow
public class SubCategoryEdit extends StandardEditor<SubCategory> {
}