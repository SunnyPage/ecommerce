package com.company.ecommerce.web.screens.category;

import com.haulmont.cuba.gui.screen.*;
import com.company.ecommerce.entity.Category;

@UiController("ecommerce_Category.edit")
@UiDescriptor("category-edit.xml")
@EditedEntityContainer("categoryDc")
@LoadDataBeforeShow
public class CategoryEdit extends StandardEditor<Category> {
}