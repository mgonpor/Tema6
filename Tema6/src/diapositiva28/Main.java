package diapositiva28;

public class Main {
	
	public static void main(String[] args) {
		CuentaCorriente.setNombreDelBanco("Banco Mairena");
		System.out.println(CuentaCorriente.getNombreDelBanco());;
		CuentaCorriente.setNombreDelBanco("BBVA");
		System.out.println(CuentaCorriente.getNombreDelBanco());;
	}

}
