package ej10;

import ar.edu.ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;

public class ElectoresSinMPorDni extends ListaOrdenadaNodos<Integer, Elector>{

	@Override
	public int compare(Elector dato1, Elector dato2) {
		// TODO Auto-generated method stub
		return dato1.getDni() - dato2.getDni();
	}

	@Override
	public int compareByKey(Integer clave, Elector elemento) {
		// TODO Auto-generated method stub
		return clave - elemento.getDni();
	}

}
