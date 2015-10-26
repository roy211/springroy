package com.ejemplo.rest.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class DireccionModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3682700456215666103L;
	private long id;
	private String texto;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	

}
