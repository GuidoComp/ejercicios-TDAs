package ej8;

import ar.edu.ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;

public class ListaOrdenadaPorPrioridad extends ListaOrdenadaNodos<Prioridad, Persona>{

	@Override
	public int compare(Persona dato1, Persona dato2) {
		return dato1.establecerPrioridad().ordinal() - dato2.establecerPrioridad().ordinal();
	}

	@Override
	public int compareByKey(Prioridad clave, Persona elemento) {
		return clave.ordinal() - elemento.establecerPrioridad().ordinal();
	}

	public void agregarCola(ColaDeVacunables colaDeVacunables) {
		Persona centinela = null;
		Persona persona = null;
		
		colaDeVacunables.add(persona);
		persona = colaDeVacunables.remove();
		while (persona != centinela) {
			this.add(persona);
			persona = colaDeVacunables.remove();
		}
	}

}
