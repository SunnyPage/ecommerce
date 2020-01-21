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
    protected List<Order> lineItem;

    public List<Order> getLineItem() {
        return lineItem;
    }

    public void setLineItem(List<Order> lineItem) {
        this.lineItem = lineItem;
    }
}