package ej10;

import ar.edu.ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;

public class MesasPorNumero extends ListaOrdenadaNodos<Integer, Mesa>{

	@Override
	public int compare(Mesa dato1, Mesa dato2) {
		// TODO Auto-generated method stub
		return dato1.getNroMesa() - dato2.getNroMesa();
	}

	@Override
	public int compareByKey(Integer clave, Mesa elemento) {
		// TODO Auto-generated method stub
		return clave - elemento.getNroMesa();
	}

}
