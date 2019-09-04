package com.jbgroup.tdd;

import org.junit.Assert;
import org.junit.Test;


public class CuentaTest {
	
	@Test
	public void testMetodoIngresar500() {
		
		Cuenta cuenta = new Cuenta("carlos", 100);
		cuenta.ingresar(500);
		int valorObtenido = cuenta.getMonto();
		int valorEsperado = 600;
		
		Assert.assertEquals(valorEsperado, valorObtenido);
		
	}
	
	@Test
	public void testMetodoIngresarMenos100() {
		Cuenta cuenta = new Cuenta("alex", 250);
		cuenta.ingresar(-100);
		int valorObtenido = cuenta.getMonto();
		int valorEsperado = 250;
		
		Assert.assertEquals(valorEsperado, valorObtenido);
	}

}
















