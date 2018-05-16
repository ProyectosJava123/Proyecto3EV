package Proyecto3EV;

public class Gestion_Compra {
	String nick;
	String nombre;
	public Gestion_Compra(){
		
	}
	public Gestion_Compra(String nick, String nombre){
		this.nick = nick;
		this.nombre = nombre;
	}

	protected void ComprarMovil(String nick, String nombre){
		BD ss = new BD();
		Gestion_Compra gc = new Gestion_Compra(nick, nombre);
		ss.ComprarMovil(gc.getNick(), gc.getNombre());
	}
	protected String getNick() {
		return nick;
	}
	protected void setNick(String nick) {
		this.nick = nick;
	}
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}	
	
}
