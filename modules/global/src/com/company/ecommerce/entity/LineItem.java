package com.company.ecommerce.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.math.BigDecimal;

@Table(name = "ECOMMERCE_LINE_ITEM")
@Entity(name = "ecommerce_LineItem")
public class LineItem extends StandardEntity {
    private static final long serialVersionUID = 1495161714486601736L;

    @Column(name = "QUANTITY")
    protected Integer quantity;

    @Column(name = "PRICE")
    protected BigDecimal price;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ORDER_ID")
    protected Order order;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}