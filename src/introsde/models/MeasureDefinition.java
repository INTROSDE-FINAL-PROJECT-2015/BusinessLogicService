package introsde.models;

import java.util.List;
import javax.persistence.*;

import javax.xml.bind.annotation.XmlTransient;



//@JsonPropertyOrder({"idPerson","idGoal","operator","value","reachDate","idMeasureDefinition","measureDefinition"})
// TODO find the JSONTRANSIENT annotation

public class MeasureDefinition{

  private int idMeasureDefinition;
  private String measureType;
  private String measureValueType;

	public int getIdMeasureDefinition() {
		return idMeasureDefinition;
	}

	public void setIdMeasureDefinition(int idMeasureDefinition) {
		this.idMeasureDefinition = idMeasureDefinition;
	}

	public String getMeasureType() {
		return measureType;
	}

	public void setMeasureType(String measureType) {
		this.measureType = measureType;
	}

	//@XmlTransient
	public String getMeasureValueType() {
		return measureValueType;
	}

	public void setMeasureValueType(String measureValueType) {
		this.measureValueType = measureValueType;
	}
}
