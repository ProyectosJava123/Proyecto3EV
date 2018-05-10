package Proyecto3EV;

public class Gestion_Compra {

	public Gestion_Compra(){
		
	}
	
	protected void ComprarMovil(String nick, String nombre, int precio){
		BD ss = new BD();
		ss.ComprarMovil(nick, nombre, precio);
	}
	
	
}
