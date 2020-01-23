package com.company.ecommerce.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@NamePattern("%s|name")
@Table(name = "ECOMMERCE_SUB_CATEGORY")
@Entity(name = "ecommerce_SubCategory")
public class SubCategory extends StandardEntity {
    private static final long serialVersionUID = -3118219905889844854L;

    @Column(name = "NAME", nullable = false)
    protected String name;

    @OneToMany(mappedBy = "subCategory")
    protected List<Category> category;

    public List<Category> getCategory() {
        return category;
    }

    public void setCategory(List<Category> category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}