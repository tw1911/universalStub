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
 *         &lt;element name="sparkId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ogrnip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="leasingStatus" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "sparkId",
        "ogrnip",
        "inn",
        "leasingStatus"
})
@XmlRootElement(name = "GetEntrepreneurLeasings")
public class GetEntrepreneurLeasings {

    protected String sparkId;
    protected String ogrnip;
    protected String inn;
    protected int leasingStatus;

    /**
     * Gets the value of the sparkId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSparkId() {
        return sparkId;
    }

    /**
     * Sets the value of the sparkId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSparkId(String value) {
        this.sparkId = value;
    }

    /**
     * Gets the value of the ogrnip property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOgrnip() {
        return ogrnip;
    }

    /**
     * Sets the value of the ogrnip property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOgrnip(String value) {
        this.ogrnip = value;
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
     * Gets the value of the leasingStatus property.
     */
    public int getLeasingStatus() {
        return leasingStatus;
    }

    /**
     * Sets the value of the leasingStatus property.
     */
    public void setLeasingStatus(int value) {
        this.leasingStatus = value;
    }

}
