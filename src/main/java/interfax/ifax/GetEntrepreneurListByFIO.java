//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.09 at 11:05:08 AM MSK 
//


package interfax.ifax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="fio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isActing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "fio",
        "isActing",
        "regionCode"
})
@XmlRootElement(name = "GetEntrepreneurListByFIO")
public class GetEntrepreneurListByFIO {

    protected String fio;
    protected String isActing;
    protected String regionCode;

    /**
     * Gets the value of the fio property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFio() {
        return fio;
    }

    /**
     * Sets the value of the fio property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFio(String value) {
        this.fio = value;
    }

    /**
     * Gets the value of the isActing property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIsActing() {
        return isActing;
    }

    /**
     * Sets the value of the isActing property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIsActing(String value) {
        this.isActing = value;
    }

    /**
     * Gets the value of the regionCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRegionCode() {
        return regionCode;
    }

    /**
     * Sets the value of the regionCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRegionCode(String value) {
        this.regionCode = value;
    }

}