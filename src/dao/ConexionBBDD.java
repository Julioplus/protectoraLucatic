package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBBDD {

	public String driver = "com.mysql.jdbc.Driver";
	public String database = "asociacion";
	public String hostname ="10.90.36.34";
	public String port = "3306";
	public String url = "jdbc:mysql://"+hostname+":"+port+"/"+database+"?useSSL=false";
	public String username = "Usuario";
	public String password = "1234";	

	 
	public  Connection conectarMySQL() {
		
		    Connection conexion = null;
			//Statement st=null;
			//ResultSet rs=null;
		    
		try {
			 Class.forName(driver);
			 conexion = DriverManager.getConnection(url,username,password); 
			 
		} catch(ClassNotFoundException | SQLException e) {
			
			 e.printStackTrace();
		}
			return conexion;
	}
		 
		 
		 
	public Object select(String query) {
			 
			 return "";	 
		 } 
	}


