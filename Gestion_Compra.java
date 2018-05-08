package Proyecto3EV;

public class Gestion_Compra {

	public Gestion_Compra(){
		
	}
	
	protected void ComprarMovil(){
		BD ss = new BD();
		ClaseLectura teclado = new ClaseLectura();
		String nombre, nick;
		ss.ListadoMoviles();
		System.out.println("Introduce móvil");
		nombre=teclado.LeerString();
		System.out.println("Introduce tu nick");
		nick=teclado.LeerString();
		Cliente c = new Cliente(nick);
		Movil m = new Movil(nombre);
	}
	
	protected void ModificarDatos(){
		
	}
	
}
