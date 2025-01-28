package wallapop;

public class Main {

	public static void main(String[] args) {
		
		Producto p1 = new Producto("silla", 15, "nuevo");
		Producto p2 = new Producto("mesa", 30, "precintado");
		Producto p3 = new Producto("altavoz", 10, "usado");
		Comprador manolo = new Comprador("Manolo", 50);
		Vendedor vladi = new Vendedor("Vladi");
		
		vladi.addEnVenta(p1);
		vladi.addEnVenta(p2);
		vladi.addEnVenta(p3);
		
		vladi.mostrarVendedor();
		manolo.mostrarComprador();
		
		Trato t1 = new Trato(manolo, vladi, p1);
		t1.mostrarInfoTrato();
		
		manolo.validarTrato(t1);
		
		t1.mostrarInfoTrato();
		
		vladi.validarTrato(t1);

		t1.mostrarInfoTrato();
		vladi.mostrarVendedor();
		manolo.mostrarComprador();
		
		Trato t2 = new Trato(manolo, vladi, p3);
		t2.mostrarInfoTrato();
		
		vladi.validarTrato(t2);
		
		t2.mostrarInfoTrato();
		
		manolo.validarTrato(t2);

		t2.mostrarInfoTrato();
		vladi.mostrarVendedor();
		manolo.mostrarComprador();
		
		
		Producto.mostrarInformeProductos();
		Comprador.mostrarMaximoComprador();
		Vendedor.mostrarMaximoVendedor();
	}

}
