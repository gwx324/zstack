//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.19 at 08:36:39 PM CST 
//


package org.zstack.test.deployer.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConvergedOfferingConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConvergedOfferingConfig">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zstack.org/schema/zstack}InstanceOfferingConfig">
 *       &lt;sequence>
 *         &lt;element name="networkBandwidth" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="volumeBandwidth" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConvergedOfferingConfig", propOrder = {
    "networkBandwidth",
    "volumeBandwidth"
})
public class ConvergedOfferingConfig
    extends InstanceOfferingConfig
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long networkBandwidth;
    @XmlSchemaType(name = "unsignedInt")
    protected Long volumeBandwidth;

    /**
     * Gets the value of the networkBandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNetworkBandwidth() {
        return networkBandwidth;
    }

    /**
     * Sets the value of the networkBandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNetworkBandwidth(Long value) {
        this.networkBandwidth = value;
    }

    /**
     * Gets the value of the volumeBandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVolumeBandwidth() {
        return volumeBandwidth;
    }

    /**
     * Sets the value of the volumeBandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVolumeBandwidth(Long value) {
        this.volumeBandwidth = value;
    }

}
