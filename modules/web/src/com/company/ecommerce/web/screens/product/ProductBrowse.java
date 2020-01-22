package com.company.ecommerce.web.screens.product;

import com.haulmont.cuba.gui.screen.*;
import com.company.ecommerce.entity.Product;

@UiController("ecommerce_Product.browse")
@UiDescriptor("product-browse.xml")
@LookupComponent("productsTable")
@LoadDataBeforeShow
public class ProductBrowse extends StandardLookup<Product> {
}