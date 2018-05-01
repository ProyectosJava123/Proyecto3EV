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
						System.out.println("Loggear Cliente");
						System.out.println("Loggear Administrador");
						opcion=teclado.LeerString();
						
						if(opcion.equalsIgnoreCase("1")) { //Loggear Cliente
							while(!gu.LoginCliente()){
								System.out.println("Cliente existente y/o Contraseña incorrecta");
							}
							System.out.println("Loggin realizado con éxito");
							
							
					
							
						}
						else if(opcion.equalsIgnoreCase("2")) { //Loggear administrador
							while(!gu.LoginAdministrador()){
								System.out.println("Administrador existente y/o Contraseña incorrecta");
							}
							System.out.println("Loggin realizado con éxito");
						}
			}
	
	}
	while(seguir);

	}

}
