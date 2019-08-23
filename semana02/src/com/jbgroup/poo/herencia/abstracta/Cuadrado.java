package com.jbgroup.poo.herencia.abstracta;

public class Cuadrado extends Figura {

	private double lado;
	
	
	public Cuadrado(double lado) {
		this.lado = lado;
	}


	@Override
	public double calcularArea() {
		
		return this.lado * this.lado;
		
	}
	
	
}
