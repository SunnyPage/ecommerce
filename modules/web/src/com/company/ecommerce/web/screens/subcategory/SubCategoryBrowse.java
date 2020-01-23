package com.company.ecommerce.web.screens.subcategory;

import com.haulmont.cuba.gui.screen.*;
import com.company.ecommerce.entity.SubCategory;

@UiController("ecommerce_SubCategory.browse")
@UiDescriptor("sub-category-browse.xml")
@LookupComponent("subCategoriesTable")
@LoadDataBeforeShow
public class SubCategoryBrowse extends StandardLookup<SubCategory> {
}