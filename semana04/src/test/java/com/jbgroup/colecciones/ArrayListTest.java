package com.jbgroup.colecciones;

import java.util.ArrayList;

import org.junit.Test;

import com.jbgroup.bd.Categoria;

public class ArrayListTest {
	
	@Test
	public void testListarArrayList() {
		
		Categoria categoria1 = new Categoria();
		categoria1.setDescripcion("Polos");
		
		Categoria categoria2 = new Categoria();
		categoria2.setDescripcion("Zapatillas");
		
		ArrayList<Categoria> categorias = new ArrayList<Categoria>();
		categorias.add(categoria1);
		categorias.add(categoria2);
		
		for (Categoria categoria : categorias) {
			System.out.println("id: " + categoria.getId());
			System.out.println("descripcion: " + categoria.getDescripcion());
		}
		
		System.out.println("Tamaño de lista: " + categorias.size());
		
	}

}












