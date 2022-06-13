package ej8;

import ar.edu.ort.tp1.tdas.implementaciones.ColaNodos;

public class ColaPorPrioridad extends ColaNodos<Persona>{

	public void recorrer() {
		Persona centinela = null;
		Persona persona = null;
		
		this.add(centinela);
		persona = this.remove();
		while (persona != centinela) {
			System.out.println(persona);
			this.add(persona);
			persona = this.remove();
		}
		
	}

}
