package com.company.ecommerce.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Table(name = "ECOMMERCE_ADDRESS")
@Entity(name = "ecommerce_Address")
public class Address extends StandardEntity {
    private static final long serialVersionUID = -2910784475161739455L;

    @OneToMany(mappedBy = "address")
    protected List<LineItem> lineItem;

    @OneToMany(mappedBy = "shipTo")
    protected List<Order> order;

    public List<Order> getOrder() {
        return order;
    }

    public void setOrder(List<Order> order) {
        this.order = order;
    }

    public List<LineItem> getLineItem() {
        return lineItem;
    }

    public void setLineItem(List<LineItem> lineItem) {
        this.lineItem = lineItem;
    }
}