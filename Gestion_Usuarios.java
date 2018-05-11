package Proyecto3EV;

public class Gestion_Usuarios {

	public Gestion_Usuarios() {
		
	}
	
	protected void Pedir_Administrador(String nick, String password) { //Método para dar de alta a un administrador
		BD ss = new BD();
	
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
	
	protected void Pedir_Cliente(String nick, String password, String nombre, String apellido, String telefono, String correo) { //Método para dar de alta un Cliente
		Usuario c = new Cliente(nick, password, nombre, apellido, telefono, correo);	
		BD ss = new BD();
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
				System.out.println("1 - Comprar Móvil");
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
			} else if(opcion.equalsIgnoreCase("2")){
				do{
				System.out.println("¿Qué dato quieres modificar?");
				System.out.println("1 - Nombre");
				System.out.println("2 - Apellido");
				System.out.println("3 - Nick");
				System.out.println("4 - Correo");
				System.out.println("5 - Teléfono");
				opcion=teclado.LeerString();
				}while(!opcion.equalsIgnoreCase("1") && !opcion.equalsIgnoreCase("2") || !opcion.equalsIgnoreCase("3") || !opcion.equalsIgnoreCase("4") || !opcion.equalsIgnoreCase("5"));
				if(opcion.equalsIgnoreCase("1")){
					System.out.println("Introduce Nombre");
					
				}else if(opcion.equalsIgnoreCase("2")){
					System.out.println("Introduce Apellido");
					
				} else if(opcion.equalsIgnoreCase("3")){
					System.out.println("Introduce Nick");
				} else if(opcion.equalsIgnoreCase("4")){
					System.out.println("Introduce Correo");
				} else if(opcion.equalsIgnoreCase("5")){
					System.out.println("Introduce Telefono");
				}
			
			}
		
	}
	
}
