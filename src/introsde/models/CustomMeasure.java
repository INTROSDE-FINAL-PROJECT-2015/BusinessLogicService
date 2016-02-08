package introsde.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.fasterxml.jackson.annotation.*;
import java.io.Serializable;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "measure", propOrder = {
    "dateRegistered",
    "idMeasureHistory",
    "measureDefinition",
    "measureValue"
})
@JsonPropertyOrder({ "idMeasureHistory", "measureValue", "dateRegistered", "measureDefinition"})
public class CustomMeasure implements Serializable {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateRegistered;
    protected int idMeasureHistory;
    protected MeasureDefinition measureDefinition;
    protected String measureValue;

    public CustomMeasure(){}

    public CustomMeasure(MeasureDefinition md, String value){
        this.measureDefinition = md;
        this.measureValue = value;
    }

    public XMLGregorianCalendar getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(XMLGregorianCalendar value) {
        this.dateRegistered = value;
    }

    public int getIdMeasureHistory() {
        return idMeasureHistory;
    }


    public void setIdMeasureHistory(int value) {
        this.idMeasureHistory = value;
    }


    public MeasureDefinition getMeasureDefinition() {
        return measureDefinition;
    }


    public void setMeasureDefinition(MeasureDefinition value) {
        this.measureDefinition = value;
    }


    public String getMeasureValue() {
        return measureValue;
    }


    public void setMeasureValue(String value) {
        this.measureValue = value;
    }
}
