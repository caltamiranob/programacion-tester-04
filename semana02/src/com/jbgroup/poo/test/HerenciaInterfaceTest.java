package com.jbgroup.poo.test;

import com.jbgroup.poo.herencia.interfaces.Circulo;
import com.jbgroup.poo.herencia.interfaces.Figura;

public class HerenciaInterfaceTest {

	public static void main(String[] args) {
		Circulo circulo = new Circulo(5);
		System.out.println("el área del circulo es: " + 
										circulo.calcularArea());
		
		Figura figura = new Circulo(5);
		System.out.println("el área de la figura es: " +
										figura.calcularArea());
		
	}

}








