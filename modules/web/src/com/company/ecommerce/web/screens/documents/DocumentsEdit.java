package com.company.ecommerce.web.screens.documents;

import com.haulmont.cuba.gui.screen.*;
import com.company.ecommerce.entity.Documents;

@UiController("ecommerce_Documents.edit")
@UiDescriptor("documents-edit.xml")
@EditedEntityContainer("documentsDc")
@LoadDataBeforeShow
public class DocumentsEdit extends StandardEditor<Documents> {
}