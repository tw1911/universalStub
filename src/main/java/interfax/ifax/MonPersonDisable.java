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
 *         &lt;element name="fio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="snils" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="birthdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "fio",
        "snils",
        "inn",
        "birthdate"
})
@XmlRootElement(name = "MonPersonDisable")
public class MonPersonDisable {

    protected String fio;
    protected String snils;
    protected String inn;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthdate;

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
     * Gets the value of the snils property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSnils() {
        return snils;
    }

    /**
     * Sets the value of the snils property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSnils(String value) {
        this.snils = value;
    }

    /**
     * Gets the value of the inn property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getInn() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setInn(String value) {
        this.inn = value;
    }

    /**
     * Gets the value of the birthdate property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getBirthdate() {
        return birthdate;
    }

    /**
     * Sets the value of the birthdate property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setBirthdate(XMLGregorianCalendar value) {
        this.birthdate = value;
    }

}
