package Proyecto3EV;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.net.StandardSocketOptions;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JScrollPane;

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
	private JTextField cambiarnombrecliente;
	private JTextField cambiarpasswordcliente;
	private JTextField cambiartelefonocliente;
	private JTextField cambiarapellidocliente;
	private JTextField cambiarnickcliente;
	private JTextField cambiarcorreocliente;
	protected JPanel index;
	

	
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
		
		JPanel listamoviles = new JPanel();
		listamoviles.setBounds(0, 0, 463, 377);
		
		JPanel opcionescliente = new JPanel();
		opcionescliente.setVisible(false);
		JPanel modificarnombre = new JPanel();
		modificarnombre.setBounds(0, 0, 463, 377);
		frame.getContentPane().add(modificarnombre);
		modificarnombre.setVisible(false);
		modificarnombre.setLayout(null);
		
		cambiarnombrecliente = new JTextField();
		cambiarnombrecliente.setBounds(126, 92, 161, 42);
		modificarnombre.add(cambiarnombrecliente);
		cambiarnombrecliente.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Inserta Nuevo Nombre");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setBounds(131, 261, 196, 56);
		modificarnombre.add(lblNewLabel_8);
		
		JButton btnNewButton_5 = new JButton("Cambiar");
		btnNewButton_5.addActionListener(new ActionListener() { //CAMBIAR NOMBRE DEL CLIENTE
			public void actionPerformed(ActionEvent e) {
				BD ss = new BD();
				if(cambiarnombrecliente.getText().isEmpty()){
					lblNewLabel_8.setText("Campo Vacío");
				}else{ss.ModificarNombreCliente(clog_nick.getText(), cambiarnombrecliente.getText()); 
				lblNewLabel_8.setText(""); modificarnombre.setVisible(false); opcionescliente.setVisible(true);
				ss.DatosDelCliente(clog_nick.getText());
				};
			}
		});
		
		
		btnNewButton_5.setBounds(125, 164, 162, 48);
		modificarnombre.add(btnNewButton_5);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setBounds(0, 0, 463, 377);
		modificarnombre.add(lblNewLabel_7);
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\Leon\\Pictures\\sunset_and_space_by_qauz-d6hwooq.jpg"));
		
		JPanel modificarcorreo = new JPanel();
		modificarcorreo.setBounds(0, 0, 463, 377);
		frame.getContentPane().add(modificarcorreo);
		modificarcorreo.setVisible(false);
		modificarcorreo.setLayout(null);
		
		cambiarcorreocliente = new JTextField();
		cambiarcorreocliente.setColumns(10);
		cambiarcorreocliente.setBounds(126, 92, 161, 42);
		modificarcorreo.add(cambiarcorreocliente);
		
		JLabel label_13 = new JLabel("Inserta Nuevo Correo");
		label_13.setForeground(Color.WHITE);
		label_13.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		label_13.setBounds(131, 261, 196, 56);
		modificarcorreo.add(label_13);
		
		JButton button_11 = new JButton("Cambiar"); // CAMBIAR CORREO
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BD ss = new BD();
				if(cambiarcorreocliente.getText().isEmpty()){
					label_13.setText("Campo Vacío");
				}else if(ss.ComprobarCorreo(cambiarcorreocliente.getText())){
					label_13.setText("Correo Existente");
				}else {
					ss.ModificarCorreoCliente(clog_nick.getText(), cambiarcorreocliente.getText());
					label_13.setText("Inserta Nuevo Correo");
					ss.DatosDelCliente(clog_nick.getText());
					modificarcorreo.setVisible(false);
					opcionescliente.setVisible(true);
				}
			}
		});
		button_11.setBounds(125, 164, 162, 48);
		modificarcorreo.add(button_11);
		
		JLabel label_14 = new JLabel("New label");
		label_14.setIcon(new ImageIcon("C:\\Users\\Leon\\Pictures\\sunset_and_space_by_qauz-d6hwooq.jpg"));
		label_14.setBounds(0, 0, 463, 377);
		modificarcorreo.add(label_14);
		
		JPanel modificarnick = new JPanel();
		modificarnick.setBounds(0, 0, 463, 377);
		frame.getContentPane().add(modificarnick);
		modificarnick.setVisible(false);
		modificarnick.setLayout(null);
		
		cambiarnickcliente = new JTextField();
		cambiarnickcliente.setColumns(10);
		cambiarnickcliente.setBounds(126, 92, 161, 42);
		modificarnick.add(cambiarnickcliente);
		
		JLabel label_11 = new JLabel("Inserta Nuevo Nick");
		label_11.setForeground(Color.WHITE);
		label_11.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		label_11.setBounds(131, 261, 196, 56);
		modificarnick.add(label_11);
		
		JButton button_10 = new JButton("Cambiar");
		button_10.addActionListener(new ActionListener() { //CAMBIAR NICK CLIENTE
			public void actionPerformed(ActionEvent e) {
				BD ss = new BD();
				if(cambiarnickcliente.getText().isEmpty()){
					label_11.setText("Campo Vacío");
				} else if(ss.ComprobarCliente(cambiarnickcliente.getText())){
					label_11.setText("Correo Existente");
				}else{
					ss.ModificarNickCliente(clog_nick.getText(), cambiarnickcliente.getText());
					ss.DatosDelCliente(clog_nick.getText());
					label_11.setText("Inserta Nuevo Nick");
					ss.DatosDelCliente(clog_nick.getText());
					modificarnick.setVisible(false);
					opcionescliente.setVisible(true);
				}
			}
		});
		button_10.setBounds(125, 164, 162, 48);
		modificarnick.add(button_10);
		
		JLabel label_12 = new JLabel("New label");
		label_12.setIcon(new ImageIcon("C:\\Users\\Leon\\Pictures\\sunset_and_space_by_qauz-d6hwooq.jpg"));
		label_12.setBounds(0, 0, 463, 377);
		modificarnick.add(label_12);
		
		JPanel modificarapellido = new JPanel();
		modificarapellido.setBounds(0, 0, 463, 377);
		frame.getContentPane().add(modificarapellido);
		modificarapellido.setVisible(false);
		modificarapellido.setLayout(null);
		
		cambiarapellidocliente = new JTextField();
		cambiarapellidocliente.setColumns(10);
		cambiarapellidocliente.setBounds(126, 92, 161, 42);
		modificarapellido.add(cambiarapellidocliente);
		
		JLabel label_9 = new JLabel("Inserta Nuevo Apellido");
		label_9.setForeground(Color.WHITE);
		label_9.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		label_9.setBounds(131, 261, 196, 56);
		modificarapellido.add(label_9);
		
		JButton button_9 = new JButton("Cambiar");
		button_9.addActionListener(new ActionListener() { //CAMBIAR APELLIDO
			public void actionPerformed(ActionEvent e) {
				BD ss = new BD();
				if(cambiarapellidocliente.getText().isEmpty()){
					label_9.setText("Campo Vacío");
				}else{
					ss.ModificarApellidoCliente(clog_nick.getText(), cambiarapellidocliente.getText());
					modificarapellido.setVisible(false);
					opcionescliente.setVisible(true);
					label_9.setText("Inserta Nuevo Apellido");
					ss.DatosDelCliente(clog_nick.getText());
				}
			}
		});
		button_9.setBounds(125, 164, 162, 48);
		modificarapellido.add(button_9);
		
		JLabel label_10 = new JLabel("New label");
		label_10.setIcon(new ImageIcon("C:\\Users\\Leon\\Pictures\\sunset_and_space_by_qauz-d6hwooq.jpg"));
		label_10.setBounds(0, 0, 463, 377);
		modificarapellido.add(label_10);
		
		JPanel modificartelefono = new JPanel();
		modificartelefono.setBounds(0, 0, 463, 377);
		frame.getContentPane().add(modificartelefono);
		modificartelefono.setVisible(false);
		modificartelefono.setLayout(null);
		
		cambiartelefonocliente = new JTextField();
		cambiartelefonocliente.setColumns(10);
		cambiartelefonocliente.setBounds(126, 92, 161, 42);
		modificartelefono.add(cambiartelefonocliente);
		
		JLabel label_7 = new JLabel("Inserta Nuevo Teléfono");
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		label_7.setBounds(131, 261, 196, 56);
		modificartelefono.add(label_7);
		
		JButton button_8 = new JButton("Cambiar");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {  // CAMBIAR TELÉFONO CLIENTE
				BD ss = new BD();
				if(cambiartelefonocliente.getText().isEmpty()){
				label_7.setText("Campo Vacío");
				}else {ss.ModificarTelefonoCliente(clog_nick.getText(), cambiartelefonocliente.getText());
				opcionescliente.setVisible(true);
				modificartelefono.setVisible(false);
				ss.DatosDelCliente(clog_nick.getText());
				label_7.setText("Inserta Nuevo Telefono");
				}
			}
		});
		button_8.setBounds(125, 164, 162, 48);
		modificartelefono.add(button_8);
		
		JLabel label_8 = new JLabel("New label");
		label_8.setIcon(new ImageIcon("C:\\Users\\Leon\\Pictures\\sunset_and_space_by_qauz-d6hwooq.jpg"));
		label_8.setBounds(0, 0, 463, 377);
		modificartelefono.add(label_8);
		
		JPanel modificarpassword = new JPanel();
		modificarpassword.setBounds(0, 0, 463, 377);
		frame.getContentPane().add(modificarpassword);
		modificarpassword.setVisible(false);
		modificarpassword.setLayout(null);
		
		cambiarpasswordcliente = new JTextField();
		cambiarpasswordcliente.setColumns(10);
		cambiarpasswordcliente.setBounds(126, 92, 161, 42);
		modificarpassword.add(cambiarpasswordcliente);
		
		JLabel label_5 = new JLabel("Inserta Nuevo Password");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		label_5.setBounds(131, 261, 196, 56);
		modificarpassword.add(label_5);
		
		JButton button_7 = new JButton("Cambiar"); // CAMBIAR PASSWORD
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BD ss = new BD();
				if(cambiarpasswordcliente.getText().isEmpty()){
					label_5.setText("Campo Vacío");
				}else {ss.ModificarPasswordCliente(clog_nick.getText(), cambiarpasswordcliente.getText());
					ss.DatosDelCliente(clog_nick.getText());
					modificarpassword.setVisible(false);
					opcionescliente.setVisible(true);
					label_5.setText("");
				}
			}
		});
		button_7.setBounds(125, 164, 162, 48);
		modificarpassword.add(button_7);
		
		JLabel label_6 = new JLabel("New label");
		label_6.setIcon(new ImageIcon("C:\\Users\\Leon\\Pictures\\sunset_and_space_by_qauz-d6hwooq.jpg"));
		label_6.setBounds(0, 0, 463, 377);
		modificarpassword.add(label_6);
		
		JPanel compramoviles = new JPanel();
		compramoviles.setBounds(0, 0, 463, 377);
		frame.getContentPane().add(compramoviles);
		compramoviles.setVisible(false);
		compramoviles.setLayout(null);
		
		JButton btnNewButton_6 = new JButton("Comprar");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_6.setBounds(0, 0, 89, 23);
		compramoviles.add(btnNewButton_6);
		
		
		JLabel lblNewLabel_5 = new JLabel("Fondo");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Leon\\Pictures\\sunset_and_space_by_qauz-d6hwooq.jpg"));
		lblNewLabel_5.setBounds(0, 0, 463, 377);
		compramoviles.add(lblNewLabel_5);
		opcionescliente.setBounds(0, 0, 463, 377);
		frame.getContentPane().add(opcionescliente);
		opcionescliente.setLayout(null);
		
		JButton btnNewButton_4 = new JButton("Comprar M\u00F3vil");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BD ss = new BD();
				ss.ListadoMoviles();
				opcionescliente.setVisible(false);
				compramoviles.setVisible(true);
			}
		});
		btnNewButton_4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_4.setBounds(112, 50, 187, 73);
		opcionescliente.add(btnNewButton_4);
		
		JButton btnModificarNick = new JButton("Modificar Nick");
		btnModificarNick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BD ss = new BD();
				ss.DatosDelCliente(clog_nick.getText());
				opcionescliente.setVisible(false);
				modificarnick.setVisible(true);
			}
		});
		btnModificarNick.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnModificarNick.setBounds(11, 159, 167, 55);
		opcionescliente.add(btnModificarNick);
		
		JButton btnModificarContrasea = new JButton("Modificar Contrase\u00F1a");
		btnModificarContrasea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BD ss = new BD();
				ss.DatosDelCliente(clog_nick.getText());
				opcionescliente.setVisible(false);
				modificarpassword.setVisible(true);
			}
		});
		btnModificarContrasea.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnModificarContrasea.setBounds(200, 159, 196, 55);
		opcionescliente.add(btnModificarContrasea);
		
		JButton btnModificarNombre = new JButton("Modificar Nombre");
		btnModificarNombre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BD ss = new BD();
				ss.DatosDelCliente(clog_nick.getText());
				opcionescliente.setVisible(false);
				modificarnombre.setVisible(true);
			}
		});
		btnModificarNombre.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnModificarNombre.setBounds(11, 224, 167, 55);
		opcionescliente.add(btnModificarNombre);
		
		JButton btnModificarApellido = new JButton("Modificar Apellido");
		btnModificarApellido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BD ss = new BD();
				ss.DatosDelCliente(clog_nick.getText());
				opcionescliente.setVisible(false);
				modificarapellido.setVisible(true);
			}
		});
		btnModificarApellido.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnModificarApellido.setBounds(200, 225, 196, 55);
		opcionescliente.add(btnModificarApellido);
		
		JButton btnModificarCorreo = new JButton("Modificar Correo");
		btnModificarCorreo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BD ss = new BD();
				ss.DatosDelCliente(clog_nick.getText());
				opcionescliente.setVisible(false);
				modificarcorreo.setVisible(true);
			}
		});
		btnModificarCorreo.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnModificarCorreo.setBounds(112, 290, 167, 55);
		opcionescliente.add(btnModificarCorreo);
		
		JLabel lblNewLabel_6 = new JLabel("Fondo");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\Leon\\Pictures\\sunset_and_space_by_qauz-d6hwooq.jpg"));
		lblNewLabel_6.setBounds(0, 0, 463, 377);
		opcionescliente.add(lblNewLabel_6);
		
		JPanel index = new JPanel();
		index.setBounds(0, 0, 463, 377);
		frame.getContentPane().add(index);
		index.setLayout(null);
		
		JPanel registrocliente = new JPanel();
		registrocliente.setBounds(0, 0, 463, 377);
		frame.getContentPane().add(registrocliente);
		registrocliente.setVisible(false);
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
		mensajes.setFont(new Font("Times New Roman", Font.PLAIN, 14));
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
				} else if(ss.ComprobarCliente(c_nick.getText())){
					mensajes.setText("Nick existente");
				}else if(ss.ComprobarCorreo(c_correo.getText())){
					mensajes.setText("Correo Existente");
				}else if(ss.ComprobarCorreo(c_correo.getText()) && ss.ComprobarCliente(c_nick.getText())){
					mensajes.setText("Nick y Correo Existentes");
				}else {gu.Pedir_Cliente(c_nick.getText(), c_password.getText(), c_nombre.getText(), c_apellido.getText(), c_telefono.getText(), c_correo.getText());
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
		
		JPanel logincliente = new JPanel();
		logincliente.setBounds(0, 0, 463, 377);
		frame.getContentPane().add(logincliente);
		logincliente.setVisible(false);
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
				mensajes3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
				
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
				
						BD ss = new BD(); 
						
						if(clog_nick.getText().isEmpty() || clog_password.getText().isEmpty() || clog_correo.getText().isEmpty()){
							mensajes3.setText("Campos Vacíos");
						}else if(!ss.ValidarCliente(clog_nick.getText(), clog_password.getText(), clog_correo.getText())){
							mensajes3.setText("Datos Incorrectos");
						}else{  
						logincliente.setVisible(false);
						opcionescliente.setVisible(true);
						index.setVisible(false);
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
				
				
				JButton btnRegistrarAdministrador = new JButton("Registrar Admin");
				btnRegistrarAdministrador.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					}
				});
				
				JPanel registroadmin = new JPanel();
				registroadmin.setBounds(0, 0, 463, 377);
				index.add(registroadmin);
				registroadmin.setVisible(false);
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
				
				JPanel loginadmin = new JPanel();
				loginadmin.setBounds(0, 0, 463, 377);
				index.add(loginadmin);
				loginadmin.setVisible(false);
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
						logincliente.setVisible(true);
						index.setVisible(false);
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
				lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
				lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Leon\\Pictures\\sunset_and_space_by_qauz-d6hwooq.jpg"));
				lblNewLabel.setBounds(0, 0, 461, 378);
				index.add(lblNewLabel);
	}
}
