//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.04 at 08:49:31 a. m. CDT 
//


package me.tell.ventas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *       &lt;sequence>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="precioU" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="enStock" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "nombre",
    "descripcion",
    "precioU",
    "enStock"
})
@XmlRootElement(name = "RealizarVentaRequest")
public class RealizarVentaRequest {

    @XmlElement(required = true)
    protected String nombre;
    @XmlElement(required = true)
    protected String descripcion;
    protected int precioU;
    @XmlElement(required = true)
    protected String enStock;

    /**
     * Gets the value of the nombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the descripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Sets the value of the descripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Gets the value of the precioU property.
     * 
     */
    public int getPrecioU() {
        return precioU;
    }

    /**
     * Sets the value of the precioU property.
     * 
     */
    public void setPrecioU(int value) {
        this.precioU = value;
    }

    /**
     * Gets the value of the enStock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnStock() {
        return enStock;
    }

    /**
     * Sets the value of the enStock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnStock(String value) {
        this.enStock = value;
    }

}
