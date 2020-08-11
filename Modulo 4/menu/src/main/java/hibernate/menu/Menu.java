package hibernate.menu;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "menu")
public class Menu {

	@Id
	@Column(name = "id")
	private String id;

	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "precio")
	private Double precio;

	@Column(name = "descripcion")
	private String descripcion;


	public Menu(String id, String nombre, Double precio, String descripcion) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Menu() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String toString() {
		return "Nombre: "+ nombre + 
				" \nDescripcion: " + descripcion + 
				" \nPrecio: " + precio +"\n";
	}

}
