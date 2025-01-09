package diapositiva29;

public class Tiempo {

	int segundos;
	
	//Constructores
	public Tiempo(int horas, int minutos, int segundos){
		if(horas < 0 || horas > 23) {
			throw new IllegalArgumentException("Las horas están comprendidas entre 0 y 23");
		}
		if(minutos < 0 || minutos > 59) {
			throw new IllegalArgumentException("Los minutos están comprendidos entre 0 y 59");
		}
		if(segundos < 0 || segundos > 59) {
			throw new IllegalArgumentException("Los segundos están comprendidos entre 0 y 59");
		}
		
		this.segundos = segundos + 60*minutos + 3600*horas;
	}
	
	//Métodos
	void sumarTiempos(Tiempo t) {
		int segundosT = this.segundos + t.segundos;
		int horas = segundosT/3600;
		int minutos = segundosT/60;
		System.out.printf("\n%dh %dm %ds", horas, minutos, segundosT%60);
	}
	void restarTiempos(Tiempo t) {
		int segundosT = this.segundos - t.segundos;
		if(segundosT < 0) {
			segundosT += 86400;
		}
		int horas = segundosT/3600;
		int minutos = segundosT/60;
		System.out.printf("\n%dh %dm %ds", horas, minutos, segundosT%60);
	}
	void mostrar() {
		int horas = this.segundos/3600;
		int minutos = this.segundos/60;
		System.out.printf("\n%dh %dm %ds", horas, minutos, this.segundos%60);
	}
}
