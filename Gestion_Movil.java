package Proyecto3EV;

public class Gestion_Movil {

	public Gestion_Movil() {
		
	}
	
	protected void Añadir_Movil() {
		ClaseLectura teclado = new ClaseLectura();
		String nombre, marca, nick;
		int stock, precio_salida;
		System.out.println("Inserta tu nick");
		nick=teclado.LeerString();
		System.out.println("Introduce Nombre");
		nombre=teclado.LeerString();
		System.out.println("Introduce Marca");
		marca=teclado.LeerString();
		System.out.println("Introduce Stock");
		stock=teclado.LeerInt();
		System.out.println("Introduce Precio_Salida");
		precio_salida=teclado.LeerInt();
		Movil m = new Movil(nombre, marca, stock, precio_salida);
		BD ss = new BD();
		
		ss.InsertarMovil(m, nick);
		
	}
	
}
