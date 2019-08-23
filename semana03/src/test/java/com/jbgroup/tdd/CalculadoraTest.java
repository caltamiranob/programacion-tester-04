package com.jbgroup.tdd;

import org.junit.Assert;
import org.junit.Test;


public class CalculadoraTest {

	@Test
	public void testSumarCincoyDiez() {
		
		Calculadora calculadora = new Calculadora();
		
		int resultadoObtenido = calculadora.sumar(5, 10);
		
		int resultadoEsperado = 15;
		
		Assert.assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	@Test
	public void testRestarOchoyCuatro() {
		
		Calculadora calculadora = new Calculadora();
		
		int resultadoObtenido = calculadora.restar(8, 4);
		
		int resultadoEsperado = 4;
		
		Assert.assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	@Test
	public void dividirDiezyDos() {
		
		Calculadora calculadora = new Calculadora();
		
		int resultadoObtenido = calculadora.dividir(10, 2);
		
		int resultadoEsperado = 5;
		
		Assert.assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
}























