package com.jbgroup.poo.herencia.simple;

import java.util.Arrays;

public class Alumno extends Persona {

	private String[] cursos;
	
	private int ciclo;
	
	public Alumno() {
		// TODO Auto-generated constructor stub
	}

	public String[] getCursos() {
		return cursos;
	}

	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}

	public int getCiclo() {
		return ciclo;
	}

	public void setCiclo(int ciclo) {
		this.ciclo = ciclo;
	}

	@Override
	public String toString() {
		return "Alumno [cursos=" + Arrays.toString(cursos) + ", ciclo=" + ciclo + ", getDni()=" + getDni()
				+ ", getApellidos()=" + getApellidos() + ", getNombres()=" + getNombres() + "]";
	}
	
	
	
}
