//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.10.11 at 08:41:06 PM IST 
//


package in.gov.uidai.authentication.uid_auth_request_data._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bioMetricType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="bioMetricType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FMR"/>
 *     &lt;enumeration value="FIR"/>
 *     &lt;enumeration value="IIR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "bioMetricType")
@XmlEnum
public enum BioMetricType {


    /**
     * Finger Minutiae
     *                          
     * 
     */
    FMR,

    /**
     * Finger Image
     *                          
     * 
     */
    FIR,

    /**
     * Iris Image
     *                          
     * 
     */
    IIR;

    public String value() {
        return name();
    }

    public static BioMetricType fromValue(String v) {
        return valueOf(v);
    }

}
