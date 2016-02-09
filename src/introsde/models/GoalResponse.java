package introsde.models;



import java.util.Date;
import java.util.Calendar;
import java.util.List;

import com.fasterxml.jackson.annotation.*;
import javax.xml.bind.annotation.XmlTransient;



public class GoalResponse {

		private String reached;
		private String author;
		private String content;

    public GoalResponse(){}

		public GoalResponse(String reached, Song s){
			this.reached = reached;
			this.author = s.getTitle();
			this.content = s.getUri();
		}

		public GoalResponse(String reached, Quote q){
			this.reached = reached;
			this.author = q.getAuthor();
			this.content = q.getQuote();
		}

	public String getReached() {
		return reached;
	}

	public void setReached(String reached) {
		this.reached = reached;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
