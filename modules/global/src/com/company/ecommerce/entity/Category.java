package com.company.ecommerce.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.List;

@NamePattern("%s|name")
@Table(name = "ECOMMERCE_CATEGORY")
@Entity(name = "ecommerce_Category")
public class Category extends StandardEntity {
    private static final long serialVersionUID = 3504778757315142987L;

    @Column(name = "NAME", nullable = false)
    protected String name;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "SUB_CATEGORY_ID")
    protected SubCategory subCategory;

    @OneToMany(mappedBy = "category")
    protected List<Product> product;

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    public SubCategory getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(SubCategory subCategory) {
        this.subCategory = subCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}