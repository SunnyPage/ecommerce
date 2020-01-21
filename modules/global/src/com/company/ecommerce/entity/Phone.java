package com.company.ecommerce.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Table(name = "ECOMMERCE_PHONE")
@Entity(name = "ecommerce_Phone")
public class Phone extends StandardEntity {
    private static final long serialVersionUID = -6548855796415550153L;

    @Column(name = "NUMBER_", nullable = false)
    protected String number;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CUSTOMER_ID")
    protected Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}