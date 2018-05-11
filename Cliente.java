package Proyecto3EV;

public class Cliente extends Usuario{
	String nombre, apellido, telefono, correo;
	public Cliente(String nick, String password, String nombre, String apellido, String telefono, String correo){
		super(nick, password);
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.correo = correo;
	}
	
	public Cliente (String nick, String password, String correo){
		super(nick, password);
		this.correo=correo;
	}
	
	public Cliente(String nick){
		super(nick);
	}
	
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected String getApellido() {
		return apellido;
	}
	protected void setApellido(String apellido) {
		this.apellido = apellido;
	}
	protected String getTelefono() {
		return telefono;
	}
	protected void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	protected String getCorreo() {
		return correo;
	}
	protected void setCorreo(String correo) {
		this.correo = correo;
	}

}
