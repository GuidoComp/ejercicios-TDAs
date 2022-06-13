package modeloDeParcialCambioClimatico;

import ar.edu.ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;

public class ListaOrdXElevacion extends ListaOrdenadaNodos<Integer, Zona>{

	@Override
	public int compare(Zona dato1, Zona dato2) {
		return dato1.getElevacion() - dato2.getElevacion();
	}

	@Override
	public int compareByKey(Integer clave, Zona elemento) {
		return clave - elemento.getElevacion();
	}

}
