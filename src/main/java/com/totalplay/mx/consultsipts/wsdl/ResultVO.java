//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.17 a las 04:05:49 PM CDT 
//


package com.totalplay.mx.consultsipts.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultVO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bundles" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="consolidatedAccounts" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="devices" type="{http://bean.tpsms.tp.com.mx/}deviceVO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="responseVO" type="{http://bean.tpsms.tp.com.mx/}responseVO" minOccurs="0"/&gt;
 *         &lt;element name="routing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="suscriptorVO" type="{http://bean.tpsms.tp.com.mx/}suscriptorVO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultVO", propOrder = {
    "bundles",
    "consolidatedAccounts",
    "devices",
    "responseVO",
    "routing",
    "status",
    "suscriptorVO"
})
public class ResultVO {

    @XmlElement(nillable = true)
    protected List<String> bundles;
    @XmlElement(nillable = true)
    protected List<String> consolidatedAccounts;
    @XmlElement(nillable = true)
    protected List<DeviceVO> devices;
    protected ResponseVO responseVO;
    protected String routing;
    protected String status;
    protected SuscriptorVO suscriptorVO;

    /**
     * Gets the value of the bundles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bundles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBundles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBundles() {
        if (bundles == null) {
            bundles = new ArrayList<String>();
        }
        return this.bundles;
    }

    /**
     * Gets the value of the consolidatedAccounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consolidatedAccounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsolidatedAccounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getConsolidatedAccounts() {
        if (consolidatedAccounts == null) {
            consolidatedAccounts = new ArrayList<String>();
        }
        return this.consolidatedAccounts;
    }

    /**
     * Gets the value of the devices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the devices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDevices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceVO }
     * 
     * 
     */
    public List<DeviceVO> getDevices() {
        if (devices == null) {
            devices = new ArrayList<DeviceVO>();
        }
        return this.devices;
    }

    /**
     * Obtiene el valor de la propiedad responseVO.
     * 
     * @return
     *     possible object is
     *     {@link ResponseVO }
     *     
     */
    public ResponseVO getResponseVO() {
        return responseVO;
    }

    /**
     * Define el valor de la propiedad responseVO.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseVO }
     *     
     */
    public void setResponseVO(ResponseVO value) {
        this.responseVO = value;
    }

    /**
     * Obtiene el valor de la propiedad routing.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouting() {
        return routing;
    }

    /**
     * Define el valor de la propiedad routing.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouting(String value) {
        this.routing = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad suscriptorVO.
     * 
     * @return
     *     possible object is
     *     {@link SuscriptorVO }
     *     
     */
    public SuscriptorVO getSuscriptorVO() {
        return suscriptorVO;
    }

    /**
     * Define el valor de la propiedad suscriptorVO.
     * 
     * @param value
     *     allowed object is
     *     {@link SuscriptorVO }
     *     
     */
    public void setSuscriptorVO(SuscriptorVO value) {
        this.suscriptorVO = value;
    }

}
