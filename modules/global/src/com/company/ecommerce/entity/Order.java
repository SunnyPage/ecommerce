package com.company.ecommerce.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Table(name = "ECOMMERCE_ORDER")
@Entity(name = "ecommerce_Order")
public class Order extends StandardEntity {
    private static final long serialVersionUID = -7499539244319868765L;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ORDERED", nullable = false)
    protected Date ordered;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "SHIPPED", nullable = false)
    protected Date shipped;

    @OneToMany(mappedBy = "order")
    protected List<LineItem> lineItem;

    public List<LineItem> getLineItem() {
        return lineItem;
    }

    public void setLineItem(List<LineItem> lineItem) {
        this.lineItem = lineItem;
    }

    public Date getShipped() {
        return shipped;
    }

    public void setShipped(Date shipped) {
        this.shipped = shipped;
    }

    public Date getOrdered() {
        return ordered;
    }

    public void setOrdered(Date ordered) {
        this.ordered = ordered;
    }
}