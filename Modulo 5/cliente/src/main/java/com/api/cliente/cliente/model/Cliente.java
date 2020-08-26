package com.api.cliente.cliente.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "cliente")
public class Cliente {
	
	@Id
	private Integer id;
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
