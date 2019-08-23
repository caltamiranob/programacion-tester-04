package com.jbgroup.sesion02;

public class Arreglos {

	public static void main(String[] args) {
		testArregloNumerosPares();
		testArregloNumerosParesFor();
		testArregloNumerosParesForEach();
	}
	
	public static void testArregloNumerosParesFor() {
		int[] numerosPares = { 2, 4, 6, 8, 10 };
		
		System.out.println("arreglo numeros pares (for)");
		System.out.println("-------------------------------");
		
		for (int posicion = 0; posicion < numerosPares.length; posicion++) {
			System.out.println(numerosPares[posicion]);
		}
		
	}
	
	public static void testArregloNumerosParesForEach() {
		
		int[] numerosPares = { 2, 4, 6, 8, 10 };
		
		System.out.println("arreglo numeros pares (foreach)");
		System.out.println("-------------------------------");
		
		for (int numero : numerosPares) {
			
			System.out.println(numero);
			
		}
		
	}
	
	public static void testArregloNumerosPares() {
		
		int[] numerosPares = { 2, 4, 6, 8, 10 };
		
		System.out.println("arreglo numeros pares");
		System.out.println("---------------------");
		
		System.out.println("numerosPares[0] = " + numerosPares[0]);
		System.out.println("numerosPares[1] = " + numerosPares[1]);
		System.out.println("numerosPares[2] = " + numerosPares[2]);
		System.out.println("numerosPares[3] = " + numerosPares[3]);
		
		
	}
	

}














