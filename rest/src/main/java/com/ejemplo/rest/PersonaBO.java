package com.ejemplo.rest;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonaBO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3477532002827455171L;
	private String nombre;
	private String apellido;
	private Date fecha;
//	private String fecha;
	private DireccionBO  direccion;
	
	
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
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public DireccionBO getDireccion() {
		return direccion;
	}
	public void setDireccion(DireccionBO direccion) {
		this.direccion = direccion;
	}
/*	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}*/

	
	
}
