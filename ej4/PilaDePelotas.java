package ej4;

import ar.edu.ort.tp1.tdas.implementaciones.PilaNodos;

public class PilaDePelotas extends PilaNodos<Pelota>{

	public PilaDePelotas(int cantPelotas) {
		super(cantPelotas);
	}
	
	public void agregarPelota(Pelota p) {
		this.push(p);
	}

	public Pelota buscarPelota(int codigo) {
		Pelota pelotaBuscada = null;
		Pelota pelotaEncontrada = null;
		PilaDePelotas pilaAux = new PilaDePelotas(5);
		
		while (!this.isEmpty() && pelotaBuscada == null) {
			pelotaEncontrada = this.peek();
			if (pelotaEncontrada.getCodigo() == codigo) {
				pelotaBuscada = pelotaEncontrada;
			} else {
				pilaAux.push(this.pop());
			}
		}
		while (!pilaAux.isEmpty()) {
			this.push(pilaAux.pop());
		}
		return pelotaBuscada;
	}
}
