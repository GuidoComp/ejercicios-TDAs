package ej10;

import ar.edu.ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;

public class ElectoresPorDni extends ListaOrdenadaNodos<Integer, ElectorConMesa>{

	@Override
	public int compare(ElectorConMesa dato1, ElectorConMesa dato2) {
		// TODO Auto-generated method stub
		return dato1.getDni() - dato2.getDni();
	}

	@Override
	public int compareByKey(Integer clave, ElectorConMesa elemento) {
		// TODO Auto-generated method stub
		return clave - elemento.getDni();
	}

}
