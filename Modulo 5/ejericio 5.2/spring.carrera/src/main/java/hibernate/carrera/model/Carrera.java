package hibernate.carrera.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "carrera")
public class Carrera {
	
	@Id
	@Column(name = "id")
	private String id;
	
	@Column(name="fecha")
	private Date fecha;
	
	@Column(name = "nombre")
	private String nombre;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Competidor> competidores;

	public Carrera() {
	}

	public Carrera(String id, Date fecha, String nombre, List<Competidor> competidores) {
		this.id = id;
		this.fecha = fecha;
		this.nombre = nombre;
		this.competidores = competidores;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public List<Competidor> getCompetidores() {
		return competidores;
	}


	public void setCompetidores(List<Competidor> competidores) {
		this.competidores = competidores;
	}


	public String toString() {
		
		return "{\"carrera\": \n"+
					"    \"fecha\": "+ fecha+
					"\n    \"nombre\": " +nombre +
					"\n    \"competidores\":" + competidores+
					"\n}";
		
	}

}
