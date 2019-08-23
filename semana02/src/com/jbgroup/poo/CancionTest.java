package com.jbgroup.poo;

public class CancionTest {

	public static void main(String[] args) {
		Cancion objetoCancion = new Cancion();
		imprimirDatosCancion(objetoCancion);
		
		objetoCancion.setAutor("Autor1");
		objetoCancion.setTitulo("Titutlo1");
		
		imprimirDatosCancion(objetoCancion);

	}
	
	public static void imprimirDatosCancion(Cancion cancion) {
		
		System.out.println("datos canción");
		System.out.println("-------------");
		System.out.println(cancion.getAutor());
		System.out.println(cancion.getTitulo());
		
	}

}
