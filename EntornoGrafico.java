package Proyecto3EV;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.net.StandardSocketOptions;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;

public class EntornoGrafico {

	JFrame frame;
	private JTextField c_nick;
	private JTextField c_password;
	private JTextField c_correo;
	private JTextField c_nombre;
	private JTextField c_apellido;
	private JTextField c_telefono;
	private JTextField a_nick;
	private JTextField a_password;
	private JTextField clog_nick;
	private JTextField clog_password;
	private JTextField clog_correo;

	
	public EntornoGrafico() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 479, 416);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel registrocliente = new JPanel();
		registrocliente.setVisible(false);
		
		JPanel registroadmin = new JPanel();
		registroadmin.setVisible(false);
		
		JPanel logincliente = new JPanel();
		logincliente.setVisible(false);
		
		JPanel index = new JPanel();
		index.setBounds(0, 0, 463, 377);
		frame.getContentPane().add(index);
		index.setLayout(null);
		
		JButton btnRegistrarAdministrador = new JButton("Registrar Admin");
		btnRegistrarAdministrador.setFont(new Font("Stencil", Font.PLAIN, 17));
		btnRegistrarAdministrador.setBounds(10, 231, 207, 92);
		index.add(btnRegistrarAdministrador);
		
		JButton btnNewButton = new JButton("Registrar Cliente");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index.setVisible(false);
				registrocliente.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Stencil", Font.PLAIN, 17));
		btnNewButton.setBounds(10, 94, 205, 92);
		index.add(btnNewButton);
		
		JButton btnLoggearCliente = new JButton("Loggear Cliente");
		btnLoggearCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index.setVisible(false);
				logincliente.setVisible(true);
			}
		});
		btnLoggearCliente.setFont(new Font("Stencil", Font.PLAIN, 17));
		btnLoggearCliente.setBounds(226, 94, 228, 92);
		index.add(btnLoggearCliente);
		
		JButton btnLoggearAdministrador = new JButton("Loggear Admin"); //Loggear Admin
		btnLoggearAdministrador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnLoggearAdministrador.setFont(new Font("Stencil", Font.PLAIN, 17));
		btnLoggearAdministrador.setBounds(227, 231, 227, 92);
		index.add(btnLoggearAdministrador);
		
		JLabel lblNewLabel_4 = new JLabel("Registro/Login");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 41));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(86, 11, 326, 51);
		index.add(lblNewLabel_4);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Leon\\Pictures\\sunset_and_space_by_qauz-d6hwooq.jpg"));
		lblNewLabel.setBounds(0, 0, 461, 378);
		index.add(lblNewLabel);
		logincliente.setBounds(0, 0, 463, 377);
		frame.getContentPane().add(logincliente);
		logincliente.setLayout(null);
		
		JLabel lblCorreo_1 = new JLabel("Correo");
		lblCorreo_1.setForeground(Color.WHITE);
		lblCorreo_1.setFont(new Font("Times New Roman", Font.PLAIN, 37));
		lblCorreo_1.setBounds(42, 161, 120, 64);
		logincliente.add(lblCorreo_1);
		
		JLabel label_1 = new JLabel("Password");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 37));
		label_1.setBounds(46, 93, 161, 57);
		logincliente.add(label_1);
		
		JLabel label = new JLabel("Nick");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Times New Roman", Font.PLAIN, 37));
		label.setBounds(46, 11, 114, 71);
		logincliente.add(label);
		
		JLabel mensajes3 = new JLabel("");
		mensajes3.setBounds(229, 223, 212, 88);
		logincliente.add(mensajes3);
		mensajes3.setForeground(Color.WHITE);
		mensajes3.setFont(new Font("Times New Roman", Font.PLAIN, 37));
		
		clog_nick = new JTextField();
		clog_nick.setText((String) null);
		clog_nick.setColumns(10);
		clog_nick.setBounds(263, 24, 190, 51);
		logincliente.add(clog_nick);
		
		clog_password = new JTextField();
		clog_password.setText((String) null);
		clog_password.setColumns(10);
		clog_password.setBounds(263, 99, 190, 51);
		logincliente.add(clog_password);
		
		clog_correo = new JTextField();
		clog_correo.setText((String) null);
		clog_correo.setColumns(10);
		clog_correo.setBounds(263, 177, 190, 51);
		logincliente.add(clog_correo);
		
		JButton btnNewButton_3 = new JButton("Entrar");
		btnNewButton_3.addActionListener(new ActionListener() { //LOGIN  CLIENTE
			public void actionPerformed(ActionEvent e) {
				Gestion_Usuarios gu = new Gestion_Usuarios();
				BD ss = new BD(); 
				
				if(clog_nick.getText().isEmpty() || clog_password.getText().isEmpty() || clog_correo.getText().isEmpty()){
					mensajes3.setText("Campos Vacíos");
				}else if(!ss.ValidarCliente(clog_nick.getText(), clog_password.getText(), clog_correo.getText())){
					mensajes3.setText("Datos Incorrectos");
				}else{ gu.LoginCliente(clog_nick.getText(), clog_password.getText(), clog_correo.getText());  
					
				logincliente.setVisible(false);
				index.setVisible(true);
				
				}
	
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnNewButton_3.setBounds(42, 267, 134, 71);
		logincliente.add(btnNewButton_3);
		
		JLabel lblNewLabel_3 = new JLabel("Fondo");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Leon\\Pictures\\sunset_and_space_by_qauz-d6hwooq.jpg"));
		lblNewLabel_3.setBounds(0, 0, 463, 377);
		logincliente.add(lblNewLabel_3);
		registroadmin.setBounds(0, 0, 463, 377);
		frame.getContentPane().add(registroadmin);
		registroadmin.setLayout(null);
		
		JLabel nicka = new JLabel("Nick");
		nicka.setForeground(Color.WHITE);
		nicka.setFont(new Font("Times New Roman", Font.PLAIN, 37));
		nicka.setBounds(44, 22, 161, 88);
		registroadmin.add(nicka);
		
		JLabel passworda = new JLabel("Password");
		passworda.setForeground(Color.WHITE);
		passworda.setFont(new Font("Times New Roman", Font.PLAIN, 37));
		passworda.setBounds(44, 121, 161, 88);
		registroadmin.add(passworda);
		
		a_nick = new JTextField();
		a_nick.setText((String) null);
		a_nick.setColumns(10);
		a_nick.setBounds(239, 53, 200, 40);
		registroadmin.add(a_nick);
		
		a_password = new JTextField();
		a_password.setText((String) null);
		a_password.setColumns(10);
		a_password.setBounds(236, 154, 200, 40);
		registroadmin.add(a_password);
		
		JLabel mensajes2 = new JLabel("");
		mensajes2.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		mensajes2.setForeground(Color.WHITE);
		mensajes2.setBounds(253, 263, 200, 88);
		registroadmin.add(mensajes2);
		
		JButton btnNewButton_2 = new JButton("Registrarse");
		btnNewButton_2.addActionListener(new ActionListener() { // REGISTRO ADMINISTRADOR
			public void actionPerformed(ActionEvent e) {
				BD ss = new BD();
				Gestion_Usuarios gu = new Gestion_Usuarios();
				if(a_nick.getText().isEmpty() || a_password.getText().isEmpty()){
					mensajes2.setText("Campos Vacíos");
				} else if(ss.ComprobarAdmin(a_nick.getText())){
					System.out.println("Nick existente");
				}else { gu.Pedir_Administrador(a_nick.getText(), a_password.getText());
					registroadmin.setVisible(false);
					index.setVisible(true);
				}
				
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2.setBounds(42, 273, 132, 63);
		registroadmin.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("Fondo");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Leon\\Pictures\\sunset_and_space_by_qauz-d6hwooq.jpg"));
		lblNewLabel_1.setBounds(0, 0, 463, 377);
		registroadmin.add(lblNewLabel_1);
		registrocliente.setBounds(0, 0, 463, 377);
		frame.getContentPane().add(registrocliente);
		registrocliente.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Nick");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(27, 11, 74, 41);
		registrocliente.add(lblNewLabel_2);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblPassword.setBounds(25, 63, 115, 31);
		registrocliente.add(lblPassword);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblNombre.setBounds(25, 157, 115, 41);
		registrocliente.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setForeground(Color.WHITE);
		lblApellido.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblApellido.setBounds(27, 201, 115, 41);
		registrocliente.add(lblApellido);
		
		JLabel lblTelefono = new JLabel("Tel\u00E9fono");
		lblTelefono.setForeground(Color.WHITE);
		lblTelefono.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblTelefono.setBounds(27, 253, 115, 41);
		registrocliente.add(lblTelefono);
		
		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setForeground(Color.WHITE);
		lblCorreo.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblCorreo.setBounds(27, 105, 115, 41);
		registrocliente.add(lblCorreo);
		
		c_nick = new JTextField();
		c_nick.setBounds(231, 11, 200, 35);
		registrocliente.add(c_nick);
		c_nick.setColumns(10);
		c_nick.setText(null);
		
		c_password = new JTextField();
		c_password.setColumns(10);
		c_password.setBounds(231, 57, 200, 35);
		registrocliente.add(c_password);
		c_password.setText(null);
		
		c_correo = new JTextField();
		c_correo.setColumns(10);
		c_correo.setBounds(231, 105, 200, 35);
		registrocliente.add(c_correo);
		c_correo.setText(null);
		
		c_nombre = new JTextField();
		c_nombre.setColumns(10);
		c_nombre.setBounds(231, 151, 200, 35);
		registrocliente.add(c_nombre);
		c_nombre.setText(null);
		
		c_apellido = new JTextField();
		c_apellido.setColumns(10);
		c_apellido.setBounds(231, 196, 200, 35);
		registrocliente.add(c_apellido);
		c_apellido.setText(null);
		
		c_telefono = new JTextField();
		c_telefono.setColumns(10);
		c_telefono.setBounds(231, 245, 200, 35);
		registrocliente.add(c_telefono);
		c_telefono.setText(null);
		
		JLabel mensajes = new JLabel("");
		mensajes.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		mensajes.setForeground(Color.WHITE);
		mensajes.setBounds(253, 301, 200, 51);
		
		JButton btnNewButton_1 = new JButton("Registrarse");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // REGISTRO DEL CLIENTE
				BD ss = new BD();
				Gestion_Usuarios gu = new Gestion_Usuarios();
				if(c_nick.getText().isEmpty() || c_password.getText().isEmpty() || c_correo.getText().isEmpty()
		|| c_nombre.getText().isEmpty() || c_apellido.getText().isEmpty() || c_telefono.getText().isEmpty()){
					mensajes.setText("Campos Vacíos");
				} else if(ss.ComprobarCliente(c_nick.getText()) || ss.ComprobarCorreo(c_correo.getText())){
					mensajes.setText("Nick o Correo existentes");
				}else {  gu.Pedir_Cliente(c_nick.getText(), c_password.getText(), c_nombre.getText(), c_apellido.getText(), c_telefono.getText(), c_correo.getText());
					registrocliente.setVisible(false);
					index.setVisible(true);
				}
				
			}
		});
		
	
		registrocliente.add(mensajes);
		btnNewButton_1.setBounds(37, 313, 163, 41);
		registrocliente.add(btnNewButton_1);
		
		JLabel u_correo = new JLabel("Fondo");
		u_correo.setIcon(new ImageIcon("C:\\Users\\Leon\\Pictures\\sunset_and_space_by_qauz-d6hwooq.jpg"));
		u_correo.setBounds(0, 0, 463, 378);
		registrocliente.add(u_correo);
		
		JPanel loginadmin = new JPanel();
		loginadmin.setVisible(false);
		loginadmin.setBounds(0, 0, 463, 377);
		frame.getContentPane().add(loginadmin);
	}
}
