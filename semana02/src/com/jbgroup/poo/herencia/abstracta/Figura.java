package com.jbgroup.poo.herencia.abstracta;

public abstract class Figura {

	
	protected int posicionX;
	
	protected int posicionY;
	
	public abstract double calcularArea();

	
	public void imprimirInformacion() {
		System.out.println(posicionX);
	}
	
}









