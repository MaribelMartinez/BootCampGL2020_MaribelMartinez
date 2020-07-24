package com.globallogic.app.estructurasbasicas;

public class StudentDetails {
	
	 public void studentAge() {
		 int age = 0;
		 age = age +5;
		 System.out.println("La edad del estudiante es: " +age);
	 }
	 
	 public void studentAge(int age) {
		 System.out.println("La edad del estudiante es: " +age);
	 }
	 
	 public static void main(String[] args) {
        StudentDetails estudiante = new StudentDetails();
        	estudiante.studentAge();
	        estudiante.studentAge(7);
	}
}
