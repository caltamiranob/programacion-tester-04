package com.jbgroup.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CategoriaDao {

	
	public int insertar(Categoria categoria) throws Exception {
		
		//1ro - Obtener una conexión
		Connection conexion = UtilConexion.crearConexionBd();
		
		//2do - Crear mi PreparedStatement (consulta SQL encapsulada)
		String sql = "INSERT INTO categoria(descripcion) VALUES (?)";
		
		PreparedStatement ps = 
				conexion.prepareStatement
						(sql, Statement.RETURN_GENERATED_KEYS);
		
		//3er - Reemplazar valores
		ps.setString(1, categoria.getDescripcion());
		
		//4to - Ejecutar Consulta
		// INSERT, DELETE, UPDATE -> executeUpdate
		// SELECT -> executeQuery
		ps.executeUpdate();
		
		//5to - Obtener resultados
		ResultSet resultados = ps.getGeneratedKeys();
		
		while( resultados.next() ) {
			
			return resultados.getInt(1);
			
		}
		
		return 0;
		
	}
	
}
















