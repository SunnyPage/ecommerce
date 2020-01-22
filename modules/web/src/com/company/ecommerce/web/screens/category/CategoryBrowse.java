package com.company.ecommerce.web.screens.category;

import com.haulmont.cuba.gui.screen.*;
import com.company.ecommerce.entity.Category;

@UiController("ecommerce_Category.browse")
@UiDescriptor("category-browse.xml")
@LookupComponent("categoriesTable")
@LoadDataBeforeShow
public class CategoryBrowse extends StandardLookup<Category> {
}