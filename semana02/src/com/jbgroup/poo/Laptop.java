package com.jbgroup.poo;

public class Laptop {
	
	private String marca;
	
	private String tamanio;
	
	private String modelo;
	
	private double precio;
	

	public Laptop() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Laptop(String marca) {
		this.marca = marca;
	}

	public Laptop(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}


	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Laptop [marca=" + marca + ", tamanio=" + tamanio + ", modelo=" + modelo + ", precio=" + precio + "]";
	}
	

}














