package com.company.ecommerce.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.PublishEntityChangedEvents;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@PublishEntityChangedEvents
@Table(name = "ECOMMERCE_ORDER")
@Entity(name = "ecommerce_Order")
public class Order extends StandardEntity {
    private static final long serialVersionUID = -7499539244319868765L;

    @Column(name = "ORDER_ID", nullable = false)
    protected String orderId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ORDERED", nullable = false)
    protected Date ordered;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "SHIPPED", nullable = false)
    protected Date shipped;

    @Column(name = "ORDER_STATUS", nullable = false)
    protected String orderStatus;

    @Column(name = "TOTAL")
    protected BigDecimal total;

    @OneToMany(mappedBy = "order")
    protected List<Payment> payment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ADDRESS_ID")
    protected Address address;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "order")
    protected List<LineItem> lineItem;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ACCOUNT_ID")
    protected Account account;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<LineItem> getLineItem() {
        return lineItem;
    }

    public void setLineItem(List<LineItem> lineItem) {
        this.lineItem = lineItem;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

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

    public OrderStatus getOrderStatus() {
        return orderStatus == null ? null : OrderStatus.fromId(orderStatus);
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.getId();
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