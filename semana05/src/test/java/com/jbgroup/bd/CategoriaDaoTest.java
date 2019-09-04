package com.jbgroup.bd;

import org.junit.Assert;
import org.junit.Test;

public class CategoriaDaoTest {
	
	@Test
	public void testMetodoInsertar() {
		
		Categoria categoria = new Categoria("Zapatos");
		
		CategoriaDao categoriaDao = new CategoriaDao();
		
		try {
			
			int idGenerado = categoriaDao.insertar(categoria);
			
			Assert.assertTrue( idGenerado > 0  );
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail();
		}
		
		
		
	}

}







