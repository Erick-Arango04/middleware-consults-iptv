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
 * <p>Clase Java para bundleNtflxVO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="bundleNtflxVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="main" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="planID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="screens" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="tmcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bundleNtflxVO", propOrder = {
    "main",
    "name",
    "planID",
    "screens",
    "tmcode"
})
public class BundleNtflxVO {

    protected String main;
    protected String name;
    protected String planID;
    protected int screens;
    protected String tmcode;

    /**
     * Obtiene el valor de la propiedad main.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMain() {
        return main;
    }

    /**
     * Define el valor de la propiedad main.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMain(String value) {
        this.main = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
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
     * Define el valor de la propiedad name.
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
     * Obtiene el valor de la propiedad planID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanID() {
        return planID;
    }

    /**
     * Define el valor de la propiedad planID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanID(String value) {
        this.planID = value;
    }

    /**
     * Obtiene el valor de la propiedad screens.
     * 
     */
    public int getScreens() {
        return screens;
    }

    /**
     * Define el valor de la propiedad screens.
     * 
     */
    public void setScreens(int value) {
        this.screens = value;
    }

    /**
     * Obtiene el valor de la propiedad tmcode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmcode() {
        return tmcode;
    }

    /**
     * Define el valor de la propiedad tmcode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTmcode(String value) {
        this.tmcode = value;
    }

}
