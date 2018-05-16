package Proyecto3EV;

import java.awt.EventQueue;


public class TiendaDeMoviles {

	public static void main(String[] args) {
		boolean seguir=true;
		Gestion_Usuarios gu = new Gestion_Usuarios();
		ClaseLectura teclado = new ClaseLectura();
		BD ss = new BD();
		String opcion;

			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						EntornoGrafico window = new EntornoGrafico();
						window.frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});

			/*
	do {
		do{
		System.out.println("1 - Registrarse");
		System.out.println("2 - Login");
		System.out.println("3 - Salir");
		opcion=teclado.LeerString();
		}while(!opcion.equalsIgnoreCase("1") && !opcion.equalsIgnoreCase("2") && !opcion.equalsIgnoreCase("3"));
		
			if(opcion.equalsIgnoreCase("1")) { //Apartado del Registro
					do{
					System.out.println("1 - Registrar Cliente");
					System.out.println("2 - Registrar Administrador");
					opcion=teclado.LeerString();
					}while(!opcion.equalsIgnoreCase("1") && !opcion.equalsIgnoreCase("2"));
					
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
							gu.LoginCliente();
						}
						else if(opcion.equalsIgnoreCase("2")) { //Loggear administrador
							/* while(!gu.LoginAdministrador()){
								System.out.println("Administrador inexistente y/o Contraseña incorrecta");
							} 
							System.out.println("Loggin realizado con éxito");
							System.out.println(" ");
							do{
							System.out.println("Borrar");
							System.out.println("Modificar");
							opcion=teclado.LeerString();
							}while(!opcion.equalsIgnoreCase("1") && !opcion.equalsIgnoreCase("2"));
							
							if(opcion.equalsIgnoreCase("1")){ //Borrar
								
							}
							else if(opcion.equalsIgnoreCase("2")){ //Modificar
								
							}
						}
			}
			else if(opcion.equalsIgnoreCase("3")){
				seguir=false;
				System.out.println("Fin del programa");
			} 
	
	}
	while(seguir); */
	}

}
