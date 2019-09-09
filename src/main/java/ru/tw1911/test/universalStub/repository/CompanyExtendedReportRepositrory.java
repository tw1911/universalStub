package ru.tw1911.test.universalStub.repository;

import org.springframework.stereotype.Component;
import ru.tw1911.test.universalStub.model.CompanyExtendedReport;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

@Component
public class CompanyExtendedReportRepositrory {
    public static String convertToXmlString(Object object, Class clazz) {
        try {
            //Create JAXB Context
            JAXBContext jaxbContext = JAXBContext.newInstance(clazz);

            //Create Marshaller
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            //Required formatting??
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            //Print XML String to Console
            StringWriter sw = new StringWriter();

            //Write XML to StringWriter
            jaxbMarshaller.marshal(object, sw);

            //Verify XML Content
            String xmlContent = sw.toString();
            return xmlContent;
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    public CompanyExtendedReport findReport(String inn) {
        return new CompanyExtendedReport();
    }

}
