package com.ejemplo.rest.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class PersonaModel implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2149338932343710959L;
	private String nombre;
	private String apellido;
	private Date fecha;
	private DireccionModel  direccion;
	
	
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
	public DireccionModel getDireccion() {
		return direccion;
	}
	public void setDireccion(DireccionModel direccion) {
		this.direccion = direccion;
	}
	
	
	
	

}
