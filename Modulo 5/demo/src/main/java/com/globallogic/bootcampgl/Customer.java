package com.globallogic.bootcampgl;


public class Customer implements CommandLineRunner{
	
	
	private String name;
	private Integer dni;
	private Integer id;
	
	public String toString() {
		return "name "+name + 
				"\n id: "+id + 
				"\n dni:" +dni;
	}

	public Customer(String name, Integer dni, Integer id) {
		super();
		this.name = name;
		this.dni = dni;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
