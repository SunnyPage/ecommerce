package com.company.ecommerce.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import java.util.UUID;

@MappedSuperclass
public class StandardTenantEntity extends StandardEntity {
    private static final long serialVersionUID = -6889134888252085007L;

    @Column(name = "TENANT_ID", nullable = false)
    protected UUID tenantId;

    public UUID getTenantId() {
        return tenantId;
    }

    public void setTenantId(UUID tenantId) {
        this.tenantId = tenantId;
    }
}