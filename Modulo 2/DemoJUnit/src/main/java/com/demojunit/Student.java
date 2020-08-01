package com.demojunit;

import java.util.ArrayList;
import java.util.List;


public class Student {
	
	private String fullname;
	private String dni;
	private int age;
	private Gender gender;
	private List<Subject> subjects; 
	
	public Student(String fullname, String dni) {
		this.fullname = fullname;
		this.dni = dni;
		this.subjects = new ArrayList<Subject>();
	}
	
	public Student(String fullname, String dni, int age, Gender gender) {
		this.fullname = fullname;
		this.dni = dni;
		this.age = age;
		this.gender = gender;
		this.subjects = new ArrayList<Subject>();
	}
	
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
	
	public void addSubject(Subject subject) {
		this.getSubjects().add(subject);
	}
	
	//Retorna el curso con menor puntaje
	public Subject lowestScoreSubject() {
		double min = 99.9;
		Subject subject =  new Subject();
		 for(int i=0; i<this.getSubjects().size(); i++){
			if(this.getSubjects().get(i).getScore()<= min){
				min = getSubjects().get(i).getScore();
				subject = getSubjects().get(i);
			}
		}
		return subject; 
	}
	
	//retorna una lista con los codigos de materias desaprobadas
	public String[] failedSubjects(){
		String[] failedSubjects = new String[this.getSubjects().size()];
		for(int i=0; i<this.getSubjects().size(); i++) {
			if(!(this.getSubjects().get(i).isPassed())) {
				failedSubjects[i] = this.getSubjects().get(i).getCode();
			}
		}
		return failedSubjects;
	}
	
	//retorna true o false si la materia con el nombre pasado por parametro esta aprobada
	public boolean isSubjectPassed(String name) {
		boolean failed = false;
		for(int i=0; i<this.getSubjects().size(); i++) {
			if(this.getSubjects().get(i).getName() == name) {
				return(this.getSubjects().get(i).isPassed());
			}
		}
		return failed;
	}
	

}
