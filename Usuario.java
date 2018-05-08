package Proyecto3EV;

public abstract class Usuario {
	protected String nick;
	protected String password;
	
	public Usuario(String nick, String password) {
		this.nick = nick;
		this.password = password;
	}
	
	public Usuario(String nick){
		this.nick=nick;
	}
	
	protected String getNick() {
		return nick;
	}
	protected void setNick(String nick) {
		this.nick = nick;
	}
	protected String getPassword() {
		return password;
	}
	protected void setPassword(String password) {
		this.password = password;
	}
	
}
