package ru.tw1911.test.universalStub.ws;

import interfax.ifax.GetCompanyExtendedReport;
import interfax.ifax.GetCompanyExtendedReportResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import ru.tw1911.test.universalStub.model.CompanyExtendedReport;
import ru.tw1911.test.universalStub.repository.CompanyExtendedReportRepositrory;

@Endpoint
public class SparkEndpoint {
    private static final String NAMESPACE_URI = "http://interfax.ru/ifax";

    @Autowired
    CompanyExtendedReportRepositrory companyExtendedReportRepositrory;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetCompanyExtendedReport")
    @ResponsePayload
    public GetCompanyExtendedReportResponse getCompanyExtendedReport(@RequestPayload GetCompanyExtendedReport request) {
        GetCompanyExtendedReportResponse response = new GetCompanyExtendedReportResponse();
        CompanyExtendedReport report = companyExtendedReportRepositrory.findReport(request.getInn());

        response.setXmlData(CompanyExtendedReportRepositrory.convertToXmlString(report, CompanyExtendedReport.class));
        response.setGetCompanyExtendedReportResult("somevalue");
        return response;
    }
}
