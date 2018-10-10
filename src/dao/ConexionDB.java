package dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

	private String driver = "com.mysql.jdbc.Driver";
	private String database = "asociacion";
	private String hostname ="10.90.36.34";
	private String port = "3306";
	private String url = "jdbc:mysql://"+hostname+":"+port+"/"+database+"?useSSL=false";
	private String username = "Usuario";
	private String password = "1234";	
	Statement sentencia=null;
	Connection conexion = null;
	ResultSet resultadoquery=null;
	
	private  Connection conectarMySQL() throws SQLException, ClassNotFoundException {
		
		    	
		   
			Class.forName(driver);
			 conexion = DriverManager.getConnection(url,username,password); 
		    
	
			return conexion;
	}
		 
		 
		 
	public boolean anadir(String query) throws SQLException, ClassNotFoundException{
		ConexionDB objetoconexion = new ConexionDB();
		conexion=objetoconexion.conectarMySQL();
		sentencia=conexion.createStatement();
		boolean resultado = sentencia.execute(query);
		conexion.close();
		return resultado;
	
}
	public boolean borrar(String query) throws SQLException, ClassNotFoundException{
		ConexionDB objetoconexion = new ConexionDB();
		conexion=objetoconexion.conectarMySQL();
		sentencia=conexion.createStatement();
		boolean resultado = sentencia.execute(query);
		conexion.close();
		return resultado;
		
	}
		

	public boolean modificar(String query) throws SQLException, ClassNotFoundException{
		ConexionDB objetoconexion = new ConexionDB();
		conexion=objetoconexion.conectarMySQL();
		sentencia=conexion.createStatement();
		int resultado = sentencia.executeUpdate(query);
		conexion.close();
		if(resultado!=0){
			return true;
		} else {
			return false;
		}
	}
	public ResultSet mostraranimal(String query)throws SQLException, ClassNotFoundException{
		ConexionDB objetoconexion = new ConexionDB();
		conexion=objetoconexion.conectarMySQL();
		sentencia=conexion.createStatement();
		resultadoquery = sentencia.executeQuery(query);
		conexion.close();
		if(resultadoquery!=null){
			return resultadoquery;		
		} else {
			return null;
		}
	
		
		
	}
}
