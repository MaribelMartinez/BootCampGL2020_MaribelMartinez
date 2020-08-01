package com.demojunit;

public class Subject {

	private String code;
	private String name;
	private double score;
	
	public Subject() {
		
	}
	
	public Subject(String code, String name, double score) {
		this.code = code;
		this.name = name;
		this.score = score;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
	public boolean isPassed() {
		return (this.getScore()> 4.0);
	}
	
}
