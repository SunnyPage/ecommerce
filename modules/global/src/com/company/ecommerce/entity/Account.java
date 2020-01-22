package com.company.ecommerce.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Table(name = "ECOMMERCE_ACCOUNT")
@Entity(name = "ecommerce_Account")
public class Account extends StandardEntity {
    private static final long serialVersionUID = 7835785188430963837L;

    @OneToMany(mappedBy = "account")
    protected List<Address> address;

    @Column(name = "ISCLOSED")
    protected Boolean isclosed;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "OPEN_", nullable = false)
    protected Date open;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CLOSED")
    protected Date closed;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CUSTOMER_ACCOUNT_ID")
    protected Account customerAccount;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PAYMENT_ID")
    protected Payment payment;

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Account getCustomerAccount() {
        return customerAccount;
    }

    public void setCustomerAccount(Account customerAccount) {
        this.customerAccount = customerAccount;
    }

    public Date getClosed() {
        return closed;
    }

    public void setClosed(Date closed) {
        this.closed = closed;
    }

    public Date getOpen() {
        return open;
    }

    public void setOpen(Date open) {
        this.open = open;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public Boolean getIsclosed() {
        return isclosed;
    }

    public void setIsclosed(Boolean isclosed) {
        this.isclosed = isclosed;
    }
}