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
import javax.swing.SwingConstants;
import java.awt.Component;

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
	private JTextField cambiarnombrecliente;
	private JTextField cambiarpasswordcliente;
	private JTextField cambiartelefonocliente;
	private JTextField cambiarapellidocliente;
	private JTextField cambiarnickcliente;
	private JTextField cambiarcorreocliente;
	private JTextField alog_nick;
	private JTextField alog_password;
	private JTextField nombremovil;
	protected JPanel registroadmin;
	protected JPanel registrocliente;
	protected JPanel logincliente;
	private JTextField nmovil_marca;
	private JTextField nmovil_stock;
	private JTextField nmovil_precio;
	private JTextField nmovil_nombre;
	private JTextField modstockmovil_stock;
	private JTextField modstockmovil_nombre;
	private JTextField modmovil_precio;
	private JTextField modmovil_nombre2;
	protected JPanel opcionescliente;
	private JTextField nickcliente_consulta;
	protected JPanel loginadmin;
	private JTextField fechacompra;
	protected JPanel opcionesadmin;
	private JTextField nmovil_preciocompra;
		
	public EntornoGrafico() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 479, 416);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel registroadmin = new JPanel();
		registroadmin.setBounds(0, 0, 463, 377);
		frame.getContentPane().add(registroadmin);
		registroadmin.setVisible(false);
		registroadmin.setLayout(null);
		
		JPanel loginadmin = new JPanel();
		loginadmin.setBounds(0, 0, 463, 377);
		frame.getContentPane().add(loginadmin);
		loginadmin.setLayout(null);
		
		JPanel registrocliente = new JPanel();
		registrocliente.setBounds(0, 0, 463, 377);
		frame.getContentPane().add(registrocliente);
		registrocliente.setVisible(false);
		registrocliente.setLayout(null);
		
		JPanel modificarnick = new JPanel();
		modificarnick.setBounds(0, 0, 463, 377);
		frame.getContentPane().add(modificarnick);
		modificarnick.setVisible(false);
		modificarnick.setLayout(null);
		
		JPanel opcionescliente = new JPanel();
		opcionescliente.setVisible(false);
		
		JPanel logincliente = new JPanel();
		logincliente.setBounds(0, 0, 463, 377);
		frame.getContentPane().add(logincliente);
		logincliente.setVisible(false);
		logincliente.setLayout(null);	
		
		
		JPanel index = new JPanel();
		index.setBounds(0, 0, 463, 377);
		frame.getContentPane().add(index);
		index.setLayout(null);
		
		
		JButton btnRegistrarAdministrador = new JButton("Registrar Admin");
		btnRegistrarAdministrador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registroadmin.setVisible(true);
				index.setVisible(false);
			}
		});
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
				loginadmin.setVisible(true);
				index.setVisible(false);
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
		
		JPanel opcionesadmin = new JPanel();
		opcionesadmin.setVisible(false);
		
		JPanel nuevomovil = new JPanel();
		nuevomovil.setBounds(0, 0, 463, 377);
		frame.getContentPane().add(nuevomovil);
		nuevomovil.setVisible(false);
		nuevomovil.setLayout(null);
		
		JLabel label_15 = new JLabel("Nombre");
		label_15.setBounds(49, 11, 105, 41);
		nuevomovil.add(label_15);
		label_15.setForeground(Color.WHITE);
		label_15.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		
		JLabel label_16 = new JLabel("Marca");
		label_16.setForeground(Color.WHITE);
		label_16.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		label_16.setBounds(49, 63, 105, 41);
		nuevomovil.add(label_16);
		
		JLabel label_17 = new JLabel("Stock");
		label_17.setForeground(Color.WHITE);
		label_17.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		label_17.setBounds(49, 126, 105, 41);
		nuevomovil.add(label_17);
		
		JLabel label_18 = new JLabel("Precio Venta");
		label_18.setForeground(Color.WHITE);
		label_18.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		label_18.setBounds(30, 191, 169, 41);
		nuevomovil.add(label_18);
		
		nmovil_marca = new JTextField();
		nmovil_marca.setText((String) null);
		nmovil_marca.setColumns(10);
		nmovil_marca.setBounds(237, 71, 200, 35);
		nuevomovil.add(nmovil_marca);
		
		nmovil_stock = new JTextField();
		nmovil_stock.setText((String) null);
		nmovil_stock.setColumns(10);
		nmovil_stock.setBounds(237, 134, 200, 35);
		nuevomovil.add(nmovil_stock);
		
		nmovil_precio = new JTextField();
		nmovil_precio.setText((String) null);
		nmovil_precio.setColumns(10);
		nmovil_precio.setBounds(237, 199, 200, 35);
		nuevomovil.add(nmovil_precio);
		
		nmovil_nombre = new JTextField();
		nmovil_nombre.setText((String) null);
		nmovil_nombre.setColumns(10);
		nmovil_nombre.setBounds(237, 19, 200, 35);
		nuevomovil.add(nmovil_nombre);
		
		JLabel label_19 = new JLabel("");
		label_19.setForeground(Color.WHITE);
		label_19.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		label_19.setBounds(294, 284, 159, 41);
		nuevomovil.add(label_19);
		
		JButton button_13 = new JButton("Salir");
		button_13.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nuevomovil.setVisible(false);
				opcionesadmin.setVisible(true);
			}
		});
		
		JButton btnNewButton_8 = new JButton("Insertar");
		btnNewButton_8.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_8.addActionListener(new ActionListener() { //INSERTAR NUEVO MOVIL
			public void actionPerformed(ActionEvent e) {
				BD ss = new BD();
				Gestion_Movil gm = new Gestion_Movil();
			if(nmovil_nombre.getText().isEmpty() || nmovil_marca.getText().isEmpty() || nmovil_stock.getText().isEmpty() || nmovil_precio.getText().isEmpty()
					|| nmovil_preciocompra.getText().isEmpty()){
				label_19.setText("Campos Vacíos");
			}else if(ss.ComprobarMovil(nmovil_nombre.getText())){
				label_19.setText("El móvil ya existe");
			}
			else{
				int stock = Integer.parseInt(nmovil_stock.getText());
				int precio = Integer.parseInt(nmovil_precio.getText());
				int preciocompra = Integer.parseInt(nmovil_preciocompra.getText());
				gm.Añadir_Movil(nmovil_nombre.getText(), nmovil_marca.getText(), stock, precio, preciocompra);
				ss.InsertarFkAdmin(alog_nick.getText(), nmovil_nombre.getText());
				label_19.setText("Móvil Añadido");
			}
			}
		});
		btnNewButton_8.setBounds(33, 325, 101, 41);
		nuevomovil.add(btnNewButton_8);
		button_13.setBounds(274, 325, 101, 41);
		nuevomovil.add(button_13);
		
		JLabel label_28 = new JLabel("Precio Compra");
		label_28.setForeground(Color.WHITE);
		label_28.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		label_28.setBounds(30, 243, 169, 41);
		nuevomovil.add(label_28);
		
		nmovil_preciocompra = new JTextField();
		nmovil_preciocompra.setText((String) null);
		nmovil_preciocompra.setColumns(10);
		nmovil_preciocompra.setBounds(237, 245, 200, 35);
		nuevomovil.add(nmovil_preciocompra);
		
		JLabel lblNewLabel_11 = new JLabel("Fondo");
		lblNewLabel_11.setBounds(0, 0, 463, 377);
		nuevomovil.add(lblNewLabel_11);
		lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\Leon\\Pictures\\sunset_and_space_by_qauz-d6hwooq.jpg"));
		
		JPanel modificarprecio = new JPanel();
		modificarprecio.setBounds(0, 0, 463, 377);
		frame.getContentPane().add(modificarprecio);
		modificarprecio.setVisible(false);
		modificarprecio.setLayout(null);
		
		modmovil_precio = new JTextField();
		modmovil_precio.setText((String) null);
		modmovil_precio.setColumns(10);
		modmovil_precio.setBounds(202, 138, 200, 35);
		modificarprecio.add(modmovil_precio);
		
		JLabel label_23 = new JLabel("Inserta Precio");
		label_23.setForeground(Color.WHITE);
		label_23.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		label_23.setBounds(10, 130, 200, 41);
		modificarprecio.add(label_23);
		
		JLabel label_24 = new JLabel("Inserta M\u00F3vil");
		label_24.setForeground(Color.WHITE);
		label_24.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		label_24.setBounds(10, 63, 200, 41);
		modificarprecio.add(label_24);
		
		modmovil_nombre2 = new JTextField();
		modmovil_nombre2.setText((String) null);
		modmovil_nombre2.setColumns(10);
		modmovil_nombre2.setBounds(202, 71, 200, 35);
		modificarprecio.add(modmovil_nombre2);
		
		JLabel label_26 = new JLabel("");
		label_26.setForeground(Color.WHITE);
		label_26.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		label_26.setBounds(107, 11, 200, 41);
		modificarprecio.add(label_26);
		
		JButton button_15 = new JButton("Insertar");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BD ss = new BD();
				
				if(modmovil_nombre2.getText().isEmpty() || modmovil_precio.getText().isEmpty()){
					label_26.setText("Campos Vacíos");
				}else if(!ss.ComprobarMovil(modmovil_nombre2.getText())){
					label_26.setText("El móvil no existe");
				}else {
					int precio = Integer.parseInt(modmovil_precio.getText());
					ss.ModificarPrecioMovil(modmovil_nombre2.getText(), precio);
					label_26.setText("");
				}
				
			}
		});
		button_15.setFont(new Font("Stencil", Font.PLAIN, 17));
		button_15.setBounds(28, 233, 129, 71);
		modificarprecio.add(button_15);
		
		JButton button_16 = new JButton("Salir");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modificarprecio.setVisible(false);
				opcionesadmin.setVisible(true);
			}
		});
		button_16.setFont(new Font("Stencil", Font.PLAIN, 17));
		button_16.setBounds(216, 233, 129, 71);
		modificarprecio.add(button_16);
		
		JLabel label_25 = new JLabel("Fondo");
		label_25.setIcon(new ImageIcon("C:\\Users\\Leon\\Pictures\\sunset_and_space_by_qauz-d6hwooq.jpg"));
		label_25.setBounds(0, 0, 463, 377);
		modificarprecio.add(label_25);
		
		JPanel modificarstock = new JPanel();
		modificarstock.setBounds(0, 0, 463, 377);
		frame.getContentPane().add(modificarstock);
		modificarstock.setVisible(false);
		modificarstock.setLayout(null);
		
		modstockmovil_stock = new JTextField();
		modstockmovil_stock.setText((String) null);
		modstockmovil_stock.setColumns(10);
		modstockmovil_stock.setBounds(202, 138, 200, 35);
		modificarstock.add(modstockmovil_stock);
		
		JLabel label_20 = new JLabel("Inserta Stock");
		label_20.setForeground(Color.WHITE);
		label_20.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		label_20.setBounds(10, 130, 200, 41);
		modificarstock.add(label_20);
		
		JLabel label_21 = new JLabel("Inserta Móvil");
		label_21.setForeground(Color.WHITE);
		label_21.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		label_21.setBounds(10, 63, 200, 41);
		modificarstock.add(label_21);
		
		modstockmovil_nombre = new JTextField();
		modstockmovil_nombre.setText((String) null);
		modstockmovil_nombre.setColumns(10);
		modstockmovil_nombre.setBounds(202, 71, 200, 35);
		modificarstock.add(modstockmovil_nombre);
		
		JLabel label_22 = new JLabel("");
		label_22.setForeground(Color.WHITE);
		label_22.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		label_22.setBounds(107, 11, 200, 41);
		modificarstock.add(label_22);
		
		JButton button_14 = new JButton("Atrás");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modificarstock.setVisible(false);
				opcionesadmin.setVisible(true);
			}
		});
		
		JButton button_3 = new JButton("Insertar");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BD ss = new BD();
				
				if(modstockmovil_nombre.getText().isEmpty() || modstockmovil_stock.getText().isEmpty()){
					label_20.setText("Campos Vacíos");
				}else if(!ss.ComprobarMovil(modstockmovil_nombre.getText())){
					label_20.setText("El móvil no existe");
				}else{
					int stock = Integer.parseInt(modstockmovil_stock.getText());
					ss.ModificarStockMovil(modstockmovil_nombre.getText(), stock);
					label_20.setText("");
				}
				
			}
		});
		button_3.setFont(new Font("Stencil", Font.PLAIN, 17));
		button_3.setBounds(28, 233, 129, 71);
		modificarstock.add(button_3);
		button_14.setFont(new Font("Stencil", Font.PLAIN, 17));
		button_14.setBounds(216, 233, 129, 71);
		modificarstock.add(button_14);
		
		JLabel lblNewLabel_12 = new JLabel("Fondo");
		lblNewLabel_12.setIcon(new ImageIcon("C:\\Users\\Leon\\Pictures\\sunset_and_space_by_qauz-d6hwooq.jpg"));
		lblNewLabel_12.setBounds(0, 0, 463, 377);
		modificarstock.add(lblNewLabel_12);
		
		
		JPanel consultamovilesporcliente = new JPanel();
		consultamovilesporcliente.setBounds(0, 0, 463, 377);
		frame.getContentPane().add(consultamovilesporcliente);
		consultamovilesporcliente.setVisible(false);
		consultamovilesporcliente.setLayout(null);
		
		nickcliente_consulta = new JTextField();
		nickcliente_consulta.setText((String) null);
		nickcliente_consulta.setColumns(10);
		nickcliente_consulta.setBounds(231, 91, 200, 35);
		consultamovilesporcliente.add(nickcliente_consulta);
		
		JLabel label_27 = new JLabel("Nick Cliente");
		label_27.setForeground(Color.WHITE);
		label_27.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		label_27.setBounds(30, 76, 175, 56);
		consultamovilesporcliente.add(label_27);
		
		JLabel label_29 = new JLabel("");
		label_29.setForeground(Color.WHITE);
		label_29.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		label_29.setBounds(132, 11, 175, 56);
		consultamovilesporcliente.add(label_29);
		
		JButton btnNewButton_9 = new JButton("Consultar");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BD ss = new BD();
				System.out.println("MOVILES DE UN CLIENTE");
				if(nickcliente_consulta.getText().isEmpty()){
					label_29.setText("Campos Vacíos");
				}else if(!ss.ComprobarCliente(nickcliente_consulta.getText())){
					label_29.setText("Cliente Inexistente");
				}else{
					ss.MostrarClientesPorMóvil(nickcliente_consulta.getText());
				}

			}
		});
		btnNewButton_9.setBounds(57, 265, 105, 56);
		consultamovilesporcliente.add(btnNewButton_9);
		
		JButton button_19 = new JButton("Atrás");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.flush();
				consultamovilesporcliente.setVisible(false);
				opcionesadmin.setVisible(true);
			}
		});
		button_19.setBounds(263, 265, 105, 56);
		consultamovilesporcliente.add(button_19);
		
		JLabel lblNewLabel_13 = new JLabel("New label");
		lblNewLabel_13.setIcon(new ImageIcon("C:\\Users\\Leon\\Pictures\\sunset_and_space_by_qauz-d6hwooq.jpg"));
		lblNewLabel_13.setBounds(0, 0, 463, 377);
		consultamovilesporcliente.add(lblNewLabel_13);
		
		JPanel consultacomprasporfecha = new JPanel();
		consultacomprasporfecha.setBounds(0, 0, 463, 377);
		frame.getContentPane().add(consultacomprasporfecha);
		consultacomprasporfecha.setVisible(false);
		consultacomprasporfecha.setLayout(null);
		
		JLabel label_31 = new JLabel("Fecha");
		label_31.setForeground(Color.WHITE);
		label_31.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		label_31.setBounds(53, 125, 115, 41);
		consultacomprasporfecha.add(label_31);
		
		JLabel label_32 = new JLabel("Formato: Año-Mes-Día");
		label_32.setForeground(Color.WHITE);
		label_32.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		label_32.setBounds(120, 87, 267, 41);
		consultacomprasporfecha.add(label_32);
		
		fechacompra = new JTextField();
		fechacompra.setText((String) null);
		fechacompra.setColumns(10);
		fechacompra.setBounds(151, 133, 200, 35);
		consultacomprasporfecha.add(fechacompra);
		
		JLabel label_33 = new JLabel("");
		label_33.setForeground(Color.WHITE);
		label_33.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		label_33.setBounds(95, 21, 267, 41);
		consultacomprasporfecha.add(label_33);
		
		JButton button_20 = new JButton("Atrás");
		button_20.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.flush();
				consultacomprasporfecha.setVisible(false);
				opcionesadmin.setVisible(true);
			}
		});
		
		JButton btnNewButton_10 = new JButton("Mostrar");
		btnNewButton_10.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BD ss = new BD();
				System.out.println("COMPRAS POR FECHA");
				if(fechacompra.getText().isEmpty()){
					label_33.setText("Campo Vacío");
				}else if(!ss.MostrarComprasEnUnaFecha(fechacompra.getText())){
					
					label_33.setText("");
				}
				else{
					
					ss.MostrarComprasEnUnaFecha(fechacompra.getText());
					label_33.setText("");
				}
				
			}
		});
		btnNewButton_10.setBounds(27, 230, 115, 62);
		consultacomprasporfecha.add(btnNewButton_10);
		button_20.setBounds(232, 230, 115, 62);
		consultacomprasporfecha.add(button_20);
		
		JLabel label_30 = new JLabel("Fondo");
		label_30.setIcon(new ImageIcon("C:\\Users\\Leon\\Pictures\\sunset_and_space_by_qauz-d6hwooq.jpg"));
		label_30.setBounds(0, 0, 463, 377);
		consultacomprasporfecha.add(label_30);
		opcionesadmin.setBounds(0, 0, 463, 377);
		frame.getContentPane().add(opcionesadmin);
		opcionesadmin.setLayout(null);
		
		JButton btnNewButton_7 = new JButton("Mostrar Compras");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BD ss = new BD();
				System.out.println("CLIENTES QUE HAN HECHO UNA COMPRA");
				ss.MostrarClientesQueHayanHechoUnaCompra();
			}
		});
		btnNewButton_7.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_7.setBounds(133, 81, 172, 59);
		opcionesadmin.add(btnNewButton_7);
		
		JButton button_2 = new JButton("Nuevo Movil");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BD ss = new BD();
				ss.ListadoMoviles2();
				opcionesadmin.setVisible(false);
				nuevomovil.setVisible(true);
			}
		});
		button_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		button_2.setBounds(28, 177, 134, 59);
		opcionesadmin.add(button_2);
		
		JButton button_4 = new JButton("Modificar Precio");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BD ss = new BD();
				ss.ListadoMoviles2();
				opcionesadmin.setVisible(false);
				modificarprecio.setVisible(true);
			}
		});
		button_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		button_4.setBounds(212, 177, 172, 59);
		opcionesadmin.add(button_4);
		
		JButton button_5 = new JButton("Modificar Stock");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BD ss = new BD();
				ss.ListadoMoviles2();
				opcionesadmin.setVisible(false);
				modificarstock.setVisible(true);
			}
		});
		button_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		button_5.setBounds(28, 265, 134, 59);
		opcionesadmin.add(button_5);
		
		JButton button_6 = new JButton("Móviles de un cliente");
		button_6.setBorder(null);
		button_6.setHorizontalTextPosition(SwingConstants.CENTER);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opcionesadmin.setVisible(false);
				consultamovilesporcliente.setVisible(true);
			}
		});
		button_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		button_6.setBounds(10, 11, 212, 59);
		opcionesadmin.add(button_6);
		
		JButton button_12 = new JButton("Mostrar compras por fecha");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opcionesadmin.setVisible(false);
				consultacomprasporfecha.setVisible(true);
			}
		});
		button_12.setBorder(null);
		button_12.setAlignmentX(Component.CENTER_ALIGNMENT);
		button_12.setHorizontalTextPosition(SwingConstants.CENTER);
		button_12.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		button_12.setBounds(249, 11, 204, 59);
		opcionesadmin.add(button_12);
		
		JButton button_17 = new JButton("Salir");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opcionesadmin.setVisible(false);
				index.setVisible(true);
			}
		});
		button_17.setBounds(212, 265, 171, 59);
		opcionesadmin.add(button_17);
		button_17.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		
		JLabel label_4 = new JLabel("Fondo");
		label_4.setBounds(0, 0, 463, 377);
		opcionesadmin.add(label_4);
		label_4.setIcon(new ImageIcon("C:\\Users\\Leon\\Pictures\\sunset_and_space_by_qauz-d6hwooq.jpg"));
		opcionescliente.setBounds(0, 0, 463, 377);
		frame.getContentPane().add(opcionescliente);
		opcionescliente.setLayout(null);
		
		JPanel listamoviles = new JPanel();
		listamoviles.setBounds(0, 0, 463, 377);
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
		
		
		btnNewButton_5.setBounds(65, 164, 162, 48);
		modificarnombre.add(btnNewButton_5);
		
		JButton button_25 = new JButton("Atr\u00E1s");
		button_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modificarnombre.setVisible(false);
				opcionescliente.setVisible(true);
			}
		});
		button_25.setBounds(259, 164, 162, 48);
		modificarnombre.add(button_25);
		
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
		button_11.setBounds(69, 164, 162, 48);
		modificarcorreo.add(button_11);
		
		JButton button_26 = new JButton("Atr\u00E1s");
		button_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modificarcorreo.setVisible(false);
				opcionescliente.setVisible(true);
			}
		});
		button_26.setBounds(270, 164, 162, 48);
		modificarcorreo.add(button_26);
		
		JLabel label_14 = new JLabel("New label");
		label_14.setIcon(new ImageIcon("C:\\Users\\Leon\\Pictures\\sunset_and_space_by_qauz-d6hwooq.jpg"));
		label_14.setBounds(0, 0, 463, 377);
		modificarcorreo.add(label_14);
		
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
		button_8.setBounds(65, 174, 162, 48);
		modificartelefono.add(button_8);
		
		JButton button_28 = new JButton("Atr\u00E1s");
		button_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modificartelefono.setVisible(false);
				opcionescliente.setVisible(true);
			}
		});
		button_28.setBounds(277, 174, 162, 48);
		modificartelefono.add(button_28);
		
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
		button_7.setBounds(62, 164, 162, 48);
		modificarpassword.add(button_7);
		
		JButton button_29 = new JButton("Atr\u00E1s");
		button_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modificarpassword.setVisible(false);
				opcionescliente.setVisible(true);
			}
		});
		button_29.setBounds(255, 164, 162, 48);
		modificarpassword.add(button_29);
		
		JLabel label_6 = new JLabel("New label");
		label_6.setIcon(new ImageIcon("C:\\Users\\Leon\\Pictures\\sunset_and_space_by_qauz-d6hwooq.jpg"));
		label_6.setBounds(0, 0, 463, 377);
		modificarpassword.add(label_6);
		
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
		button_9.setBounds(78, 164, 162, 48);
		modificarapellido.add(button_9);
		
		JButton button_27 = new JButton("Atr\u00E1s");
		button_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modificarapellido.setVisible(false);
				opcionescliente.setVisible(true);
			}
		});
		button_27.setBounds(269, 164, 162, 48);
		modificarapellido.add(button_27);
		
		JLabel label_10 = new JLabel("New label");
		label_10.setIcon(new ImageIcon("C:\\Users\\Leon\\Pictures\\sunset_and_space_by_qauz-d6hwooq.jpg"));
		label_10.setBounds(0, 0, 463, 377);
		modificarapellido.add(label_10);
		
		JPanel compramoviles = new JPanel();
		compramoviles.setBounds(0, 0, 463, 377);
		frame.getContentPane().add(compramoviles);
		compramoviles.setVisible(false);
		compramoviles.setLayout(null);
		
		nombremovil = new JTextField();
		nombremovil.setText((String) null);
		nombremovil.setColumns(10);
		nombremovil.setBounds(158, 122, 190, 51);
		compramoviles.add(nombremovil);
		
		JLabel label_3 = new JLabel("Inserta nombre del móvil");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Times New Roman", Font.PLAIN, 37));
		label_3.setBounds(38, 11, 391, 88);
		compramoviles.add(label_3);
		
		JButton btnNewButton_6 = new JButton("Comprar");
		btnNewButton_6.addActionListener(new ActionListener() { //COMPRAR MOVIL
			public void actionPerformed(ActionEvent e) {
				BD ss = new BD();
				Gestion_Compra gc = new Gestion_Compra();
				if(nombremovil.getText().isEmpty()){
					label_3.setText("Campo Vacío");
				}else if(!ss.ComprobarMovil(nombremovil.getText())){
					label_3.setText("Móvil Inexistente");
				}else {
					gc.ComprarMovil(clog_nick.getText(), nombremovil.getText());
					label_3.setText("Compra Realizada");
			
				}
			}
		});
		btnNewButton_6.setBounds(161, 227, 187, 47);
		compramoviles.add(btnNewButton_6);
		
		JButton button_1 = new JButton("Atrás");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opcionescliente.setVisible(true);
				compramoviles.setVisible(false);
			}
		});
		button_1.setBounds(158, 302, 187, 47);
		compramoviles.add(button_1);
		
		
		JLabel lblNewLabel_5 = new JLabel("Fondo");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Leon\\Pictures\\sunset_and_space_by_qauz-d6hwooq.jpg"));
		lblNewLabel_5.setBounds(0, 0, 463, 377);
		compramoviles.add(lblNewLabel_5);
		
		
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
				} else if(ss.ComprobarCliente(cambiarnickcliente.getText())  || ss.ComprobarAdmin(cambiarnickcliente.getText())){
					label_11.setText("Cliente Existente");
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
		button_10.setBounds(67, 164, 162, 48);
		modificarnick.add(button_10);
		
		JButton button_24 = new JButton("Atrás");
		button_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modificarnick.setVisible(false);
				opcionescliente.setVisible(true);
			}
		});
		button_24.setBounds(259, 164, 162, 48);
		modificarnick.add(button_24);
		
		JLabel label_12 = new JLabel("New label");
		label_12.setIcon(new ImageIcon("C:\\Users\\Leon\\Pictures\\sunset_and_space_by_qauz-d6hwooq.jpg"));
		label_12.setBounds(0, 0, 463, 377);
		modificarnick.add(label_12);
		
		
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
		mensajes2.setBounds(153, 201, 200, 88);
		registroadmin.add(mensajes2);
		
		JButton btnNewButton_2 = new JButton("Registrarse");
		btnNewButton_2.addActionListener(new ActionListener() { // REGISTRO ADMINISTRADOR
			public void actionPerformed(ActionEvent e) {
				BD ss = new BD();
				Gestion_Usuarios gu = new Gestion_Usuarios();
				if(a_nick.getText().isEmpty() || a_password.getText().isEmpty()){
					mensajes2.setText("Campos Vacíos");
				} else if(ss.ComprobarAdmin(a_nick.getText()) || ss.ComprobarCliente(a_nick.getText())){
					System.out.println("Nick existente");
				}else {gu.Pedir_Administrador(a_nick.getText(), a_password.getText());
					registroadmin.setVisible(false);
					index.setVisible(true);
				}
				
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2.setBounds(42, 273, 132, 63);
		registroadmin.add(btnNewButton_2);
		
		JButton button_30 = new JButton("Atrás");
		button_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registroadmin.setVisible(false);
				index.setVisible(true);
			}
		});
		button_30.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button_30.setBounds(278, 273, 132, 63);
		registroadmin.add(button_30);
		
		JLabel lblNewLabel_1 = new JLabel("Fondo");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Leon\\Pictures\\sunset_and_space_by_qauz-d6hwooq.jpg"));
		lblNewLabel_1.setBounds(0, 0, 463, 377);
		registroadmin.add(lblNewLabel_1);
	
		
		JLabel lblNewLabel_10 = new JLabel("Nick");
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.PLAIN, 37));
		lblNewLabel_10.setBounds(38, 45, 160, 56);
		loginadmin.add(lblNewLabel_10);
		
		JLabel label_2 = new JLabel("Password");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 37));
		label_2.setBounds(28, 165, 197, 51);
		loginadmin.add(label_2);
		
		alog_nick = new JTextField();
		alog_nick.setText((String) null);
		alog_nick.setColumns(10);
		alog_nick.setBounds(250, 45, 190, 51);
		loginadmin.add(alog_nick);
		
		alog_password = new JTextField();
		alog_password.setText((String) null);
		alog_password.setColumns(10);
		alog_password.setBounds(250, 159, 190, 51);
		loginadmin.add(alog_password);
		
		JLabel mensajes4 = new JLabel("");
		mensajes4.setForeground(Color.WHITE);
		mensajes4.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		mensajes4.setBounds(241, 252, 212, 88);
		loginadmin.add(mensajes4);
		
		JButton button = new JButton("Entrar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //LOGIN ADMIN
				BD ss = new BD();
				
				if(alog_nick.getText().isEmpty() || alog_password.getText().isEmpty()){
					mensajes4.setText("Campos Vacíos");
				}else if(!ss.ComprobarAdmin(alog_nick.getText())){
					mensajes4.setText("Nick Inexistente");
				}else if(!ss.ValidarAdmin(alog_nick.getText(), alog_password.getText())){
					mensajes4.setText("Datos Incorrectos");
				}else{
					mensajes4.setText("");
					loginadmin.setVisible(false);
					opcionesadmin.setVisible(true);
				}
				
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 21));
		button.setBounds(48, 269, 134, 71);
		loginadmin.add(button);
		
		JButton button_22 = new JButton("Atrás");
		button_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginadmin.setVisible(false);
				index.setVisible(true);
			}
		});
		button_22.setFont(new Font("Tahoma", Font.PLAIN, 21));
		button_22.setBounds(271, 269, 134, 71);
		loginadmin.add(button_22);
		
		JLabel lblNewLabel_9 = new JLabel("Fondo");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\Leon\\Pictures\\sunset_and_space_by_qauz-d6hwooq.jpg"));
		lblNewLabel_9.setBounds(0, 0, 463, 377);
		loginadmin.add(lblNewLabel_9);
		loginadmin.setVisible(false);
		
		
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
		mensajes.setBounds(152, 266, 200, 51);
		
		JButton btnNewButton_1 = new JButton("Registrarse");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // REGISTRO DEL CLIENTE
				BD ss = new BD();
				Gestion_Usuarios gu = new Gestion_Usuarios();
				if(c_nick.getText().isEmpty() || c_password.getText().isEmpty() || c_correo.getText().isEmpty()
		|| c_nombre.getText().isEmpty() || c_apellido.getText().isEmpty() || c_telefono.getText().isEmpty()){
					mensajes.setText("Campos Vacíos");
				} else if(ss.ComprobarCliente(c_nick.getText()) || ss.ComprobarAdmin(c_nick.getText())){
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
		
		JButton button_21 = new JButton("Atrás");
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registrocliente.setVisible(false);
				index.setVisible(true);
			}
		});
		button_21.setFont(new Font("Tahoma", Font.PLAIN, 17));
		button_21.setBounds(253, 311, 163, 41);
		registrocliente.add(button_21);
		
		JLabel u_correo = new JLabel("Fondo");
		u_correo.setIcon(new ImageIcon("C:\\Users\\Leon\\Pictures\\sunset_and_space_by_qauz-d6hwooq.jpg"));
		u_correo.setBounds(0, 0, 463, 378);
		registrocliente.add(u_correo);
				
				JLabel label_1 = new JLabel("Password");
				label_1.setForeground(Color.WHITE);
				label_1.setFont(new Font("Times New Roman", Font.PLAIN, 37));
				label_1.setBounds(50, 151, 161, 57);
				logincliente.add(label_1);
				
				JLabel label = new JLabel("Nick");
				label.setForeground(Color.WHITE);
				label.setFont(new Font("Times New Roman", Font.PLAIN, 37));
				label.setBounds(62, 50, 114, 71);
				logincliente.add(label);
				
				JLabel mensajes3 = new JLabel("");
				mensajes3.setBounds(229, 223, 212, 88);
				logincliente.add(mensajes3);
				mensajes3.setForeground(Color.WHITE);
				mensajes3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
				
				clog_nick = new JTextField();
				clog_nick.setText((String) null);
				clog_nick.setColumns(10);
				clog_nick.setBounds(263, 69, 190, 51);
				logincliente.add(clog_nick);
				
				clog_password = new JTextField();
				clog_password.setText((String) null);
				clog_password.setColumns(10);
				clog_password.setBounds(263, 151, 190, 51);
				logincliente.add(clog_password);
				
				JButton btnNewButton_3 = new JButton("Entrar");
				btnNewButton_3.addActionListener(new ActionListener() { //LOGIN  CLIENTE
					public void actionPerformed(ActionEvent e) {
				
						BD ss = new BD(); 
						
						if(clog_nick.getText().isEmpty() || clog_password.getText().isEmpty()){
							mensajes3.setText("Campos Vacíos");
						}else if(!ss.ComprobarCliente(clog_nick.getText())){
							mensajes3.setText("Cliente Inexistente");
						}
						else if(!ss.ValidarCliente(clog_nick.getText(), clog_password.getText())){
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
				
				JButton button_23 = new JButton("Atrás");
				button_23.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						logincliente.setVisible(false);
						index.setVisible(true);
					}
				});
				button_23.setFont(new Font("Tahoma", Font.PLAIN, 21));
				button_23.setBounds(239, 267, 134, 71);
				logincliente.add(button_23);
				
				JLabel lblNewLabel_3 = new JLabel("Fondo");
				lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Leon\\Pictures\\sunset_and_space_by_qauz-d6hwooq.jpg"));
				lblNewLabel_3.setBounds(0, 0, 463, 377);
				logincliente.add(lblNewLabel_3);
				
				JButton btnNewButton_4 = new JButton("Comprar M\u00F3vil");
				btnNewButton_4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						BD ss = new BD();
						ss.ListadoMoviles();
						opcionescliente.setVisible(false);
						compramoviles.setVisible(true);
					}
				});
				btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
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
				btnModificarNick.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
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
				btnModificarContrasea.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
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
				btnModificarNombre.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
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
				btnModificarApellido.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
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
				btnModificarCorreo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
				btnModificarCorreo.setBounds(50, 290, 167, 55);
				opcionescliente.add(btnModificarCorreo);
				
				JButton button_18 = new JButton("Atrás");
				button_18.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						opcionescliente.setVisible(false);
						index.setVisible(true);
					}
				});
				button_18.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
				button_18.setBounds(240, 291, 167, 55);
				opcionescliente.add(button_18);
				
				JLabel lblNewLabel_6 = new JLabel("Fondo");
				lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\Leon\\Pictures\\sunset_and_space_by_qauz-d6hwooq.jpg"));
				lblNewLabel_6.setBounds(0, 0, 463, 377);
				opcionescliente.add(lblNewLabel_6);
	}
}
