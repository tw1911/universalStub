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
 *         &lt;element name="companyCode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="linksDepthLevel1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="companyCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="linksDepthLevel2" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="linksMinSharePart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stateContractMinSum" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "companyCode1",
        "linksDepthLevel1",
        "companyCode2",
        "linksDepthLevel2",
        "linksMinSharePart",
        "stateContractMinSum"
})
@XmlRootElement(name = "OrderCompaniesLinksInStateContracts")
public class OrderCompaniesLinksInStateContracts {

    protected String companyCode1;
    protected int linksDepthLevel1;
    protected String companyCode2;
    protected int linksDepthLevel2;
    protected String linksMinSharePart;
    protected int stateContractMinSum;

    /**
     * Gets the value of the companyCode1 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCompanyCode1() {
        return companyCode1;
    }

    /**
     * Sets the value of the companyCode1 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCompanyCode1(String value) {
        this.companyCode1 = value;
    }

    /**
     * Gets the value of the linksDepthLevel1 property.
     */
    public int getLinksDepthLevel1() {
        return linksDepthLevel1;
    }

    /**
     * Sets the value of the linksDepthLevel1 property.
     */
    public void setLinksDepthLevel1(int value) {
        this.linksDepthLevel1 = value;
    }

    /**
     * Gets the value of the companyCode2 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCompanyCode2() {
        return companyCode2;
    }

    /**
     * Sets the value of the companyCode2 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCompanyCode2(String value) {
        this.companyCode2 = value;
    }

    /**
     * Gets the value of the linksDepthLevel2 property.
     */
    public int getLinksDepthLevel2() {
        return linksDepthLevel2;
    }

    /**
     * Sets the value of the linksDepthLevel2 property.
     */
    public void setLinksDepthLevel2(int value) {
        this.linksDepthLevel2 = value;
    }

    /**
     * Gets the value of the linksMinSharePart property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLinksMinSharePart() {
        return linksMinSharePart;
    }

    /**
     * Sets the value of the linksMinSharePart property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLinksMinSharePart(String value) {
        this.linksMinSharePart = value;
    }

    /**
     * Gets the value of the stateContractMinSum property.
     */
    public int getStateContractMinSum() {
        return stateContractMinSum;
    }

    /**
     * Sets the value of the stateContractMinSum property.
     */
    public void setStateContractMinSum(int value) {
        this.stateContractMinSum = value;
    }

}
