package introsde.models;



import java.util.Date;
import java.util.Calendar;
import java.util.List;

import com.fasterxml.jackson.annotation.*;
import javax.xml.bind.annotation.XmlTransient;


import javax.xml.bind.annotation.XmlTransient;

import static java.lang.Math.toIntExact;


public class DailyGoal{

	private int idGoal;
  private int idPerson;
  private String value;
	private String question;
	private Person person;

	public DailyGoal(){}

	public int getIdGoal() {
		return idGoal;
	}

	public void setIdGoal(int idGoal) {
		this.idGoal = idGoal;
	}

	public int getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(int idPerson) {
		this.idPerson = idPerson;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	@XmlTransient
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
