package com.jbgroup.poo.test;

import com.jbgroup.poo.herencia.abstracta.Cuadrado;
import com.jbgroup.poo.herencia.abstracta.Figura;

public class HerenciaAbstractaTest {

	public static void main(String[] args) {
		
		Cuadrado cuadrado = new Cuadrado(20);
		System.out.println("área del cuadrado: " + 
										cuadrado.calcularArea());
		Figura figura = new Cuadrado(20);
		System.out.println("área de la figura: " +
										figura.calcularArea());

	}

}










