
package introsde.models;


import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.fasterxml.jackson.annotation.*;



/**
 * <p>Java class for person complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="person">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="birthday" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="currentHealth" type="{http://ws.introsde/}currentHealth" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dailyGoals" type="{http://ws.introsde/}dailyGoal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="goals" type="{http://ws.introsde/}goal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="idPerson" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="measure" type="{http://ws.introsde/}measure" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "person", propOrder = {
    "birthday",
    "currentHealth",
    "dailyGoals",
    "firstname",
    "goals",
    "idPerson",
    "lastname",
    "measure"
})
@JsonPropertyOrder({ "idPerson", "firstname", "lastname", "birthday","dailyGoals","goals","currentHealth","measure"})
public class Person1 implements Serializable {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthday;

    @XmlElement(nillable = true)
    protected List<CurrentHealth> currentHealth;
    @XmlElement(nillable = true)
    protected List<DailyGoal> dailyGoals;

    protected String firstname;

    @XmlElement(nillable = true)
    protected List<Goal> goals;

    protected int idPerson;

    protected String lastname;

    @XmlElement(nillable = true)
    protected List<Measure> measure;

    public Person1(){};

    /**
     * Gets the value of the birthday property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getBirthday() {
        return birthday;
    }

    /**
     * Sets the value of the birthday property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setBirthday(XMLGregorianCalendar value) {
        this.birthday = value;
    }

    /**
     * Gets the value of the currentHealth property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currentHealth property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrentHealth().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrentHealth }
     *
     *
     */
    public List<CurrentHealth> getCurrentHealth() {
        if (currentHealth == null) {
            currentHealth = new ArrayList<CurrentHealth>();
        }
        return this.currentHealth;
    }

    /**
     * Gets the value of the dailyGoals property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dailyGoals property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDailyGoals().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DailyGoal }
     *
     *
     */

    public List<DailyGoal> getDailyGoals() {
        if (dailyGoals == null) {
            dailyGoals = new ArrayList<DailyGoal>();
        }
        return this.dailyGoals;
    }

    /**
     * Gets the value of the firstname property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets the value of the firstname property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFirstname(String value) {
        this.firstname = value;
    }

    /**
     * Gets the value of the goals property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the goals property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoals().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Goal }
     *
     *
     */
    public List<Goal> getGoals() {
        if (goals == null) {
            goals = new ArrayList<Goal>();
        }
        return this.goals;
    }

    /**
     * Gets the value of the idPerson property.
     *
     */
    public int getIdPerson() {
        return idPerson;
    }

    /**
     * Sets the value of the idPerson property.
     *
     */
    public void setIdPerson(int value) {
        this.idPerson = value;
    }

    /**
     * Gets the value of the lastname property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the value of the lastname property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLastname(String value) {
        this.lastname = value;
    }

    /**
     * Gets the value of the measure property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measure property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasure().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Measure }
     *
     *
     */
    public List<Measure> getMeasure() {
        if (measure == null) {
            measure = new ArrayList<Measure>();
        }
        return this.measure;
    }

}
