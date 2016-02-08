package introsde.models;

import java.util.List;

import java.io.Serializable;

public class Quote implements Serializable{
  private String quote;
  private String author;

	public Quote(){};
	public Quote(List<String> quote){
		this.quote = quote.get(0);
		this.author = quote.get(1);
	}
	public String getQuote() {
		return quote;
	}
	public void setQuote(String quote) {
		this.quote = quote;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Quote [quote=" + quote + ", author=" + author + "]";
	}
}
