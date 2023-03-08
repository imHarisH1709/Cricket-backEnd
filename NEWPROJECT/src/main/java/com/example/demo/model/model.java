package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cricket")
public class model {
	@Id
	private int sno;
	private String teamname;
	private String playername;
	private int ranking;
	private int rating;
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public model(int sno, String teamname, String playername, int ranking, int rating) {
		super();
		this.sno = sno;
		this.teamname = teamname;
		this.playername = playername;
		this.ranking = ranking;
		this.rating = rating;
	}
	public model() {
		
	}
	public String toString()
	{
		return "sno="+sno+"teamname="+teamname+"playername="+playername+"ranking="+ranking+"rating="+rating;
	}
}