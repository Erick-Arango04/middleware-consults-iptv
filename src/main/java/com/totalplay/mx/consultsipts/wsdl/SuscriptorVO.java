//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.26 a las 01:21:46 PM CDT 
//


package com.totalplay.mx.consultsipts.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para suscriptorVO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="suscriptorVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountMain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="balance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idTypeContract" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="isConsolidate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isMain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isMonitoring" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isTest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mdnHome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regionId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sus_sty_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="zipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "suscriptorVO", propOrder = {
    "accountMain",
    "balance",
    "contract",
    "email",
    "firstName",
    "idTypeContract",
    "isConsolidate",
    "isMain",
    "isMonitoring",
    "isTest",
    "lastName",
    "latitude",
    "longitude",
    "mdnHome",
    "name",
    "regionId",
    "susStyId",
    "zipCode",
    "zone"
})
public class SuscriptorVO {

    protected String accountMain;
    protected String balance;
    protected String contract;
    protected String email;
    protected String firstName;
    protected int idTypeContract;
    protected String isConsolidate;
    protected String isMain;
    protected String isMonitoring;
    protected String isTest;
    protected String lastName;
    protected String latitude;
    protected String longitude;
    protected String mdnHome;
    protected String name;
    protected int regionId;
    @XmlElement(name = "sus_sty_id")
    protected int susStyId;
    protected String zipCode;
    protected String zone;

    /**
     * Obtiene el valor de la propiedad accountMain.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountMain() {
        return accountMain;
    }

    /**
     * Define el valor de la propiedad accountMain.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountMain(String value) {
        this.accountMain = value;
    }

    /**
     * Obtiene el valor de la propiedad balance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalance() {
        return balance;
    }

    /**
     * Define el valor de la propiedad balance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalance(String value) {
        this.balance = value;
    }

    /**
     * Obtiene el valor de la propiedad contract.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContract() {
        return contract;
    }

    /**
     * Define el valor de la propiedad contract.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContract(String value) {
        this.contract = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad firstName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Define el valor de la propiedad firstName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Obtiene el valor de la propiedad idTypeContract.
     * 
     */
    public int getIdTypeContract() {
        return idTypeContract;
    }

    /**
     * Define el valor de la propiedad idTypeContract.
     * 
     */
    public void setIdTypeContract(int value) {
        this.idTypeContract = value;
    }

    /**
     * Obtiene el valor de la propiedad isConsolidate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsConsolidate() {
        return isConsolidate;
    }

    /**
     * Define el valor de la propiedad isConsolidate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsConsolidate(String value) {
        this.isConsolidate = value;
    }

    /**
     * Obtiene el valor de la propiedad isMain.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsMain() {
        return isMain;
    }

    /**
     * Define el valor de la propiedad isMain.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsMain(String value) {
        this.isMain = value;
    }

    /**
     * Obtiene el valor de la propiedad isMonitoring.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsMonitoring() {
        return isMonitoring;
    }

    /**
     * Define el valor de la propiedad isMonitoring.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsMonitoring(String value) {
        this.isMonitoring = value;
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
     * Obtiene el valor de la propiedad lastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Define el valor de la propiedad lastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Obtiene el valor de la propiedad latitude.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * Define el valor de la propiedad latitude.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitude(String value) {
        this.latitude = value;
    }

    /**
     * Obtiene el valor de la propiedad longitude.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * Define el valor de la propiedad longitude.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitude(String value) {
        this.longitude = value;
    }

    /**
     * Obtiene el valor de la propiedad mdnHome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdnHome() {
        return mdnHome;
    }

    /**
     * Define el valor de la propiedad mdnHome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdnHome(String value) {
        this.mdnHome = value;
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
     * Obtiene el valor de la propiedad regionId.
     * 
     */
    public int getRegionId() {
        return regionId;
    }

    /**
     * Define el valor de la propiedad regionId.
     * 
     */
    public void setRegionId(int value) {
        this.regionId = value;
    }

    /**
     * Obtiene el valor de la propiedad susStyId.
     * 
     */
    public int getSusStyId() {
        return susStyId;
    }

    /**
     * Define el valor de la propiedad susStyId.
     * 
     */
    public void setSusStyId(int value) {
        this.susStyId = value;
    }

    /**
     * Obtiene el valor de la propiedad zipCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Define el valor de la propiedad zipCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

    /**
     * Obtiene el valor de la propiedad zone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZone() {
        return zone;
    }

    /**
     * Define el valor de la propiedad zone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZone(String value) {
        this.zone = value;
    }

}
