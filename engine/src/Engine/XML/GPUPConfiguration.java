
package Engine.XML;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element ref="{}GPUP-Graph-Name"/>
 *         &lt;element name="GPUP-Pricing">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="GPUP-Task" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="name" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="Simulation"/>
 *                                 &lt;enumeration value="Compilation"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="price-per-target" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "GPUP-Configuration")
public class GPUPConfiguration {

    @XmlElement(name = "GPUP-Graph-Name", required = true)
    protected String gpupGraphName;
    @XmlElement(name = "GPUP-Pricing", required = true)
    protected GPUPConfiguration.GPUPPricing gpupPricing;

    /**
     * Gets the value of the gpupGraphName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGPUPGraphName() {
        return gpupGraphName;
    }

    /**
     * Sets the value of the gpupGraphName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGPUPGraphName(String value) {
        this.gpupGraphName = value;
    }

    /**
     * Gets the value of the gpupPricing property.
     * 
     * @return
     *     possible object is
     *     {@link GPUPConfiguration.GPUPPricing }
     *     
     */
    public GPUPConfiguration.GPUPPricing getGPUPPricing() {
        return gpupPricing;
    }

    /**
     * Sets the value of the gpupPricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link GPUPConfiguration.GPUPPricing }
     *     
     */
    public void setGPUPPricing(GPUPConfiguration.GPUPPricing value) {
        this.gpupPricing = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="GPUP-Task" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="name" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="Simulation"/>
     *                       &lt;enumeration value="Compilation"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="price-per-target" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "gpupTask"
    })
    public static class GPUPPricing {

        @XmlElement(name = "GPUP-Task", required = true)
        protected List<GPUPConfiguration.GPUPPricing.GPUPTask> gpupTask;

        /**
         * Gets the value of the gpupTask property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the gpupTask property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGPUPTask().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GPUPConfiguration.GPUPPricing.GPUPTask }
         * 
         * 
         */
        public List<GPUPConfiguration.GPUPPricing.GPUPTask> getGPUPTask() {
            if (gpupTask == null) {
                gpupTask = new ArrayList<GPUPConfiguration.GPUPPricing.GPUPTask>();
            }
            return this.gpupTask;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="name" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="Simulation"/>
         *             &lt;enumeration value="Compilation"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="price-per-target" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class GPUPTask {

            @XmlAttribute(name = "name", required = true)
            protected String name;
            @XmlAttribute(name = "price-per-target", required = true)
            protected int pricePerTarget;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
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

            /**
             * Gets the value of the pricePerTarget property.
             * 
             */
            public int getPricePerTarget() {
                return pricePerTarget;
            }

            /**
             * Sets the value of the pricePerTarget property.
             * 
             */
            public void setPricePerTarget(int value) {
                this.pricePerTarget = value;
            }

        }

    }

}
