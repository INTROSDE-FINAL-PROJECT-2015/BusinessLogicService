package introsde.models;



import java.util.Date;
import java.util.Calendar;
import java.util.List;
import javax.persistence.*;

import javax.xml.bind.annotation.XmlTransient;
import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;



@JsonPropertyOrder({ "idPerson", "firstname", "lastname", "birthday","dailyGoals","goals","currentHealth","healthHistory"})
public class Person implements Serializable {

  private int idPerson;
  private String firstname;
  private String lastname;
  private Date birthday;

	private List<Measure> healthHistory;
	private List<CurrentHealth> currentHealth;
	private List<Goal> goals;
	private List<DailyGoal> dailyGoals;

	public Person(){};

	public int getIdPerson() {
		return idPerson;
	}


	public void setIdPerson(int idPerson) {
		this.idPerson = idPerson;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public Date getBirthday() {
		return birthday;
	}


	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public List<CurrentHealth> getCurrentHealth(){
		return this.currentHealth;
	}

	public void setCurrentHealth(List<CurrentHealth> currentHealth){
		this.currentHealth = currentHealth;
	}

	public List<Measure> getMeasure(){
		return this.healthHistory;
	}

	public void setMeasure( List<Measure> healthHistory){
		this.healthHistory = healthHistory;
	}

	public List<Goal> getGoals(){
		return this.goals;
	}

	public void setGoals(List<Goal> goals){
		this.goals = goals;
	}

	public List<DailyGoal> getDailyGoals(){
		return this.dailyGoals;
	}

	public void setDailyGoals(List<DailyGoal> dailyGoals){
		this.dailyGoals = dailyGoals;
	}
	// performing method overload, this method id more user friendly for testing
	public void setBirthday(int day, int month, int year){
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DAY_OF_MONTH, day);
		this.birthday = cal.getTime();
	}
}
