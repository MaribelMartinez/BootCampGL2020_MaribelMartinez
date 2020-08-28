package ar.com.gl.bootcamp.autor.autor.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "autor")
public class Autor {
	
	@Id
	private Integer id;
	
	private String nombre;
	private String nacionalidad;
	

}
