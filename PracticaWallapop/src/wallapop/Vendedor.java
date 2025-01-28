package wallapop;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Vendedor {

	private String nombre;
	private List<Producto> enVenta;
	private List<Producto> vendidos;
	private int tratosRealizados = 0;
	
	private static Vendedor maximoVendedor;
	
	public Vendedor(String nombre) {
		setNombre(nombre);
		this.enVenta = new ArrayList<Producto>();
		this.vendidos = new ArrayList<Producto>();
	}
	
	public String getNombre() {
		return nombre;
	}
	public List<Producto> getEnVenta() {
		return enVenta;
	}
	public List<Producto> getVendidos() {
		return vendidos;
	}
	public int getTratosRealizados() {
		return tratosRealizados;
	}
	
	public void setNombre(String nombre) {
		if(nombre == null || nombre.isBlank()) {
			throw new IllegalArgumentException("Nombre vacío o nulo");
		}
		this.nombre = nombre;
	}
	
	public void validarTrato(Trato trato) {
		if(trato.getVendedor() != this) {
			throw new IllegalArgumentException("Este vendedor no participa en este trato.");
		}
		if(trato.getValidacionVendedor() != null) {
			throw new IllegalCallerException("Este vendedor ya ha validado este trato");
		}
		trato.setValidacionVendedor(LocalDate.now());
		if(trato.getValidacionComprador() != null) {
			trato.firmarTrato();
		}
	}
	public void terminarTrato() {
		this.tratosRealizados++;
		if(maximoVendedor == null) {
			maximoVendedor = this;
		}
		else if(maximoVendedor.tratosRealizados < this.tratosRealizados) {
			maximoVendedor = this;
		}
	}
	
	public void addEnVenta(Producto producto) {
		if(producto == null) {
			throw new IllegalArgumentException("El producto introducido es nulo");
		}
		for(Producto p : this.enVenta) {
			if(p.getCodigo() == producto.getCodigo()) {
				throw new IllegalArgumentException("Ya tiene este producto");
			}
		}
		this.enVenta.add(producto);
	}
	public Producto removeEnVenta(Producto producto) {
		if(producto == null) {
			throw new IllegalArgumentException("El producto introducido es nulo");
		}
		boolean esta = false;
		for(Producto p : this.enVenta) {
			if(p.getCodigo() == producto.getCodigo()) {
				esta = true;
			}
		}
		if(!esta) {
			throw new IllegalArgumentException("El producto no está en la lista");
		}
		this.enVenta.remove(producto);
		return producto;
	}
	public Producto removeEnVenta(int i) {
		if(i<0 || i>=this.enVenta.size()) {
			throw new IndexOutOfBoundsException("El índice no existe en la lista");
		}
		Producto producto = enVenta.get(i);
		this.enVenta.remove(i);
		return producto;
	}
	
	
	public void addVendidos(Producto producto) {
		if(producto == null) {
			throw new IllegalArgumentException("El producto introducido es nulo");
		}
		for(Producto p : this.vendidos) {
			if(p.getCodigo() == producto.getCodigo()) {
				throw new IllegalArgumentException("Ya tiene este producto");
			}
		}
		this.vendidos.add(producto);
	}
	public void removeVendidos(Producto producto) {
		if(producto == null) {
			throw new IllegalArgumentException("El producto introducido es nulo");
		}
		boolean esta = false;
		for(Producto p : this.vendidos) {
			if(p.getCodigo() == producto.getCodigo()) {
				esta = true;
			}
		}
		if(!esta) {
			throw new IllegalArgumentException("El producto no está en la lista");
		}
		this.vendidos.remove(producto);
	}
	public void removeVendidos(int i) {
		if(i<0 || i>=this.vendidos.size()) {
			throw new IndexOutOfBoundsException("El índice no existe en la lista");
		}
		this.vendidos.remove(i);
	}
	
	public void mostrarVendedor() {
		System.out.printf("\n%s, %d tratos realizados", nombre, tratosRealizados);
		System.out.printf("\nEn venta: ");
		for(Producto p : enVenta) {
			System.out.printf("%d:%s, ",p.getCodigo(), p.getNombre());
		}
		System.out.printf("\nVendidos: ");
		for(Producto p : vendidos) {
			System.out.printf("%d:%s, ", p.getCodigo(), p.getNombre());
		}
		System.out.println();
	}
	
	public static void mostrarMaximoVendedor() {
		if(maximoVendedor == null) {
			throw new NoSuchElementException("No ha habido ninguna compra aún");
		}else {
			System.out.printf("\nMáximo vendedor: ");
			maximoVendedor.mostrarVendedor();
		}
		System.out.println();
	}
}
