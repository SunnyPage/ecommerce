package com.company.ecommerce.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "ECOMMERCE_PAYMENT")
@Entity(name = "ecommerce_Payment")
public class Payment extends StandardEntity {
    private static final long serialVersionUID = -575375710414365261L;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "PAID", nullable = false)
    protected Date paid;

    @Column(name = "TOTAL", nullable = false)
    protected BigDecimal total;

    @Column(name = "DATAILS")
    protected String datails;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ORDER_ID")
    protected Order order;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getDatails() {
        return datails;
    }

    public void setDatails(String datails) {
        this.datails = datails;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Date getPaid() {
        return paid;
    }

    public void setPaid(Date paid) {
        this.paid = paid;
    }
}