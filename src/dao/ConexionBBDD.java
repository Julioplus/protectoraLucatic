package dao;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBBDD {

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
		 
		 
		 
	public  boolean anadir(String query) throws SQLException, ClassNotFoundException{
		ConexionBBDD objetoconexion = new ConexionBBDD();
		conexion=objetoconexion.conectarMySQL();
		sentencia=conexion.createStatement();
		boolean resultado = sentencia.execute(query);
		if(resultado!=true){
			conexion.close();
			return true;
			}
		else{
			conexion.close();
		return false;
		
		}
	
}
	public boolean borrar(String query) throws SQLException, ClassNotFoundException{
		ConexionBBDD objetoconexion = new ConexionBBDD();
		conexion=objetoconexion.conectarMySQL();
		sentencia=conexion.createStatement();
		boolean resultado = sentencia.execute(query);
		if(resultado!=true){
			conexion.close();
			return true;
			}
		else{
			conexion.close();
		return false;
		
		}
		
		}
	public boolean modificar(String query) throws SQLException, ClassNotFoundException{
		ConexionBBDD objetoconexion = new ConexionBBDD();
		conexion=objetoconexion.conectarMySQL();
		sentencia=conexion.createStatement();
		int resultado = sentencia.executeUpdate(query);
		if(resultado!=0){
			conexion.close();
			return true;
			}
		else{
			conexion.close();
		return false;
		
		}
	}
	public String mostraranimal(String query)throws SQLException, ClassNotFoundException{
		ConexionBBDD objetoconexion = new ConexionBBDD();
		conexion=objetoconexion.conectarMySQL();
		sentencia=conexion.createStatement();
		resultadoquery = sentencia.executeQuery(query);
		ResultSetMetaData contarcolumnas = resultadoquery.getMetaData();
		int columnas = contarcolumnas.getColumnCount();
		if(resultadoquery!=null){
		while(resultadoquery.next()){
				for(int i=1;i<columnas;i++){
						//return "query=resultadoquery.getString(i)";
						
						}
				}
		conexion.close();
		return "";
		
		
		}
		
	
		
		
	}
	}