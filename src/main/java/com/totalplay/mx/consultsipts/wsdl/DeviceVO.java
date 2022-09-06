//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.26 a las 01:21:46 PM CDT 
//


package com.totalplay.mx.consultsipts.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para deviceVO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="deviceVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="esn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isDemo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isInternal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isTest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deviceVO", propOrder = {
    "alias",
    "esn",
    "isDemo",
    "isInternal",
    "isTest",
    "mac",
    "userAgent"
})
public class DeviceVO {

    protected String alias;
    protected String esn;
    protected String isDemo;
    protected String isInternal;
    protected String isTest;
    protected String mac;
    protected String userAgent;

    /**
     * Obtiene el valor de la propiedad alias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Define el valor de la propiedad alias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
    }

    /**
     * Obtiene el valor de la propiedad esn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsn() {
        return esn;
    }

    /**
     * Define el valor de la propiedad esn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsn(String value) {
        this.esn = value;
    }

    /**
     * Obtiene el valor de la propiedad isDemo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsDemo() {
        return isDemo;
    }

    /**
     * Define el valor de la propiedad isDemo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsDemo(String value) {
        this.isDemo = value;
    }

    /**
     * Obtiene el valor de la propiedad isInternal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsInternal() {
        return isInternal;
    }

    /**
     * Define el valor de la propiedad isInternal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsInternal(String value) {
        this.isInternal = value;
    }

    /**
     * Obtiene el valor de la propiedad isTest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsTest() {
        return isTest;
    }

    /**
     * Define el valor de la propiedad isTest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsTest(String value) {
        this.isTest = value;
    }

    /**
     * Obtiene el valor de la propiedad mac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMac() {
        return mac;
    }

    /**
     * Define el valor de la propiedad mac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMac(String value) {
        this.mac = value;
    }

    /**
     * Obtiene el valor de la propiedad userAgent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * Define el valor de la propiedad userAgent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserAgent(String value) {
        this.userAgent = value;
    }

}
