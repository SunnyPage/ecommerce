package com.company.ecommerce.service;

import com.haulmont.reports.entity.Report;

public interface ReportLoadService {
    String NAME = "ecommerce_ReportLoadService";

    Report loadReportBySystemcode(String systemCode);
}