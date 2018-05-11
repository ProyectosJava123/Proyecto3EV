package Proyecto3EV;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BD {
	private ConexionMYSQL BD =new ConexionMYSQL();
	
	public boolean InsertarCliente(Cliente c) {
		boolean control = false;
		BD.Conectar();
		
										
		String sql = "INSERT INTO cliente (nick, password, nombre, apellido, telefono, correo) values ('"+c.getNick()+"','"+c.getPassword()+"','"+c.getNombre()+"','"+c.getApellido()+"','"+c.getTelefono()+"','"+c.getCorreo()+"')";
		
		try {
			PreparedStatement pst = BD.Conectar().prepareStatement(sql);
			int n = pst.executeUpdate();
			
			if(n > 0) {
				control = true;
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return control;
	}
	
	public boolean ComprarMovil(String nick, String nombre, int precio) {
		boolean control = false;
		BD.Conectar();
										
		String sql1 = "SELECT * FROM cliente WHERE cliente.nick = '"+nick+"'";
		String sql2 = "SELECT * FROM movil WHERE movil.nombre = '"+nombre+"'";
		
		try {
			
			PreparedStatement pst2 = BD.Conectar().prepareStatement(sql1);
			PreparedStatement pst3 = BD.Conectar().prepareStatement(sql2);
			ResultSet rsusuario = pst2.executeQuery();
			ResultSet rsmovil = pst3.executeQuery();
			
			if(rsusuario.next() && rsmovil.next()){
				
				int id_cliente = rsusuario.getInt("id_cliente");
				int id_movil = rsmovil.getInt("id_movil");
				String sql = "INSERT INTO compra (fk_cliente, fk_movil, fecha_compra, precio_compra) values ("+id_cliente+", "+id_movil+", CURRENT_DATE(),"+precio+")";
				PreparedStatement pst = BD.Conectar().prepareStatement(sql);
		
				int n = pst.executeUpdate();
			
				if(n > 0) {
					control = true;
				}
				
			}
		
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return control;
	}
	
	
	public boolean ComprobarCliente(String nick) {
		boolean control = false;
		BD.Conectar();
		Connection con=BD.Conectar();
		Statement st;
		ResultSet rs;
		String sql = "SELECT * FROM cliente WHERE nick='"+nick+"'";
		
		try {
			st=con.createStatement();
			rs=st.executeQuery(sql);
			
			while(rs.next()) {
				control = true;
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return control;
	}
	
	public boolean ComprobarAdmin(String nick) {
		boolean control = false;
		BD.Conectar();
		Connection con=BD.Conectar();
		Statement st;
		ResultSet rs;
		String sql = "SELECT * FROM administrador WHERE nick='"+nick+"'";
		
		try {
			st=con.createStatement();
			rs=st.executeQuery(sql);
			
			while(rs.next()) {
				control = true;
				System.out.println(" ");
				System.out.println("El administrador ya existe");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return control;
	}
	
	public boolean ComprobarCorreo(String correo) {
		boolean control = false;
		BD.Conectar();
		Connection con=BD.Conectar();
		Statement st;
		ResultSet rs;
		String sql = "SELECT * FROM cliente WHERE correo='"+correo+"'";
		
		try {
			st=con.createStatement();
			rs=st.executeQuery(sql);
			
			while(rs.next()) {
				control = true;
				System.out.println(" ");
				System.out.println("El correo ya existe");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return control;
	}
	
	public boolean ComprobarMovil(String movil) {
		boolean control = false;
		BD.Conectar();
		Connection con=BD.Conectar();
		Statement st;
		ResultSet rs;
		String sql = "SELECT * FROM movil WHERE nombre='"+movil+"'";
		
		try {
			st=con.createStatement();
			rs=st.executeQuery(sql);
			
			while(rs.next()) {
				control = true;
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return control;
	}
	
	
	public boolean InsertarAdministrador(Administrador a) {
		boolean control = false;
		BD.Conectar();
		
		String sql = "INSERT INTO administrador (nick, password) values ('"+a.getNick()+"','"+a.getPassword()+"')";
		
		try {
			PreparedStatement pst = BD.Conectar().prepareStatement(sql);
			int n = pst.executeUpdate();
			
			if(n > 0) {
				control = true;
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return control;
	}
	
	public boolean InsertarMovil(Movil m) {
		boolean control = false;
		BD.Conectar();
		
		String sql = "INSERT INTO movil (nombre, marca, stock, precio_salida) values ('"+m.getNombre()+"','"+m.getMarca()+"','"+m.getMarca()+"','"+m.getStock()+"','"+m.getPrecio_salida()+"')";
		
		try {
			PreparedStatement pst = BD.Conectar().prepareStatement(sql);
			int n = pst.executeUpdate();
			
			if(n > 0) {
				control = true;
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return control;
	}
	
	
	public boolean BorrarMovil(String nombre) {
		boolean control = false;
		BD.Conectar();
		String sql = "DELETE FROM movil WHERE nombre='"+nombre+"' ";
		
		try {
			PreparedStatement pst = BD.Conectar().prepareStatement(sql);
			int n = pst.executeUpdate();
			
			if(n > 0) {
				control = true;
				System.out.println("Registro eliminado con exito");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return control;
	}
	
	public boolean ListadoMoviles() {
		boolean control = false;
		BD.Conectar();
		Connection con=BD.Conectar();
		Statement st;
		ResultSet rs;
		String sql = "SELECT * FROM movil";
		
		try {
			st=con.createStatement();
			rs=st.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println(" ");
				System.out.println("Nombre:"+rs.getString(1));
				System.out.println("Stock:" +rs.getInt(5));
				System.out.println("Precio Salida:" +rs.getInt(6));
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return control;
	}
	
	public boolean ListadoClientes() {
		boolean control = false;
		BD.Conectar();
		Connection con=BD.Conectar();
		Statement st;
		ResultSet rs;
		String sql = "SELECT * FROM cliente";
		
		try {
			st=con.createStatement();
			rs=st.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println("Clientes:");
				System.out.println(rs.getString(1));
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return control;
	}
	
	public boolean ValidarAdmin(String nick, String password) {
		boolean control = false;
		BD.Conectar();
		Connection con=BD.Conectar();
		Statement st;
		ResultSet rs;
		String sql = "SELECT * FROM administrador WHERE nick = '"+nick+"' AND password ='"+password+"'";
		
		try {
			st=con.createStatement();
			rs=st.executeQuery(sql);
			
			while(rs.next()) {
				control=true;
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return control;
	}
	
	public boolean ValidarCliente(String nick, String password, String correo) {
		boolean control = false;
		BD.Conectar();
		Connection con=BD.Conectar();
		Statement st;
		ResultSet rs;
		String sql = "SELECT * FROM cliente WHERE nick = '"+nick+"' AND password ='"+password+"' AND correo='"+correo+"'";
		
		try {
			st=con.createStatement();
			rs=st.executeQuery(sql);
			
			while(rs.next()) {
				control=true;
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return control;
	}
	
	
	public boolean ListadoAdministradores() {
		boolean control = false;
		BD.Conectar();
		Connection con=BD.Conectar();
		Statement st;
		ResultSet rs;
		String sql = "SELECT * FROM administrador";
		
		try {
			st=con.createStatement();
			rs=st.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println("Administradores");
				System.out.println(rs.getString(1));
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return control;
	}
	
	public boolean BorrarCliente(String nick) {
		boolean control = false;
		BD.Conectar();
		String sql = "DELETE FROM cliente WHERE nick='"+nick+"' ";
		
		try {
			PreparedStatement pst = BD.Conectar().prepareStatement(sql);
			int n = pst.executeUpdate();
			
			if(n > 0) {
				control = true;
				System.out.println("Registro eliminado con exito");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return control;
	}
	
	public boolean BorrarAdministrador(String nick) {
		boolean control = false;
		BD.Conectar();
		
		String sql = "DELETE FROM administrador WHERE nick='"+nick+"'";
		
		try {
			
			PreparedStatement pst = BD.Conectar().prepareStatement(sql);
			
			int n = pst.executeUpdate();
			if(n > 0) {
				control = true;
				System.out.println("Registro eliminado con exito");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return control;
	}
	
}
