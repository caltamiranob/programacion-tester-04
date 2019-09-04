package com.jbgroup.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
	
	public List<Categoria> listar() throws Exception {
		
		//1ro - Obtener una conexión
		Connection conexion = UtilConexion.crearConexionBd();
		
		//2do - Crear mi PreparedStatement (consulta SQL encapsulada)
		String sql = "SELECT * FROM categoria";
		
		PreparedStatement ps = 
				conexion.prepareStatement(sql);
		
		//4to - Ejecutar Consulta
		// INSERT, DELETE, UPDATE -> executeUpdate
		// SELECT -> executeQuery
		ps.executeQuery();
		
		//5to - Obtener resultados
		ResultSet resultados = ps.getResultSet();
		
		//creacion de lista de categorias
		List<Categoria> lista = new ArrayList<Categoria>();
		
		while( resultados.next() ) {
			
			Categoria categoria = new Categoria();
			categoria.setId(resultados.getInt(1));
			categoria.setDescripcion(resultados.getString(2));
			lista.add(categoria);
			
		}
		
		return lista;
		
	}
	
	public Categoria obtener(int id) throws Exception {
		
		//1ro - Obtener una conexión
		Connection conexion = UtilConexion.crearConexionBd();
		
		//2do - Crear mi PreparedStatement (consulta SQL encapsulada)
		String sql = "SELECT * FROM categoria WHERE id = ?";
		
		PreparedStatement ps = 
				conexion.prepareStatement(sql);
		
		//3er - Reemplazar Valores
		ps.setInt(1, id);
		
		//4to - Ejecutar Consulta
		// INSERT, DELETE, UPDATE -> executeUpdate
		// SELECT -> executeQuery
		ps.executeQuery();
		
		//5to - Obtener resultados
		ResultSet resultados = ps.getResultSet();
		
		while( resultados.next() ) {
			
			Categoria categoria = new Categoria();
			categoria.setId(resultados.getInt(1));
			categoria.setDescripcion(resultados.getString(2));
			
			return categoria;
			
		}
		
		return null;
		
	}
	
}



















