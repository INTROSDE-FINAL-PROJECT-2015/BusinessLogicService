package introsde.models;

import java.util.List;

import java.io.Serializable;

public class Score implements Serializable {
  private String total;
  private String reached;

  public Score(){}

  public Score(String total,String reached){
    this.total =  total;
    this.reached = reached;
  }

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getReached() {
		return reached;
	}

	public void setReached(String reached) {
		this.reached = reached;
	}
}
