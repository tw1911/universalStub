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
 *         &lt;element name="AuthmethodResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "authmethodResult"
})
@XmlRootElement(name = "AuthmethodResponse")
public class AuthmethodResponse {

    @XmlElement(name = "AuthmethodResult")
    protected String authmethodResult;

    /**
     * Gets the value of the authmethodResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthmethodResult() {
        return authmethodResult;
    }

    /**
     * Sets the value of the authmethodResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthmethodResult(String value) {
        this.authmethodResult = value;
    }

}