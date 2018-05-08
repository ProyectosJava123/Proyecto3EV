package Proyecto3EV;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionMYSQL {
	private static String servidor="jdbc:mysql://localhost:3306/tiendadb";
	private static String usuario="root";
	private static String pass="";
	private static String driver="com.mysql.jdbc.Driver";
	private static Connection MiConexion;
	
	public ConexionMYSQL() {
	
	try {
		Class.forName(driver);
		MiConexion=DriverManager.getConnection(servidor, usuario, pass);
	}
	catch(Exception e) {
		
		System.out.println("Error al realizar la conexión");
		
		e.printStackTrace();
	}
	
	}
	
	public Connection Conectar() {
		return MiConexion;
	}
	
	public void Desconectar() {
		MiConexion=null;
	}
}
