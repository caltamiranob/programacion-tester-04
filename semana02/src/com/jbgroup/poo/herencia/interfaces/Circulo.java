package com.jbgroup.poo.herencia.interfaces;

public class Circulo implements Figura {

	private double radio;
	
	
	public Circulo(double radio) {
		this.radio = radio;
	}

	@Override
	public double calcularArea() {
//		return (this.radio * this.radio) * 3.14;
		return Math.PI * Math.pow(this.radio, 2);
	}

	
}








