package Proyecto3EV;

public class Gestion_Usuarios {

	public Gestion_Usuarios() {
		
	}
	
	protected void Pedir_Administrador(String nick, String password) { //M�todo para dar de alta a un administrador
		BD ss = new BD();
	
		Usuario a = new Administrador(nick, password);
		
		ss.InsertarAdministrador((Administrador) a);
	}
	
	protected void Pedir_Nick_Administrador() { //M�todo para borrar administrador
		ClaseLectura teclado = new ClaseLectura();
		String nick;
		BD ss = new BD();
		ss.ListadoAdministradores();
		System.out.println("Introduce Nick del Administrador");
		nick=teclado.LeerString();
		ss.BorrarAdministrador(nick);
	}
	
	protected void Pedir_Cliente(String nick, String password, String nombre, String apellido, String telefono, String correo) { //M�todo para dar de alta un Cliente
		Usuario c = new Cliente(nick, password, nombre, apellido, telefono, correo);	
		BD ss = new BD();
		ss.InsertarCliente((Cliente) c);
		
	}
	
	protected void Pedir_Nick_Cliente() { //M�todo para borrar un Cliente
		ClaseLectura teclado = new ClaseLectura();
		String nick;
		BD ss = new BD();
		ss.ListadoClientes();
		System.out.println("Introduce Nick del Cliente");
		nick=teclado.LeerString();
		ss.BorrarCliente(nick);
	}
	
	protected void LoginAdministrador(){
		ClaseLectura teclado = new ClaseLectura();
		System.out.println("Introduce Nick");
		String nick=teclado.LeerString();
		System.out.println("Introduce password");
		String password=teclado.LeerString();
		BD ss = new BD();
		
		if(!ss.ValidarAdmin(nick, password)){
			System.out.println("Error");
		}
		
	}
	
	protected void LoginCliente(String nick, String password, String correo){
			ClaseLectura teclado = new ClaseLectura();
			BD ss = new BD();
			Gestion_Compra gc = new Gestion_Compra();
			int precio;
		String opcion;
			Usuario c = new Cliente(nick, password, correo);
			do{
				System.out.println("1 - Comprar M�vil");
				System.out.println("2 - Modificar Datos");
				opcion=teclado.LeerString();
				}while(!opcion.equalsIgnoreCase("1") && !opcion.equalsIgnoreCase("2"));
			
			if(opcion.equalsIgnoreCase("1")){
				ss.ListadoMoviles();
				do{
					System.out.println("Introduce nombre del Movil");
					opcion=teclado.LeerString();
					if(!ss.ComprobarMovil(opcion)){
						System.out.println(" ");
						System.out.println("Movil inexistente");
					}
				}
				while(!ss.ComprobarMovil(opcion));
				System.out.println("Introduce precio de compra");
				precio=teclado.LeerInt();
				
				gc.ComprarMovil(c.getNick(), opcion, precio);
			}
		
	}
	
}
