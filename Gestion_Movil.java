package Proyecto3EV;

public class Gestion_Movil {

	public Gestion_Movil() {
		
	}
	
	protected void A�adir_Movil(String nombre, String marca, int stock, int precio_salida) {
		
		Movil m = new Movil(nombre, marca, stock, precio_salida);
		BD ss = new BD();
		
		ss.InsertarMovil(m);
	}
	
}
