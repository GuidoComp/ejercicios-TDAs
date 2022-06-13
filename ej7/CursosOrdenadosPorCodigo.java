package ej7;

import ar.edu.ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;

public class CursosOrdenadosPorCodigo extends ListaOrdenadaNodos<String, Curso>{

	@Override
	public int compare(Curso dato1, Curso dato2) {
		return dato1.getCodigo().compareTo(dato2.getCodigo());
	}

	@Override
	public int compareByKey(String clave, Curso elemento) {
		return clave.compareTo(elemento.getCodigo());
	}

}
