package Proyecto3EV;

public class Gestion_Usuarios {

	public Gestion_Usuarios() {
		
	}
	
	protected void Pedir_Administrador() { //Método para dar de alta a un administrador
		ClaseLectura teclado = new ClaseLectura();
		BD ss = new BD();
		String nick, password;
		
		do{
		System.out.println("Introduce Nick");
		nick=teclado.LeerString();
		}
		while(ss.ComprobarAdmin(nick));
		
		System.out.println("Introduce nueva Password");
		password=teclado.LeerString();
		Usuario a = new Administrador(nick, password);
		
		ss.InsertarAdministrador((Administrador) a);
	}
	
	protected void Pedir_Nick_Administrador() { //Método para borrar administrador
		ClaseLectura teclado = new ClaseLectura();
		String nick;
		BD ss = new BD();
		ss.ListadoAdministradores();
		System.out.println("Introduce Nick del Administrador");
		nick=teclado.LeerString();
		ss.BorrarAdministrador(nick);
	}
	
	protected void Pedir_Cliente() { //Método para dar de alta un Cliente
		ClaseLectura teclado = new ClaseLectura();
		BD ss = new BD();
		String nick, password;
		
		do{
		System.out.println("Introduce Nick");
		nick=teclado.LeerString();
		}
		while(ss.ComprobarCliente(nick));
		
		System.out.println("Introduce nueva Password");
		password=teclado.LeerString();
		Usuario c = new Cliente(nick, password);
		
		ss.InsertarCliente((Cliente) c);
	}
	
	protected void Pedir_Nick_Cliente() { //Método para borrar un Cliente
		ClaseLectura teclado = new ClaseLectura();
		String nick;
		BD ss = new BD();
		ss.ListadoClientes();
		System.out.println("Introduce Nick del Cliente");
		nick=teclado.LeerString();
		ss.BorrarCliente(nick);
	}
	
	protected boolean LoginAdministrador(){
		ClaseLectura teclado = new ClaseLectura();
		String nick, password;
		System.out.println("Introduce Nick");
		nick=teclado.LeerString();
		System.out.println("Introduce password");
		password=teclado.LeerString();
		BD ss = new BD();
		
		if(!ss.ValidarAdmin(nick, password)){
			return false;
		}
		else return true;
		
	}
	
	protected boolean LoginCliente(){
		ClaseLectura teclado = new ClaseLectura();
		String nick, password;
		System.out.println("Introduce Nick");
		nick=teclado.LeerString();
		System.out.println("Introduce password");
		password=teclado.LeerString();
		BD ss = new BD();
		
		if(!ss.ValidarCliente(nick, password)){
			return false;
		}
		else return true;
		
	}
	
}
