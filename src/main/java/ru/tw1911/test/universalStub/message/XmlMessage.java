package ru.tw1911.test.universalStub.message;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.*;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class XmlMessage {
    private Document document;

    public XmlMessage(Document document) {
        this.document = document;
        System.out.println(this.toString());
    }

    public XmlMessage(String xmlString) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = null;
            builder = factory.newDocumentBuilder();
            InputSource is = new InputSource(new StringReader(xmlString));
            Document doc = builder.parse(is);
            this.document = doc;
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String extractValueByXpath(String Xpath) {
        XPathFactory xPathfactory = XPathFactory.newInstance();
        XPath xpath = xPathfactory.newXPath();
        String result = null;
        try {
            XPathExpression expr = xpath.compile(Xpath);
            Node node = (Node) expr.evaluate(document, XPathConstants.NODE);
            if (node == null) {
                return null;
            } else if (node.getChildNodes().getLength() == 1) {
                return (String) expr.evaluate(document, XPathConstants.STRING);
            } else return nodeToString(node);

        } catch (XPathExpressionException e) {

        }
        return null;
    }

    @Override
    public String toString() {
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

    public String nodeToString(Node node) {
        StringWriter sw = new StringWriter();
        try {
            Transformer t = TransformerFactory.newInstance().newTransformer();
            t.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            t.setOutputProperty(OutputKeys.INDENT, "yes");
            t.transform(new DOMSource(node), new StreamResult(sw));
        } catch (TransformerException te) {
            System.out.println("nodeToString Transformer Exception");
        }
        return sw.toString();
    }
}
