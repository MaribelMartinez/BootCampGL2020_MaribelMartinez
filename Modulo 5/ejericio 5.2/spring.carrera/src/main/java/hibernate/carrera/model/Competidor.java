package hibernate.carrera.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "competidor")
public class Competidor {

	@Id
	@Column(name = "id")
	private String id;

	@Column(name = "numero")
	private Integer numero;

	@Column(name = "nombre")
	private String nombre;

	public Competidor() {
	}

	public Competidor(String id, Integer numero, String nombre) {
		this.id = id;
		this.numero = numero;
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	
	}
	
	public String toString() {
		
		return "\n       {\"numero\": "+numero+" \"nombre\": "+nombre+"}";
		
	}

}
