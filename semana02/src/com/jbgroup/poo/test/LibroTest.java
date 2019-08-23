package com.jbgroup.poo.test;

import com.jbgroup.poo.Libro;

public class LibroTest {

	public static void main(String[] args) {
		
		Libro libro = new Libro();
		libro.setIsbn("CODIGO001");
		libro.setTitulo("Integración Continua");
		libro.setAutor("Martin Fowler");
		libro.setPaginas(390);
		
		System.out.println(libro.toString());

	}

}










