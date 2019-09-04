package com.jbgroup.tdd;

public class Cuenta {

	private String titular;
	
	private int monto;
	
	public Cuenta(String string, int i) {
		this.titular = string;
		this.monto = i;
	}

	public void ingresar(int i) {
		if(i > 0 ) {
			this.monto = this.monto + i;
		}
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}


}
