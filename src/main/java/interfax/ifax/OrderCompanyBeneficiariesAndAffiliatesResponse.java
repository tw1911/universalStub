//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.09 at 11:05:08 AM MSK 
//


package interfax.ifax;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderCompanyBeneficiariesAndAffiliatesResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmlData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "orderCompanyBeneficiariesAndAffiliatesResult",
        "xmlData"
})
@XmlRootElement(name = "OrderCompanyBeneficiariesAndAffiliatesResponse")
public class OrderCompanyBeneficiariesAndAffiliatesResponse {

    @XmlElement(name = "OrderCompanyBeneficiariesAndAffiliatesResult")
    protected String orderCompanyBeneficiariesAndAffiliatesResult;
    protected String xmlData;

    /**
     * Gets the value of the orderCompanyBeneficiariesAndAffiliatesResult property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOrderCompanyBeneficiariesAndAffiliatesResult() {
        return orderCompanyBeneficiariesAndAffiliatesResult;
    }

    /**
     * Sets the value of the orderCompanyBeneficiariesAndAffiliatesResult property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOrderCompanyBeneficiariesAndAffiliatesResult(String value) {
        this.orderCompanyBeneficiariesAndAffiliatesResult = value;
    }

    /**
     * Gets the value of the xmlData property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getXmlData() {
        return xmlData;
    }

    /**
     * Sets the value of the xmlData property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setXmlData(String value) {
        this.xmlData = value;
    }

}
