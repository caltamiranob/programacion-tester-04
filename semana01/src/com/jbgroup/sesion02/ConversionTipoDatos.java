package com.jbgroup.sesion02;

public class ConversionTipoDatos {

	public static void main(String[] args) {

		testConversionExplicita(); 
		testConversionImplicita();
		
	}
	
	public static void testConversionImplicita() {
		
		int numeroInt = 10;
		long numero = numeroInt;
		
		System.out.println("\nconversion implícita");
		System.out.println("--------------------");
		System.out.println("numeroInt: " + numeroInt);
		System.out.println("numero: " + numero);
		
	}
	
	public static void testConversionExplicita() {
		
		long numeroLong = 10;
		int numero = (int) numeroLong;
		
		System.out.println("conversion explícita");
		System.out.println("--------------------");
		System.out.println("numeroLong: " + numeroLong);
		System.out.println("numero: " + numero);
		
	}
	
	

}














