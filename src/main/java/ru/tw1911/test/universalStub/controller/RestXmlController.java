package ru.tw1911.test.universalStub.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.tw1911.test.universalStub.message.XmlMessage;
import ru.tw1911.test.universalStub.service.XmlHelperService;

import java.util.Map;

@Controller
@RequestMapping("/getSometh")
public class RestXmlController {

    Logger logger = LoggerFactory.getLogger(RestXmlController.class);

    @Autowired
    private XmlHelperService xmlHelperService;

    @RequestMapping(method = RequestMethod.POST,
            produces = MediaType.APPLICATION_XML_VALUE)
    public @ResponseBody
    String getSometh(@RequestBody String requestBody, @RequestHeader Map<String, String> headers) {
        logger.info(requestBody);
        XmlMessage message = new XmlMessage(xmlHelperService.requestToDom(requestBody));
        logger.info("Parameter value: " + message.extractValueByXpath("/*[local-name()='Envelope']/*[local-name()='Body']/*[local-name()='GetQuotationResponse']/*[local-name()='Quotation']"));
        logger.info("Parameter value: " + message.extractValueByXpath("/*[local-name()='Envelope']/*[local-name()='Body']/*[local-name()='GetQuotationResponse']"));
        logger.info("Parameter value: " + message.extractValueByXpath("/*[local-name()='Envelope']/*[local-name()='Body']"));
        logger.info("Parameter value: " + message.extractValueByXpath("/*[local-name()='Envelope']"));
        return message.toString();
    }


}
