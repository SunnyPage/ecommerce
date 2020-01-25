package com.company.ecommerce.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.global.AppBeans;
import com.haulmont.cuba.core.global.UserSessionSource;
import javax.validation.constraints.NotNull;

import javax.annotation.PostConstruct;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import java.util.UUID;

@MappedSuperclass
public class StandardTenantEntity extends StandardEntity {
    private static final long serialVersionUID = -6889134888252085007L;

    @NotNull
    @Column(name = "TENANT_ID", nullable = false)
    protected UUID tenantId;

    public UUID getTenantId() {
        return tenantId;
    }

    public void setTenantId(UUID tenantId) {
        this.tenantId = tenantId;
    }

    @PostConstruct
    protected void initTenantId() {

        UserSessionSource uss = AppBeans.get(UserSessionSource.NAME);

        UUID sessionTenantId = uss.getUserSession().getAttribute("tenantId");

        if (sessionTenantId == null) {
            throw new IllegalArgumentException("User has currently no tenant assigned. Entity instance cannot be created");
        }

        setTenantId(sessionTenantId);
    }
}