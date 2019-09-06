package com.jbgroup.statica;

import com.jbgroup.bd.CategoriaDao;

public class Categoria {

	private int id;
	
	private String descripcion;
	
	
	public Categoria() {
		// TODO Auto-generated constructor stub
	}

	
	public static void guardar() throws Exception {
		
		
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}
