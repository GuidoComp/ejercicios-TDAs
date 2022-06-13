package ej7;

import ar.edu.ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;

public class CursosOrdenadosPorNivel extends ListaOrdenadaNodos<Nivel, Curso>{

	@Override
	public int compare(Curso dato1, Curso dato2) {
		return dato1.getNivel().ordinal() - dato2.getNivel().ordinal();
	}

	@Override
	public int compareByKey(Nivel clave, Curso elemento) {
		return clave.ordinal() - elemento.getNivel().ordinal();
	}

}
