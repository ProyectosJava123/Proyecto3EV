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
		Gestion_Compra gc = new Gestion_Compra();
		BD ss = new BD();
		String nick, password, nombre, telefono, correo, apellido, opcion, movil;
		
		do{
			System.out.println("Introduce Nick");
			nick=teclado.LeerString();
			}
			while(ss.ComprobarCliente(nick));
		
		System.out.println("Introduce nueva Password");
		password=teclado.LeerString();
		
		System.out.println("Introduce nombre");
		nombre=teclado.LeerString();
		System.out.println("Introduce apellido");
		apellido=teclado.LeerString();
		System.out.println("Introduce telefono");
		telefono=teclado.LeerString();
		
		do{
		System.out.println("Introduce correo");
		correo=teclado.LeerString();
		}while(ss.ComprobarCorreo(correo));
		
		
		Usuario c = new Cliente(nick, password, nombre, apellido, telefono, correo);
		
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
	
	protected void LoginCliente(){
		ClaseLectura teclado = new ClaseLectura();
		String nick, password, correo, opcion, movil;
		BD ss = new BD();
		Gestion_Compra gc = new Gestion_Compra();
		do{
		System.out.println("Introduce correo");
		correo=teclado.LeerString();
		System.out.println("Introduce Nick");
		nick=teclado.LeerString();
		System.out.println("Introduce password");
		password=teclado.LeerString();
		if(!ss.ValidarCliente(nick, password, correo)){
			System.out.println("Error");
		}
		
		}while(!ss.ValidarCliente(nick, password, correo));
			
		do{
		System.out.println("1 - Comprar Movil");
		System.out.println("2 - Editar datos");
		opcion=teclado.LeerString();
		}while(!opcion.equalsIgnoreCase("1") && !opcion.equalsIgnoreCase("2"));
		
		if(opcion.equalsIgnoreCase("1")){
			ss.ListadoMoviles();
			System.out.println("Elige movil");
			movil=teclado.LeerString();
			System.out.println("Inserta Precio_Compra");
			int precio=teclado.LeerInt();
			gc.ComprarMovil(nick, movil, precio);
			
		} 
		
		
		
	}
	
}
