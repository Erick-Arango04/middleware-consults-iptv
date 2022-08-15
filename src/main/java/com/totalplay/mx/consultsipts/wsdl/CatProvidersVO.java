//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.12 a las 02:41:24 AM CDT 
//


package com.totalplay.mx.consultsipts.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para catProvidersVO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="catProvidersVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="providers" type="{http://bean.tpsms.tp.com.mx/}providersVO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="responseVO" type="{http://bean.tpsms.tp.com.mx/}responseVO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "catProvidersVO", propOrder = {
    "providers",
    "responseVO"
})
public class CatProvidersVO {

    @XmlElement(nillable = true)
    protected List<ProvidersVO> providers;
    protected ResponseVO responseVO;

    /**
     * Gets the value of the providers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the providers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProviders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProvidersVO }
     * 
     * 
     */
    public List<ProvidersVO> getProviders() {
        if (providers == null) {
            providers = new ArrayList<ProvidersVO>();
        }
        return this.providers;
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

}
