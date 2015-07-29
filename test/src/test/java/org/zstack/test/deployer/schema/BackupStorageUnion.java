//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.29 at 12:16:47 AM PDT 
//


package org.zstack.test.deployer.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BackupStorageUnion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BackupStorageUnion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="simulatorBackupStorage" type="{http://zstack.org/schema/zstack}SimulatorBackupStorageConfig" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sftpBackupStorage" type="{http://zstack.org/schema/zstack}SftpBackupStorageConfig" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BackupStorageUnion", propOrder = {
    "simulatorBackupStorage",
    "sftpBackupStorage"
})
public class BackupStorageUnion {

    protected List<SimulatorBackupStorageConfig> simulatorBackupStorage;
    protected List<SftpBackupStorageConfig> sftpBackupStorage;

    /**
     * Gets the value of the simulatorBackupStorage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the simulatorBackupStorage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimulatorBackupStorage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimulatorBackupStorageConfig }
     * 
     * 
     */
    public List<SimulatorBackupStorageConfig> getSimulatorBackupStorage() {
        if (simulatorBackupStorage == null) {
            simulatorBackupStorage = new ArrayList<SimulatorBackupStorageConfig>();
        }
        return this.simulatorBackupStorage;
    }

    /**
     * Gets the value of the sftpBackupStorage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sftpBackupStorage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSftpBackupStorage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SftpBackupStorageConfig }
     * 
     * 
     */
    public List<SftpBackupStorageConfig> getSftpBackupStorage() {
        if (sftpBackupStorage == null) {
            sftpBackupStorage = new ArrayList<SftpBackupStorageConfig>();
        }
        return this.sftpBackupStorage;
    }

}
