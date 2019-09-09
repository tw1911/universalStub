package ru.tw1911.test.universalStub.ws;

import interfax.ifax.GetCompanyExtendedReport;
import interfax.ifax.GetCompanyExtendedReportResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
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
        response.setXmlData(companyExtendedReportRepositrory.findReport(request.getInn()).getEscapedXML());
        response.setGetCompanyExtendedReportResult("somevalue");
        response.setXmlData("xmldata");
        return response;
    }
}
