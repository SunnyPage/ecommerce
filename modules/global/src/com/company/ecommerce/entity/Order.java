package com.company.ecommerce.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.math.BigDecimal;
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

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "SHIP_TO_ID")
    protected Address shipTo;

    @Column(name = "ORDER_STATUS", nullable = false)
    protected String orderStatus;

    @Column(name = "TOTAL")
    protected BigDecimal total;

    @OneToMany(mappedBy = "order")
    protected List<Payment> payment;

    public List<Payment> getPayment() {
        return payment;
    }

    public void setPayment(List<Payment> payment) {
        this.payment = payment;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Address getShipTo() {
        return shipTo;
    }

    public void setShipTo(Address shipTo) {
        this.shipTo = shipTo;
    }


    public OrderStatus getOrderStatus() {
        return orderStatus == null ? null : OrderStatus.fromId(orderStatus);
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.getId();
    }

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