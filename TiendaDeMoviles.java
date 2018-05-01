package Proyecto3EV;

public class TiendaDeMoviles {

	public static void main(String[] args) {
		boolean seguir=true;
		Gestion_Usuarios gu = new Gestion_Usuarios();
		ClaseLectura teclado = new ClaseLectura();
		String opcion;
		
	do {
		System.out.println("1 - Registrarse");
		System.out.println("2 - Login");
		System.out.println("3 - Administracion");
		opcion=teclado.LeerString();
		
			if(opcion.equalsIgnoreCase("1")) { //Apartado del Registro
					System.out.println("1 - Registrar Cliente");
					System.out.println("2 - Registrar Administrador");
					opcion=teclado.LeerString();
					
					if(opcion.equalsIgnoreCase("1")) { //Registrar Cliente
						gu.Pedir_Cliente();
					}
					else if(opcion.equalsIgnoreCase("2")) { //Registrar Administrador
						gu.Pedir_Administrador();
					}
			}
			else if (opcion.equalsIgnoreCase("2")) { //Apartado del Login
				
			}
			else if(opcion.equalsIgnoreCase("3")) {
				
			}
	}
	while(seguir);

	}

}
