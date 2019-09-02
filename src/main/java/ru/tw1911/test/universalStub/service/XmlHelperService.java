package ru.tw1911.test.universalStub.service;

import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

@Service
public class XmlHelperService {
    public Document requestToDom(String request) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = null;
            builder = factory.newDocumentBuilder();
            InputSource is = new InputSource(new StringReader(request));
            Document doc = builder.parse(is);
            return doc;
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String domToResponse(Document document) {
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer trans = null;
        try {
            trans = tf.newTransformer();
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        }
        StringWriter sw = new StringWriter();
        try {
            trans.transform(new DOMSource(document), new StreamResult(sw));
        } catch (TransformerException e) {
            e.printStackTrace();
        }
        return sw.toString();
    }


}
