package ej2;

import ar.edu.ort.tp1.tdas.implementaciones.PilaNodos;

public class TuboDePelotasDeTenis extends PilaNodos<PelotaDeTenis>{

	public TuboDePelotasDeTenis(int c) {
		super(c);
	}
	
	public void agregarPelota(PelotaDeTenis p) {
		this.push(p);
	}

	public boolean tieneAlgunaPelotaVieja() {
		boolean tienePelotaVieja = false;
		TuboDePelotasDeTenis tuboAux = new TuboDePelotasDeTenis(3);
		PelotaDeTenis pelota = null;
		
		while (!this.isEmpty() && !tienePelotaVieja) {
			pelota = this.pop();
			if (!pelota.estaNueva()) {
				tienePelotaVieja = true;
				this.push(pelota);
			} else {
				tuboAux.push(pelota);
			}
		}
		while (!tuboAux.isEmpty()) {
			this.push(tuboAux.pop());
		}
		return tienePelotaVieja;
	}
	
	public void recorrer() {
		PelotaDeTenis pelota = null;
		TuboDePelotasDeTenis tuboAux = new TuboDePelotasDeTenis(3);
		
		while (!this.isEmpty()) {
			pelota = this.pop();
			tuboAux.push(pelota);
		}
		while (!tuboAux.isEmpty()) {
			pelota = tuboAux.pop();
			System.out.println(pelota);
			this.push(pelota);
		}
	}
	
}
