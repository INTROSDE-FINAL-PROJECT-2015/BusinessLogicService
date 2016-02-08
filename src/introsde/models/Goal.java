package introsde.models;



import java.util.Date;
import java.util.Calendar;
import java.util.List;

import com.fasterxml.jackson.annotation.*;
import javax.xml.bind.annotation.XmlTransient;

import static java.lang.Math.toIntExact;


public class Goal{

		private int idGoal;
		private int idMeasureDefinition;
		private int idPerson;
		private String operator;
		private String value;
		private String reachDate;

		@JsonIgnore
		protected MeasureDefinition measureDefinition;


	public MeasureDefinition getMeasureDefinition(){
		return this.measureDefinition;
	}

	public void setMeasureDefinition(MeasureDefinition measureDefinition){
		this.measureDefinition = measureDefinition;
	}

	public int getIdGoal() {
		return idGoal;
	}

	public void setIdGoal(int idGoal) {
		this.idGoal = idGoal;
	}

	public int getIdMeasureDefinition() {
		return idMeasureDefinition;
	}

	public void setIdMeasureDefinition(int idMeasureDefinition) {
		this.idMeasureDefinition = idMeasureDefinition;
	}

	public int getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(int idPerson) {
		this.idPerson = idPerson;
	}

	public String getOperator(){
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getReachDate() {
		return reachDate;
	}

	public void setReachDate(String reachDate) {
		this.reachDate = reachDate;
	}

}
