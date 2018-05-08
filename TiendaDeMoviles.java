package Proyecto3EV;

public class TiendaDeMoviles {

	public static void main(String[] args) {
		boolean seguir=true;
		Gestion_Usuarios gu = new Gestion_Usuarios();
		ClaseLectura teclado = new ClaseLectura();
		BD ss = new BD();
		String opcion;
		
	do {
		System.out.println("1 - Registrarse");
		System.out.println("2 - Login");
		System.out.println("3 - Salir");
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
						System.out.println("1 - Loggear Cliente");
						System.out.println("2 - Loggear Administrador");
						opcion=teclado.LeerString();
						
						if(opcion.equalsIgnoreCase("1")) { //Loggear Cliente
							while(!gu.LoginCliente()){
								System.out.println("Cliente inexistente y/o Contraseña incorrecta");
							}
							System.out.println("Loggin realizado con éxito");
							System.out.println("¿Qué movil quieres comprar?");
							ss.ListadoMoviles();
							
						}
						else if(opcion.equalsIgnoreCase("2")) { //Loggear administrador
							while(!gu.LoginAdministrador()){
								System.out.println("Administrador inexistente y/o Contraseña incorrecta");
							}
							System.out.println("Loggin realizado con éxito");
							
							System.out.println("1 - Ver clientes registrados");
							System.out.println("2 - Ver listado de móviles");
							System.out.println("3 - Borrar cliente");
							System.out.println("4 - Borrar Móvil");
							System.out.println("4 - Ver lis");
							
							
						}
			}
			else if(opcion.equalsIgnoreCase("3")){
				seguir=false;
			}
	
	}
	while(seguir);

	}

}
