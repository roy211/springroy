package com.ejemplo.rest;

import java.io.Serializable;

public class DireccionBO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7965645550189519265L;
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
