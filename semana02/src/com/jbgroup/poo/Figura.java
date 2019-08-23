package com.jbgroup.poo;

public class Figura {
	
	private String tipo;
	
	private double lado;
	
	private double radio;
	
	public double calcularArea() {
		
		if( "CUADRADO".equals(tipo)) {
			
			return lado * lado;
			
		} else if ("CIRCULO".equals(tipo)) {
			return radio * 3.14;
		}
		
		return 0;
		
	}
	

}
