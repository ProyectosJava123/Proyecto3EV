package Proyecto3EV;

public class Gestion_Usuarios {

	public Gestion_Usuarios() {
		
	}
	
	protected void Pedir_Administrador(String nick, String password) { //Método para dar de alta a un administrador
		BD ss = new BD();
	
		Usuario a = new Administrador(nick, password);
		
		ss.InsertarAdministrador((Administrador) a);
	}
	
	protected void Pedir_Cliente(String nick, String password, String nombre, String apellido, String telefono, String correo) { //Método para dar de alta un Cliente
		Usuario c = new Cliente(nick, password, nombre, apellido, telefono, correo);	
		BD ss = new BD();
		ss.InsertarCliente((Cliente) c);
		
	}
	
	
}
