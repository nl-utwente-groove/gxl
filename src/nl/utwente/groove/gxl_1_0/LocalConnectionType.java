//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.05.25 at 01:59:43 AM CEST 
//


package nl.utwente.groove.gxl_1_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocalConnectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocalConnectionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.gupro.de/GXL/gxl-1.0.dtd}GraphElementType">
 *       &lt;attribute name="isDirected" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalConnectionType")
@XmlSeeAlso({
    EdgeType.class,
    RelType.class
})
public class LocalConnectionType
    extends GraphElementType
{

    @XmlAttribute(name = "isDirected")
    protected Boolean isDirected;

    /**
     * Gets the value of the isDirected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDirected() {
        return isDirected;
    }

    /**
     * Sets the value of the isDirected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDirected(Boolean value) {
        this.isDirected = value;
    }

}
