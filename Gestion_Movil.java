package Proyecto3EV;

public class Gestion_Movil {

	public Gestion_Movil() {
		
	}
	
	protected void Añadir_Movil(String nombre, String marca, int stock, int precio_salida) {
		
		Movil m = new Movil(nombre, marca, stock, precio_salida);
		BD ss = new BD();
		
		ss.InsertarMovil(m);
	}
	
}
