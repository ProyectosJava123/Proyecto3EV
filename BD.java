package Proyecto3EV;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

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
	
	public boolean ComprarMovil(String nick, String nombre) {
		boolean control = false;
		BD.Conectar();
										
		String sql1 = "SELECT * FROM cliente WHERE cliente.nick = '"+nick+"'";
		String sql2 = "SELECT * FROM movil WHERE movil.nombre = '"+nombre+"'";
		String sql3 = "SELECT movil.precio_salida FROM movil WHERE movil.nombre='"+nombre+"'";
		String sql4 = "UPDATE movil set stock = stock-1 WHERE movil.nombre='"+nombre+"'";
		
		try {
			
			PreparedStatement pst2 = BD.Conectar().prepareStatement(sql1);
			PreparedStatement pst3 = BD.Conectar().prepareStatement(sql2);
			PreparedStatement pst4 = BD.Conectar().prepareStatement(sql3);
			
			ResultSet rsusuario = pst2.executeQuery();
			ResultSet rsmovil = pst3.executeQuery();
			ResultSet rsprecio = pst4.executeQuery();
			
			if(rsusuario.next() && rsmovil.next() && rsprecio.next()){
				
				int id_cliente = rsusuario.getInt("id_cliente");
				int id_movil = rsmovil.getInt("id_movil");
				int preciomovil = rsprecio.getInt("precio_salida");
				String sql = "INSERT INTO compra (fk_cliente, fk_movil, fecha_compra, precio_compra) values ("+id_cliente+", "+id_movil+", CURRENT_DATE(),"+preciomovil+")";
				PreparedStatement pst = BD.Conectar().prepareStatement(sql);
				PreparedStatement pst5 = BD.Conectar().prepareStatement(sql4);
				
				int n = pst.executeUpdate();
				int x = pst5.executeUpdate();
			
				if(n > 0 && x > 0) {
					control = true;
				}
				
			}
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return control;
	}
	
	public boolean InsertarFkAdmin(String nick, String movil) {
		boolean control = false;
		BD.Conectar();
										
		String sql1 = "SELECT * FROM administrador WHERE administrador.nick = '"+nick+"'";
		try {
			
			PreparedStatement pst2 = BD.Conectar().prepareStatement(sql1);
			
			ResultSet rsadmin = pst2.executeQuery();
			
			if(rsadmin.next()){
				
				int fk_administrador = rsadmin.getInt("id_administrador");
				
				String sql = "UPDATE movil SET fk_administrador = "+fk_administrador+" WHERE movil.nombre= '"+movil+"'";
		
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
		
		String sql = "INSERT INTO movil (nombre, marca, stock, precio_salida, precio_compra) values ('"+m.getNombre()+"','"+m.getMarca()+"','"+m.getStock()+"','"+m.getPrecio_salida()+"','"+m.getPrecio_compra()+"')";
		
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
				System.out.println("Movil: " +rs.getString(1));
				System.out.println("Marca: " +rs.getString(2));
				System.out.println("Precio Venta: "+rs.getInt(5)+"€");
				System.out.println(" ");
			}
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return control;
	}
	
	public boolean ListadoMoviles2() {
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
				System.out.println("Movil: " +rs.getString(1));
				System.out.println("Marca: " +rs.getString(2));
				System.out.println("Stock: " +rs.getInt(4));
				System.out.println("Precio Venta: "+rs.getInt(5)+"€");
				System.out.println("Precio Compra: "+rs.getInt(7)+"€");
				System.out.println(" ");
			}
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return control;
	}
	
	
	
	public boolean MostrarClientesPorMóvil(String nick) {
		boolean control = false;
		BD.Conectar();
		Connection con=BD.Conectar();
		Statement st;
		ResultSet rs;
		String sql = "SELECT cliente.nick, cliente.nombre, cliente.apellido, movil.nombre, compra.fecha_compra FROM cliente INNER JOIN compra ON (cliente.id_cliente = compra.fk_cliente) INNER JOIN movil ON (movil.id_movil = compra.fk_movil) WHERE cliente.nick='"+nick+"'";
		
		try {
			st=con.createStatement();
			rs=st.executeQuery(sql);
		
			while(rs.next()) {
				System.out.println(" ____________________________");
				System.out.println(" | Cliente: " +rs.getString(1) +"           " +"|") ;
				System.out.println(" |___________________________|");
				System.out.println(" | Nombre: " +rs.getString(2)+"           "+"|");
				System.out.println(" | Apellido: " +rs.getString(3) +"        "+"|");
				System.out.println(" | Móvil: " +rs.getString(4) +"        "+"|");
				System.out.println(" | Fecha Compra: "+rs.getDate(5)+""+"|" );
				System.out.println(" |_________________________"+""+"|" );
				System.out.println(" ");
			}
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return control;
	}
	
	public boolean MostrarComprasEnUnaFecha(String fecha) {
		boolean control = false;
		BD.Conectar();
		Connection con=BD.Conectar();
		Statement st;
		ResultSet rs;
		java.sql.Date fecha_compra=java.sql.Date.valueOf(fecha);
		String sql = "SELECT cliente.nick, movil.nombre, compra.precio_compra FROM cliente INNER JOIN compra ON (cliente.id_cliente = compra.fk_cliente) INNER JOIN movil ON (movil.id_movil = compra.fk_movil) WHERE compra.fecha_compra='"+fecha_compra+"'";
		
		try {
			st=con.createStatement();
			rs=st.executeQuery(sql);
		
			while(rs.next()) {
				System.out.println(" ____________________________");
				System.out.println(" | Cliente: " +rs.getString(1) +"           " +"|") ;
				System.out.println(" |___________________________|");
				System.out.println(" | Móvil: " +rs.getString(2)+"           "+"|");
				System.out.println(" | Precio_Compra: " +rs.getInt(3)+"€" +"        "+"|");
				System.out.println(" |_________________________"+""+"|" );
				System.out.println(" ");
			}
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return control;
	}
	
	
	public boolean MostrarClientesQueHayanHechoUnaCompra() {
		boolean control = false;
		BD.Conectar();
		Connection con=BD.Conectar();
		Statement st;
		ResultSet rs;
		String sql = "SELECT DISTINCT cliente.nick, cliente.nombre, cliente.apellido FROM cliente INNER JOIN compra ON (cliente.id_cliente = compra.fk_cliente)";
		
		try {
			st=con.createStatement();
			rs=st.executeQuery(sql);
		
			while(rs.next()) {
				System.out.println("");
				System.out.println(" ____________________________");
				System.out.println(" | Nick: " +rs.getString(1) +            "|") ;
				System.out.println(" | Nombre: " +rs.getString(2)             +"|");
				System.out.println(" | Apellido: " +rs.getString(3)           +"|");
				System.out.println(" |___________________________"             );
				System.out.println(" ");
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
	
	public boolean ValidarCliente(String nick, String password) {
		boolean control = false;
		BD.Conectar();
		Connection con=BD.Conectar();
		Statement st;
		ResultSet rs;
		String sql = "SELECT * FROM cliente WHERE nick = '"+nick+"' AND password ='"+password+"'";
		
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
	
	public boolean DatosDelCliente(String nick) {
		boolean control = false;
		BD.Conectar();
		Connection con=BD.Conectar();
		Statement st;
		ResultSet rs;
		String sql = "SELECT * FROM cliente where cliente.nick='"+nick+"'";
		
		try {
			st=con.createStatement();
			rs=st.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println(" ");
				System.out.println("Nick: "+rs.getString(1));
				System.out.println("Password: " +rs.getString(2));
				System.out.println("Nombre: "+rs.getString(3));
				System.out.println("Apellido: " +rs.getString(4));
				System.out.println("Teléfono: " +rs.getString(5));
				System.out.println("Correo :"+rs.getString(6));
				System.out.println(" ");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return control;
	}
	
	public boolean BorrarCliente(String nick) {
		boolean control = false;
		BD.Conectar();
		String sql = "DELETE FROM cliente WHERE nick='"+nick+"'";
		
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
	
	public boolean ModificarNombreMovil(String movilcambiar, String movilexistente) {
		boolean control = false;
		BD.Conectar();
									
		String sql = "UPDATE movil SET nombre = '"+movilcambiar+"' WHERE movil= '"+movilexistente+"' )";
		
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
	
	public boolean ModificarNombreCliente(String nick, String nuevonombre) {
		boolean control = false;
		BD.Conectar();
									
		String sql = "UPDATE cliente SET nombre = '"+nuevonombre+"' WHERE nick= '"+nick+"'";
		
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
	
	public boolean ModificarNickCliente(String nick, String nuevonick) {
		boolean control = false;
		BD.Conectar();
									
		String sql = "UPDATE cliente SET nick = '"+nuevonick+"' WHERE nick= '"+nick+"'";
		
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
	
	public boolean ModificarCorreoCliente(String nick, String nuevocorreo) {
		boolean control = false;
		BD.Conectar();
									
		String sql = "UPDATE cliente SET correo = '"+nuevocorreo+"' WHERE nick= '"+nick+"'";
		
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
	
	public boolean ModificarTelefonoCliente(String nick, String nuevotelefono) {
		boolean control = false;
		BD.Conectar();
									
		String sql = "UPDATE cliente SET telefono = '"+nuevotelefono+"' WHERE nick= '"+nick+"'";
		
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
	
	public boolean ModificarApellidoCliente(String nick, String nuevoapellido) {
		boolean control = false;
		BD.Conectar();
									
		String sql = "UPDATE cliente SET apellido = '"+nuevoapellido+"' WHERE nick= '"+nick+"'";
		
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
	
	public boolean ModificarPasswordCliente(String nick, String nuevopassword) {
		boolean control = false;
		BD.Conectar();
									
		String sql = "UPDATE cliente SET password = '"+nuevopassword+"' WHERE nick= '"+nick+"'";
		
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
	
	public boolean ModificarStockMovil(String movil, int stock) {
		boolean control = false;
		BD.Conectar();
									
		String sql = "UPDATE movil SET stock = '"+stock+"' WHERE nombre= '"+movil+"'";
		
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
	
	public boolean ModificarPrecioMovil(String movil, int precio) {
		boolean control = false;
		BD.Conectar();
									
		String sql = "UPDATE movil SET precio_salida = '"+precio+"' WHERE nombre= '"+movil+"'";
		
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
	
	
}
