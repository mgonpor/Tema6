package wallapop;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Comprador {

	private String nombre;
	private List<Producto> comprados;
	private double saldo;
	private int tratosRealizados = 0;
	
	private static Comprador maximoComprador;
	
	public Comprador(String nombre, double dinero) {
		setNombre(nombre);
		setSaldo(dinero);
		this.comprados = new ArrayList<Producto>();
	}
	
	public String getNombre() {
		return nombre;
	}
	public List<Producto> getComprados() {
		return comprados;
	}
	public double getSaldo() {
		return saldo;
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
	public void setSaldo(double dinero) {
		if(dinero < 0) {
			throw new IllegalArgumentException("No se puede tener dinero negativo");
		}
		this.saldo = dinero;
	}
	
	public void validarTrato(Trato trato) {
		if(trato.getComprador() != this) {
			throw new IllegalArgumentException("Este vendedor no participa en este trato.");
		}
		if(trato.getValidacionComprador() != null) {
			throw new IllegalCallerException("Este vendedor ya ha validado este trato");
		}
		trato.setValidacionComprador(LocalDate.now());
		if(trato.getValidacionVendedor() != null) {
			trato.firmarTrato();
		}
	}
	public void pagar(double aPagar) {
		if(Math.abs(aPagar) > this.saldo) {
			throw new IllegalArgumentException("El comprador no tiene dinero suficiente");
		}
		this.saldo -= Math.abs(aPagar);
	}
	public void terminarTrato() {
		this.tratosRealizados++;
		if(maximoComprador == null) {
			maximoComprador = this;
		}
		else if(maximoComprador.tratosRealizados < this.tratosRealizados) {
			maximoComprador = this;
		}
	}
	
	public void addComprados(Producto producto) {
		if(producto == null) {
			throw new IllegalArgumentException("El producto introducido es nulo");
		}
		for(Producto p : this.comprados) {
			if(p.getCodigo() == producto.getCodigo()) {
				throw new IllegalArgumentException("Ya tiene este producto");
			}
		}
		this.comprados.add(producto);
	}
	public Producto removeComprados(Producto producto) {
		if(producto == null) {
			throw new IllegalArgumentException("El producto introducido es nulo");
		}
		boolean esta = false;
		for(Producto p : this.comprados) {
			if(p.getCodigo() == producto.getCodigo()) {
				esta = true;
			}
		}
		if(!esta) {
			throw new IllegalArgumentException("El producto no está en la lista");
		}
		this.comprados.remove(producto);
		return producto;
	}
	public Producto removeComprados(int i) {
		if(i<0 || i>=this.comprados.size()) {
			throw new IndexOutOfBoundsException("El índice no existe en la lista");
		}
		Producto producto = comprados.get(i);
		this.comprados.remove(i);
		return producto;
	}
	
	public void mostrarComprador() {
		System.out.printf("\n%s, %d tratos realizados", nombre, tratosRealizados);
		System.out.printf("\nSaldo: %.02f", saldo);
		System.out.printf("\nComprados: ");
		for(Producto p : comprados) {
			System.out.printf("%d:%s, ",p.getCodigo(), p.getNombre());
		}
		System.out.println();
	}
	
	public static void mostrarMaximoComprador() {
		if(maximoComprador == null) {
			throw new NoSuchElementException("No ha habido ninguna compra aún");
		}else {
			System.out.printf("\nMáximo comprador: ");
			maximoComprador.mostrarComprador();
		}
		System.out.println();
	}
}
