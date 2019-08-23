package com.jbgroup.poo.test;

import com.jbgroup.poo.herencia.simple.Alumno;

public class HerenciaSimpleTest {

	public static void main(String[] args) {
		
		String[] cursos = new String[] { "Matemática", "Física" };
		
		Alumno alumno = new Alumno();
		alumno.setDni("12345678");
		alumno.setApellidos("perez");
		alumno.setNombres("juan");
		alumno.setCiclo(6);
		alumno.setCursos(cursos);
		
		System.out.println(alumno.toString());
		
	}
	
}





