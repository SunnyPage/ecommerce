package com.company.ecommerce.web.screens.product;

import com.haulmont.cuba.gui.screen.*;
import com.company.ecommerce.entity.Product;

@UiController("ecommerce_Product.edit")
@UiDescriptor("product-edit.xml")
@EditedEntityContainer("productDc")
@LoadDataBeforeShow
public class ProductEdit extends StandardEditor<Product> {
}