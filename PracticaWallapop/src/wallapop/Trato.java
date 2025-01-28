package wallapop;

import java.time.LocalDate;

public class Trato {

	private Comprador comprador;
	private Vendedor vendedor;
	private Producto producto;
	
	private LocalDate validacionComprador;
	private LocalDate validacionVendedor;
	
	public Trato(Comprador comprador, Vendedor vendedor, Producto producto) {
		boolean esta = false;
		for(Producto p : vendedor.getEnVenta()) {
			if(p.getCodigo() == producto.getCodigo()) {
				esta = true;
			}
		}
		if(!esta) {
			throw new IllegalArgumentException("Este producto no está en venta por este vendedor");
		}
		if(comprador.getSaldo() < producto.getPrecio()) {
			throw new IllegalArgumentException("Este comprador no tiene dinero para este producto");
		}
		this.comprador = comprador;
		this.vendedor = vendedor;
		this.producto = producto;
	}

	public LocalDate getValidacionComprador() {
		return validacionComprador;
	}
	public LocalDate getValidacionVendedor() {
		return validacionVendedor;
	}
	public Comprador getComprador() {
		return comprador;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setValidacionComprador(LocalDate validacionComprador) {
		this.validacionComprador = validacionComprador;
	}
	public void setValidacionVendedor(LocalDate validacionVendedor) {
		this.validacionVendedor = validacionVendedor;
	}

	public void firmarTrato() {
		this.comprador.pagar(this.producto.getPrecio());
		
		this.vendedor.removeEnVenta(producto);
		this.vendedor.addVendidos(producto);
		this.comprador.addComprados(producto);
		
		this.producto.terminarTrato();
		this.comprador.terminarTrato();
		this.vendedor.terminarTrato();
	}
	
	public void mostrarInfoTrato() {
		System.out.printf("\nComprador: %s - Vendedor: %s - Producto: %s", comprador.getNombre(), vendedor.getNombre(), producto.getNombre());
		System.out.printf("\nEstado: ");
		if(validacionComprador != null) {
			if(validacionVendedor != null) {
				System.out.printf("FINALIZADO");
			}else {
				System.out.printf("Falta validación del VENDEDOR");
			}
		}else {
			if(validacionVendedor != null) {
				System.out.printf("Falta validación del COMPRADOR");
			}else {
				System.out.printf("SIN VALIDAR");
			}
		}
		System.out.println();
	}
	
}
