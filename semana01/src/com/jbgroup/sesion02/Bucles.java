package com.jbgroup.sesion02;

public class Bucles {

	public static void main(String[] args) {
		
		testImprimirDel1Al100();
		
	}
	
	public static void testImprimirNumerosPares() {
		
		System.out.println("imprimir numeros pares del 1 al 100");
		System.out.println("-----------------------------------");
		
		for (int numero = 1; numero <= 100; numero++) {
			
			if( numeroEsPar(numero) ) {
				
				System.out.println(numero);
				
			}
			
		}
		
		
	}
	
	public static boolean numeroEsPar(int numero) {
		return (numero % 2 == 0);
	}
	
	
	public static void testImprimirDel1Al100() {

		System.out.println("imprimir numeros del 1 al 100");
		System.out.println("-----------------------------");
		
		for (int numero = 1; numero <= 100; numero++) {
			
			System.out.println(numero);
			
		}
		
	}
	
	
}

















