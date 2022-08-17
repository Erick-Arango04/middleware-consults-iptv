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
 * <p>Clase Java para providerVO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="providerVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="channels" type="{http://bean.tpsms.tp.com.mx/}channelVO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="nameProvider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "providerVO", propOrder = {
    "channels",
    "nameProvider"
})
public class ProviderVO {

    @XmlElement(nillable = true)
    protected List<ChannelVO> channels;
    protected String nameProvider;

    /**
     * Gets the value of the channels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the channels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChannels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChannelVO }
     * 
     * 
     */
    public List<ChannelVO> getChannels() {
        if (channels == null) {
            channels = new ArrayList<ChannelVO>();
        }
        return this.channels;
    }

    /**
     * Obtiene el valor de la propiedad nameProvider.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameProvider() {
        return nameProvider;
    }

    /**
     * Define el valor de la propiedad nameProvider.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameProvider(String value) {
        this.nameProvider = value;
    }

}
