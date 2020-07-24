package ar.com.globallogic.clasesyobjetosgl;

import java.util.Date;

public abstract class Persona {
	
	protected Integer DNI;
	protected String nombre;
	protected String apellido;
	private Date nacimiento;
	protected Integer numeroHijos;
	protected Boolean casado;
	
	public Integer getNumeroHijos() {
		return numeroHijos;
	}

	public void setNumeroHijos(Integer numeroHijos) {
		this.numeroHijos = numeroHijos;
	}

	public Boolean getCasado() {
		return casado;
	}

	public void setCasado(Boolean casado) {
		this.casado = casado;
	}

	public Persona() {
		
	}
	
	public Integer getDNI() {
		return DNI;
	}

	public void setDNI(Integer dNI) {
		DNI = dNI;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}

	public Persona(Integer DNI) {
		this.DNI = DNI;
	}
	
	protected abstract char estaCasado();
}
