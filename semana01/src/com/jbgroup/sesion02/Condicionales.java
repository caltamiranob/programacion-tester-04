package com.jbgroup.sesion02;

public class Condicionales {

	public static void main(String[] args) {
		
		testCondicionalMonedas("PEN");

	}
	
	public static void testCondicionalMonedas(String codigoMoneda) {

		if( codigoMoneda.equals("PEN") ) {
			
			System.out.println("SOLES");
			
		} else if ( codigoMoneda.equals("USD") ) {
			
			System.out.println("DOLARES");
			
		} else if ( codigoMoneda.equals("EUR") ) {
			
			System.out.println("EUROS");
			
		} else {
			
			System.out.println("No existe el codigo de moneda.");
			
		}
		
	}
	

}














