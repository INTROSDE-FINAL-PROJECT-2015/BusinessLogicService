package introsde.models;

import java.io.Serializable;

import java.util.List;

public class Song implements Serializable {
  private String title;
  private String uri;

  public Song(){}

	public Song(List<String> song){
		this.title = song.get(1);
		this.uri = song.get(0);
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}

	@Override
	public String toString() {
		return "Song [title=" + title + ", uri=" + uri + "]";
	}
}
