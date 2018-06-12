package Proyecto3EV;

public class Movil {
	protected String nombre;
	protected String marca;
	protected int stock;
	protected int precio_salida;
	protected int precio_compra;
	
	public Movil(String nombre, String marca, int stock, int precio_salida) {
		this.nombre=nombre;
		this.marca=marca;
		this.stock=stock;
		this.precio_salida=precio_salida;
	}
	
	public Movil(String nombre, String marca, int stock, int precio_salida, int precio_compra) {
		this.nombre=nombre;
		this.marca=marca;
		this.stock=stock;
		this.precio_salida=precio_salida;
		this.precio_compra=precio_compra;
	}
	
	protected int getPrecio_compra() {
		return precio_compra;
	}

	protected void setPrecio_compra(int precio_compra) {
		this.precio_compra = precio_compra;
	}

	public Movil(String nombre, String marca, int precio_salida) {
		this.nombre=nombre;
		this.marca=marca;
		this.precio_salida=precio_salida;
	}
	
	public Movil(String nombre) {
		this.nombre=nombre;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getMarca() {
		return marca;
	}

	protected void setMarca(String marca) {
		this.marca = marca;
	}

	protected int getStock() {
		return stock;
	}

	protected void setStock(int stock) {
		this.stock = stock;
	}

	protected int getPrecio_salida() {
		return precio_salida;
	}

	protected void setPrecio_salida(int precio_salida) {
		this.precio_salida = precio_salida;
	}
	
}
