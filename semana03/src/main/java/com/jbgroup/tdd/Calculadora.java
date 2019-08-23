package com.jbgroup.tdd;

public class Calculadora {

	public int sumar(int numeroUno, int numeroDos) {
		return numeroUno + numeroDos;
	}

	public int restar(int numeroUno, int numeroDos) {
		return numeroUno - numeroDos;
	}

	public int dividir(int numeroUno, int numeroDos) {
		if( numeroDos == 0) {
			return 0;
		}
		return numeroUno / numeroDos;
	}

}







