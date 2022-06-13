package ej10;

import ar.edu.ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;

public class ElectoresPorNombreCompleto extends ListaOrdenadaNodos<String, Elector>{

	@Override
	public int compare(Elector dato1, Elector dato2) {
		// TODO Auto-generated method stub
		return dato1.getNombre().compareTo(dato2.getNombre());
	}

	@Override
	public int compareByKey(String clave, Elector elemento) {
		// TODO Auto-generated method stub
		return clave.compareTo(elemento.getNombre());
	}

}
