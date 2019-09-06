package com.jbgroup.excel;

import org.junit.Assert;
import org.junit.Test;

import com.jbgroup.bd.Categoria;
import com.jbgroup.bd.CategoriaDao;

public class UtilExcelTest {

	@Test
	public void testMetodoLeer() {
		
		try {
			String[][] datos = UtilExcel.leer();
			for(int fila = 0; fila < datos.length; fila++) {
				
				Categoria categoria = new Categoria();
				categoria.setId(datos[fila][0]);
				categoria.setDescripcion(datos[fila][1]);
				
				CategoriaDao dao = new CategoriaDao();
				dao.insertar(categoria);
				
				System.out.println(
						datos[fila][0] + 
						" - " + 
						datos[fila][1]);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
		
	}
	
}


