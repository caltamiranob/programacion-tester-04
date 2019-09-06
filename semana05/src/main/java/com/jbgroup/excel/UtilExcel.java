package com.jbgroup.excel;

import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UtilExcel {

	public static String[][] leer() throws Exception {
		
		//1. Cargar el libro de trabajo
		Workbook libroTrabajo = 
				new XSSFWorkbook("/home/carlos/categorias.xlsx");
		
		//2. Seleccionar la hoja
		Sheet hoja = libroTrabajo.getSheetAt(0);
		
		//3. Leer las filas
		Iterator<Row> filas = hoja.rowIterator();
		
		filas.next();
		
		//4. Declaramos nuestro arreglo
		String[][] datos = new String[hoja.getLastRowNum()][2];
		
		int posicionFila = 0;
		
		while( filas.hasNext() ) {
			
			Row fila = filas.next();
			
			Iterator<Cell> celdas = fila.cellIterator();
			
			//obtengo el valor de la primera celda
			Cell celda = celdas.next();
			datos[posicionFila][0] = 
					String.valueOf(celda.getNumericCellValue());
			
			//obtengo el valor de la segunda celda
			celda = celdas.next();
			datos[posicionFila][1] = celda.getStringCellValue();
			
			posicionFila++;
			
			
			
//			while( celdas.hasNext() ) {
//				
//				Cell celda = celdas.next();
//				
//				switch (celda.getCellType()) {
//					case NUMERIC:
//						System.out.println(celda.getNumericCellValue());
//						break;
//						
//					case STRING:
//						System.out.println(celda.getStringCellValue());
//						break;
//						
//					default:
//						break;
//				}
//				
//				
//			}
			
		}
		
		libroTrabajo.close();
		
		return datos;
		
	}
	
	
}






