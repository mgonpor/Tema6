package diapositiva29;

public class Main {

	public static void main(String[] args) {

		Tiempo t1 = new Tiempo(0, 30, 20);
		t1.mostrar();
		Tiempo t2 = new Tiempo(0, 35, 40);
		t2.mostrar();
		
		t1.restarTiempos(t2);
		
	}

}
