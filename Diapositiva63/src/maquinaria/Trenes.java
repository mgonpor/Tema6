package maquinaria;

import java.util.List;

import personal.Maquinista;

public class Trenes {

	private Locomotora locomotora;
	private List<Vagon> listaVagones;
	private Maquinista maquinista;
	
	public Trenes(Locomotora locomotora, List<Vagon> listaVagones, Maquinista maquinista) {
		setLocomotora(locomotora);
		setListaVagones(listaVagones);
		setMaquinista(maquinista);
	}
	
	public Locomotora getLocomotora() {
		return locomotora;
	}
	public void setLocomotora(Locomotora locomotora) {
		this.locomotora = locomotora;
	}
	
	public List<Vagon> getListaVagones() {
		return listaVagones;
	}
	public void setListaVagones(List<Vagon> listaVagones) {
		this.listaVagones = listaVagones;
	}
	
	public Maquinista getMaquinista() {
		return maquinista;
	}
	public void setMaquinista(Maquinista maquinista) {
		this.maquinista = maquinista;
	}
	
	
	
}
