package com.company.ecommerce.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.List;

@Table(name = "ECOMMERCE_ADDRESS")
@Entity(name = "ecommerce_Address")
public class Address extends StandardEntity {
    private static final long serialVersionUID = -2910784475161739455L;
    @OneToMany(mappedBy = "address")
    protected List<Order> lineItem;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CUSTOMER_ID")
    protected Customer customer;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ACCOUNT_ID")
    protected Account account;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Order> getLineItem() {
        return lineItem;
    }

    public void setLineItem(List<Order> lineItem) {
        this.lineItem = lineItem;
    }
}