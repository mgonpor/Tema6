package maquinaria;

import java.util.ArrayList;
import java.util.List;
import personal.Maquinista;

public class Tren {

	private Locomotora locomotora;
	private List<Vagon> listaVagones;
	private Maquinista maquinista;
	
	public Tren(Locomotora locomotora, Maquinista maquinista) {
		setLocomotora(locomotora);
		this.listaVagones = new ArrayList<Vagon>();
		setMaquinista(maquinista);
	}
	
	public Locomotora getLocomotora() {
		return locomotora;
	}
	private void setLocomotora(Locomotora locomotora) {
		this.locomotora = locomotora;
	}
	
	public List<Vagon> getListaVagones() {
		System.out.printf("\nTamaño actual: %d", this.listaVagones.size());
		return listaVagones;
	}
	public void setListaVagones(List<Vagon> listaVagones) {
		this.listaVagones = listaVagones;
	}
	
	public Maquinista getMaquinista() {
		return maquinista;
	}
	private void setMaquinista(Maquinista maquinista) {
		if(maquinista == null) {
			throw new IllegalArgumentException("El maquinista no puede ser nulo");
		}
		this.maquinista = maquinista;
	}
	
	public void anyadirVagon(Vagon vagon) {
		if(vagon == null) {
			throw new IllegalArgumentException("El vagón no puede ser nulo");
		}
		else if(this.listaVagones.size() >= 5) {
			throw new IllegalArgumentException("Ya hay 5 vagones");
		}
		for(Vagon v : this.listaVagones) {
			if(v.getNumId() == vagon.getNumId()) {
				throw new IllegalArgumentException("Este vagón ya está en el tren");
			}
		}
		this.listaVagones.add(vagon);
	}
	
	public void retirarVagon(Vagon vagon) {
		if(vagon == null) {
			throw new IllegalArgumentException("El vagon no puede ser nulo");
		}
		boolean esta = false;
		for(Vagon v : this.listaVagones) {
			if(v.getNumId() == vagon.getNumId()) {
				esta = true;
			}
		}
		if(!esta) {
			throw new IllegalArgumentException("Ese vagón no está en este tren");
		}
		this.listaVagones.remove(vagon);
	}
	public void retirarVagon(int i) {
		if(i >= this.listaVagones.size()) {
			throw new IndexOutOfBoundsException("Ese puesto de vagón no existe aún");
		}
		this.listaVagones.remove(i);
	}
	
	
}
