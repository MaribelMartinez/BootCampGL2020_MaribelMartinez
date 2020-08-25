package ar.com.gl.bootcampgl.vehiculo.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Vehiculo")
public class Vehiculo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	
	@Column(name = "identification",  nullable = false)
	private String identification;
	
	@ManyToOne( cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private TipoVehiculo tipo;
	
	@ManyToOne( cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Modelo modelo;
	
	@Column(name = "fechaProduccion")
	private Date fechaProduccion;
	
}
