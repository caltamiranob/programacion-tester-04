package com.jbgroup.cadenas;

import org.junit.Assert;
import org.junit.Test;


public class CadenasTest {

	@Test
	public void testConcatenarConStringBuffer() {
		StringBuffer sbuffer = new StringBuffer();
		sbuffer.append("Libro ");
		sbuffer.append("de programación ");
		sbuffer.append("Java.");
		
		System.out.println("cadena concatenada: " + sbuffer.toString());
		
		String valorEsperado = "Libro de programación Java.";
		String valorObtenido = sbuffer.toString();
		
		Assert.assertEquals(valorEsperado, valorObtenido);
		
	}
	
	@Test
	public void testConcatenarConStringBuilder() {
		StringBuilder sbuilder = new StringBuilder();
		sbuilder.append("Libro ");
		sbuilder.append("de programación ");
		sbuilder.append("Java.");
		
		System.out.println("cadena concatenada: " + sbuilder.toString());
		
		String valorEsperado = "Libro de programación Java.";
		String valorObtenido = sbuilder.toString();
		
		Assert.assertEquals(valorEsperado, valorObtenido);
		
	}
	
}











