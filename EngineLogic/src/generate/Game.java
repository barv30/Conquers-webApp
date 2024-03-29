//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.31 at 09:42:34 PM IDT 
//


package generate;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.math.BigInteger;


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
 *         &lt;element ref="{}Board"/>
 *         &lt;element ref="{}InitialFunds"/>
 *         &lt;element ref="{}Army"/>
 *         &lt;element ref="{}Territories"/>
 *       &lt;/all>
 *       &lt;attribute name="totalCycles" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
@XmlRootElement(name = "Game")
public class Game implements Serializable {

    @XmlElement(name = "Board", required = true)
    protected Board board;
    @XmlElement(name = "InitialFunds", required = true)
    protected BigInteger initialFunds;
    @XmlElement(name = "Army", required = true)
    protected Army army;
    @XmlElement(name = "Territories", required = true)
    protected Territories territories;
    @XmlAttribute(name = "totalCycles", required = true)
    protected BigInteger totalCycles;

    /**
     * Gets the value of the board property.
     * 
     * @return
     *     possible object is
     *     {@link Board }
     *     
     */
    public Board getBoard() {
        return board;
    }

    /**
     * Sets the value of the board property.
     * 
     * @param value
     *     allowed object is
     *     {@link Board }
     *     
     */
    public void setBoard(Board value) {
        this.board = value;
    }

    /**
     * Gets the value of the initialFunds property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInitialFunds() {
        return initialFunds;
    }

    /**
     * Sets the value of the initialFunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInitialFunds(BigInteger value) {
        this.initialFunds = value;
    }

    /**
     * Gets the value of the army property.
     * 
     * @return
     *     possible object is
     *     {@link Army }
     *     
     */
    public Army getArmy() {
        return army;
    }

    /**
     * Sets the value of the army property.
     * 
     * @param value
     *     allowed object is
     *     {@link Army }
     *     
     */
    public void setArmy(Army value) {
        this.army = value;
    }

    /**
     * Gets the value of the territories property.
     * 
     * @return
     *     possible object is
     *     {@link Territories }
     *     
     */
    public Territories getTerritories() {
        return territories;
    }

    /**
     * Sets the value of the territories property.
     * 
     * @param value
     *     allowed object is
     *     {@link Territories }
     *     
     */
    public void setTerritories(Territories value) {
        this.territories = value;
    }

    /**
     * Gets the value of the totalCycles property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalCycles() {
        return totalCycles;
    }

    /**
     * Sets the value of the totalCycles property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalCycles(BigInteger value) {
        this.totalCycles = value;
    }

}
