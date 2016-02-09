package introsde.models;


import java.util.Date;
import java.sql.Timestamp;

import javax.xml.bind.annotation.XmlTransient;

import java.util.List;
import javax.persistence.*;



public class Measure{

    private int idMeasureHistory;
    private String measureValue;
    private Date dateRegistered;
    //private Person person;
    private MeasureDefinition measureDefinition;

		public int getIdMeasureHistory() {
			return idMeasureHistory;
		}


		public void setIdMeasureHistory(int idMeasureHistory) {
			this.idMeasureHistory = idMeasureHistory;
		}


		public String getMeasureValue() {
			return measureValue;
		}


		public void setMeasureValue(String measureValue) {
			this.measureValue = measureValue;
		}


		public Date getDateRegistered() {
			return dateRegistered;
		}


		public void setDateRegistered(Date dateRegistered) {
			this.dateRegistered = dateRegistered;
		}

    public MeasureDefinition getMeasureDefinition() {
      return measureDefinition;
    }

    public void setMeasureDefinition(MeasureDefinition measureDefinition) {
      this.measureDefinition = measureDefinition;
    }

	}
