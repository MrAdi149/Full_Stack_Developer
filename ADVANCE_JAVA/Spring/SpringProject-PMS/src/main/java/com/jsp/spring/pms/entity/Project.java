package com.jsp.spring.pms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	private String des;
	private String techStack;
	private double budget;
	private int teamStrength;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public String getTechStack() {
		return techStack;
	}
	public void setTechStack(String techStack) {
		this.techStack = techStack;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	public int getTeamStrength() {
		return teamStrength;
	}
	public void setTeamStrength(int teamStrength) {
		this.teamStrength = teamStrength;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", title=" + title + ", des=" + des + ", techStack=" + techStack + ", budget="
				+ budget + ", teamStrength=" + teamStrength + "]";
	}
	
	
	
	
	
	

}
