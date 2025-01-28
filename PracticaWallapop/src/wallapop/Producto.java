package wallapop;

import java.util.NoSuchElementException;

import enumerados.Estado;

public class Producto {

	private int codigo;
	private String nombre;
	private double precio;
	private Estado estado;
	
	private static int ultimoCodigo = 1;
	private static Producto masCaro;
	private static Producto masBarato;
	private static Producto ultimoVendido;
	private static int totalCompradosYVendidos;
	
	public Producto(String nombre, double precio, String estado){
		setCodigo();
		setNombre(nombre);
		setPrecio(precio);
		setEstado(estado);
		if(masCaro==null && masBarato==null) {
			masCaro = this;
			masBarato = this;
		}
		else if(this.precio > masCaro.precio) {
			masCaro = this;
		}else if(this.precio < masBarato.precio) {
			masBarato = this;
		}
	}

	public int getCodigo() {
		return codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public Estado getEstado() {
		return estado;
	}
	
	public static int getTotalProductos() {
		return totalCompradosYVendidos;
	}
	public static Producto getMasCaro() {
		return masCaro;
	}
	public static Producto getMasBarato() {
		return masBarato;
	}
	public static Producto getUltimoVendido() {
		return ultimoVendido;
	}
	
	private void setCodigo() {
		this.codigo = ultimoCodigo++;
	}
	public void setNombre(String nombre) {
		if(nombre == null || nombre.isBlank()) {
			throw new IllegalArgumentException("Nombre vacío o nulo");
		}
		this.nombre = nombre;
	}
	public void setPrecio(double precio) {
		if(precio < 0.01) {
			throw new IllegalArgumentException("El precio no puede ser menor de un céntimo");
		}
		this.precio = precio;
	}
	public void setEstado(String estado) {
		this.estado = Estado.valueOf(estado.toUpperCase());
	}
	
	public void terminarTrato() {
		ultimoVendido = this;
		totalCompradosYVendidos++;
	}
	
	public void mostrarProducto() {
		System.out.printf("\n%d. %s - %.02f€ (%s) \n", codigo, nombre, precio, estado.toString());
	}

	public static void mostrarInformeProductos() {
		if(ultimoCodigo == 1) {
			throw new NoSuchElementException("No se ha añadido ningún producto aún.");
		}else {
			System.out.printf("\nProducto vendido más caro: ");
			masCaro.mostrarProducto();
			System.out.printf("\nProducto vendido más barato: ");
			masBarato.mostrarProducto();
			if(totalCompradosYVendidos <= 0) {
				System.out.printf("\nNingún producto vendido aún");
			}else {
				System.out.printf("\nÚltimo producto vendido: ");
				ultimoVendido.mostrarProducto();
			}
		}
		System.out.println();
	}
}
