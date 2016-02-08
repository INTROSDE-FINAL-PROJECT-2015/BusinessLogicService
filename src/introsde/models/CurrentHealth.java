package introsde.models;


import javax.xml.bind.annotation.XmlTransient;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


public class CurrentHealth{

	private Measure healthMeasureHistory;
  private Person person;
  private String measureType;
  private String measureValue;
	private String measureValueType;
  private Date dateRegistered;
  private MeasureDefinition measureDefinition;

	//@XmlTransient

	public MeasureDefinition getMeasureDefinition() {
		return measureDefinition;
	}


	public void setMeasureDefinition(MeasureDefinition measureDefinition) {
		this.measureDefinition = measureDefinition;
	}


	public String getMeasureType() {
		return measureType;
	}


	public void setMeasureType(String measureType) {
		this.measureType = measureType;
	}


	public String getMeasureValue() {
		return measureValue;
	}


	public void setMeasureValue(String measureValue) {
		this.measureValue = measureValue;
	}

	public String getMeasureValueType() {
		return measureValueType;
	}


	public void setMeasureValueType(String measureValueType) {
		this.measureValueType = measureValueType;
	}


	public Date getDateRegistered() {
		return dateRegistered;
	}


	public void setDateRegistered(Date dateRegistered) {
		this.dateRegistered = dateRegistered;
	}
}
