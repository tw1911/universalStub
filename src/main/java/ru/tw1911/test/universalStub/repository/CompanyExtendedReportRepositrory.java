package ru.tw1911.test.universalStub.repository;

import org.springframework.stereotype.Component;
import ru.tw1911.test.universalStub.model.CompanyExtendedReport;

@Component
public class CompanyExtendedReportRepositrory {

    public CompanyExtendedReport findReport(String inn) {
        return new CompanyExtendedReport();
    }
}
