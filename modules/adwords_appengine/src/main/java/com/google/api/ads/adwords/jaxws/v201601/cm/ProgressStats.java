
package com.google.api.ads.adwords.jaxws.v201601.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Statistics on the progress of a {@code BatchJob}.
 *           
 * 
 * <p>Java class for ProgressStats complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProgressStats">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numOperationsExecuted" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numOperationsSucceeded" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="estimatedPercentExecuted" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numResultsWritten" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgressStats", propOrder = {
    "numOperationsExecuted",
    "numOperationsSucceeded",
    "estimatedPercentExecuted",
    "numResultsWritten"
})
public class ProgressStats {

    protected Long numOperationsExecuted;
    protected Long numOperationsSucceeded;
    protected Integer estimatedPercentExecuted;
    protected Long numResultsWritten;

    /**
     * Gets the value of the numOperationsExecuted property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumOperationsExecuted() {
        return numOperationsExecuted;
    }

    /**
     * Sets the value of the numOperationsExecuted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumOperationsExecuted(Long value) {
        this.numOperationsExecuted = value;
    }

    /**
     * Gets the value of the numOperationsSucceeded property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumOperationsSucceeded() {
        return numOperationsSucceeded;
    }

    /**
     * Sets the value of the numOperationsSucceeded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumOperationsSucceeded(Long value) {
        this.numOperationsSucceeded = value;
    }

    /**
     * Gets the value of the estimatedPercentExecuted property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEstimatedPercentExecuted() {
        return estimatedPercentExecuted;
    }

    /**
     * Sets the value of the estimatedPercentExecuted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEstimatedPercentExecuted(Integer value) {
        this.estimatedPercentExecuted = value;
    }

    /**
     * Gets the value of the numResultsWritten property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumResultsWritten() {
        return numResultsWritten;
    }

    /**
     * Sets the value of the numResultsWritten property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumResultsWritten(Long value) {
        this.numResultsWritten = value;
    }

}
