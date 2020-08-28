package com.api.cliente.cliente.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.RepresentationModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cliente")
public class Cliente extends RepresentationModel<Cliente>{
	
	@Id
	@Column
	private Integer DNI;
	@Column
	private String nombre;
	@Column
	private String apellido;
	@Column
	private Integer telefono;
	@Column
	private String correoElectronico;
	

}
