//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.09 at 11:05:08 AM MSK 
//


package interfax.ifax;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="regDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="regionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "regDate",
        "regionCode"
})
@XmlRootElement(name = "GetNewCompanies")
public class GetNewCompanies {

    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar regDate;
    protected String regionCode;

    /**
     * Gets the value of the regDate property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getRegDate() {
        return regDate;
    }

    /**
     * Sets the value of the regDate property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setRegDate(XMLGregorianCalendar value) {
        this.regDate = value;
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
