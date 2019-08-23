package com.jbgroup.sesion02;

public class Variables {

	public static void main(String[] args) {
		
		testOperadoresAritmeticos();
		testOperadoresPrecedenciaDerecha();
		testOperadoresPrecedenciaIzquierda();
	}
	
	public static void testOperadoresPrecedenciaIzquierda() {
		
		int numero = 20;
		System.out.println("\noperador de precedencia a la izquierda");
		System.out.println("------------------------------------");
		System.out.println(++numero);
		System.out.println(numero);
		
	}

	public static void testOperadoresPrecedenciaDerecha() {
		
		int numero = 20;
		System.out.println("\noperador de precedencia a la derecha");
		System.out.println("------------------------------------");
		System.out.println(numero++);
		System.out.println(numero);
		
	}
	
	public static void testOperadoresAritmeticos() {
		
		int numeroUno = 10;
		int numeroDos = 5;
		
		int suma = numeroUno + numeroDos;
		int resta = numeroUno - numeroDos;
		
		System.out.println("operadores aritmeticos");
		System.out.println("----------------------");
		System.out.println("suma: " + suma);
		System.out.println("resta: " + resta);
		
		
	}
	

}











