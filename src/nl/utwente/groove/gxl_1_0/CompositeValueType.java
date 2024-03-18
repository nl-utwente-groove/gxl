//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.05.25 at 01:59:43 AM CEST 
//


package nl.utwente.groove.gxl_1_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompositeValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompositeValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;group ref="{http://www.gupro.de/GXL/gxl-1.0.dtd}value"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompositeValueType", propOrder = {
    "bagOrSetOrSeq"
})
@XmlSeeAlso({
    SetType.class,
    BagType.class,
    TupType.class,
    SeqType.class
})
public class CompositeValueType {

    @XmlElementRefs({
        @XmlElementRef(name = "int", namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", type = JAXBElement.class),
        @XmlElementRef(name = "bag", namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", type = JAXBElement.class),
        @XmlElementRef(name = "float", namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", type = JAXBElement.class),
        @XmlElementRef(name = "string", namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", type = JAXBElement.class),
        @XmlElementRef(name = "tup", namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", type = JAXBElement.class),
        @XmlElementRef(name = "locator", namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", type = JAXBElement.class),
        @XmlElementRef(name = "seq", namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", type = JAXBElement.class),
        @XmlElementRef(name = "enum", namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", type = JAXBElement.class),
        @XmlElementRef(name = "bool", namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", type = JAXBElement.class),
        @XmlElementRef(name = "set", namespace = "http://www.gupro.de/GXL/gxl-1.0.dtd", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> bagOrSetOrSeq;

    /**
     * Gets the value of the bagOrSetOrSeq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bagOrSetOrSeq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBagOrSetOrSeq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Float }{@code >}
     * {@link JAXBElement }{@code <}{@link BagType }{@code >}
     * {@link JAXBElement }{@code <}{@link TupType }{@code >}
     * {@link JAXBElement }{@code <}{@link SeqType }{@code >}
     * {@link JAXBElement }{@code <}{@link LocatorType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link SetType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getBagOrSetOrSeq() {
        if (bagOrSetOrSeq == null) {
            bagOrSetOrSeq = new ArrayList<JAXBElement<?>>();
        }
        return this.bagOrSetOrSeq;
    }

}