package com.jbgroup.bd;

import java.util.List;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CategoriaDaoTest {
	
	private static int idCategoria = 0;
	
	@Test
	public void b_testMetodoObtener() {
		
		CategoriaDao categoriaDao = new CategoriaDao();
		
		try {
			
			Categoria categoria = categoriaDao.obtener(idCategoria);
			
			Assert.assertNotNull(categoria);
			
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
		
	}
	
	@Test
	public void c_testMetodoListar() {
		
		CategoriaDao categoriaDao = new CategoriaDao();
		
		try {
			
			List<Categoria> listaCategorias = categoriaDao.listar();
			
			Assert.assertTrue(listaCategorias.size() > 0 );
			
			for (Categoria categoria : listaCategorias) {
				System.out.println(categoria.getDescripcion());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
		
		
		
	}
	
	@Test
	public void a_testMetodoInsertar() {
		
		Categoria categoria = new Categoria("Zapatos");
		
		CategoriaDao categoriaDao = new CategoriaDao();
		
		try {
			
			idCategoria = categoriaDao.insertar(categoria);
			
			Assert.assertTrue( idCategoria > 0  );
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail();
		}
		
		
		
	}

}







