//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.27 at 06:23:03 PM EEST 
//


package gr.ntua.ivml.mint.uim.messages.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetImportsAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetImportsAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="GetImportsCommand" type="{}GetImportsCommand"/>
 *         &lt;element name="GetImportsResponse" type="{}GetImportsResponse"/>
 *         &lt;element name="error" type="{}ErrorResponse"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetImportsAction", propOrder = {
    "getImportsCommand",
    "getImportsResponse",
    "error"
})
public class GetImportsAction {

    @XmlElement(name = "GetImportsCommand")
    protected GetImportsCommand getImportsCommand;
    @XmlElement(name = "GetImportsResponse")
    protected GetImportsResponse getImportsResponse;
    protected ErrorResponse error;

    /**
     * Gets the value of the getImportsCommand property.
     * 
     * @return
     *     possible object is
     *     {@link GetImportsCommand }
     *     
     */
    public GetImportsCommand getGetImportsCommand() {
        return getImportsCommand;
    }

    /**
     * Sets the value of the getImportsCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetImportsCommand }
     *     
     */
    public void setGetImportsCommand(GetImportsCommand value) {
        this.getImportsCommand = value;
    }

    /**
     * Gets the value of the getImportsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GetImportsResponse }
     *     
     */
    public GetImportsResponse getGetImportsResponse() {
        return getImportsResponse;
    }

    /**
     * Sets the value of the getImportsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetImportsResponse }
     *     
     */
    public void setGetImportsResponse(GetImportsResponse value) {
        this.getImportsResponse = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorResponse }
     *     
     */
    public ErrorResponse getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorResponse }
     *     
     */
    public void setError(ErrorResponse value) {
        this.error = value;
    }

}
