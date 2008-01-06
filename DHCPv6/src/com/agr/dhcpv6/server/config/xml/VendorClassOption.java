//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.01.01 at 07:50:00 PM EST 
//


package com.agr.dhcpv6.server.config.xml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vendorClassOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vendorClassOption">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enterpriseNumber" type="{}enterpriseNumber"/>
 *         &lt;element name="vendorClasses" type="{}opaqueData" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="code" type="{}code" fixed="16" />
 *       &lt;attribute name="name" type="{}name" fixed="Vendor Class" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vendorClassOption", propOrder = {
    "enterpriseNumber",
    "vendorClasses"
})
public class VendorClassOption
    implements Serializable
{

    protected int enterpriseNumber;
    @XmlElement(required = true)
    protected List<OpaqueData> vendorClasses;
    @XmlAttribute
    protected Short code;
    @XmlAttribute
    protected String name;

    /**
     * Gets the value of the enterpriseNumber property.
     * 
     */
    public int getEnterpriseNumber() {
        return enterpriseNumber;
    }

    /**
     * Sets the value of the enterpriseNumber property.
     * 
     */
    public void setEnterpriseNumber(int value) {
        this.enterpriseNumber = value;
    }

    /**
     * Gets the value of the vendorClasses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorClasses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendorClasses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpaqueData }
     * 
     * 
     */
    public List<OpaqueData> getVendorClasses() {
        if (vendorClasses == null) {
            vendorClasses = new ArrayList<OpaqueData>();
        }
        return this.vendorClasses;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public short getCode() {
        if (code == null) {
            return ((short) 16);
        } else {
            return code;
        }
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCode(Short value) {
        this.code = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        if (name == null) {
            return "Vendor Class";
        } else {
            return name;
        }
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
