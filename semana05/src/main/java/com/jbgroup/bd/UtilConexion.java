package com.jbgroup.bd;

import java.sql.Connection;
import java.sql.DriverManager;

public class UtilConexion {
	
	
	public static Connection crearConexionBd() throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/jbgroup";
		String usuario = "root";
		String clave = "";
		
		//1. Cargar el Driver BD
		Class.forName("com.mysql.jdbc.Driver");
		
		//2. Obtener la conexion de BD
		Connection conexion =
				DriverManager
					.getConnection(url, usuario, clave);
		
		
		return conexion;
		
	}
	

}










