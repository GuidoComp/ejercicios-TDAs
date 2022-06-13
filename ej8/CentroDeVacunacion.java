package ej8;

public class CentroDeVacunacion {

	private static final int CANT_COLAS = 3;
	private ColaDeVacunables[] colas;
	
	public CentroDeVacunacion(ColaDeVacunables[] colas) {
		this.colas = colas;
	}
	
	public ColaPorPrioridad obtenerColaPorPrioridadYOrden() {
		ListaOrdenadaPorPrioridad listaOrd = new ListaOrdenadaPorPrioridad();
		
		for (int cola = 0; cola < colas.length; cola++) {
			if (!colas[cola].isEmpty()) {
				listaOrd.agregarCola(colas[cola]);
			}
		}
		return this.encolarListaOrdenada(listaOrd);
	}

	private ColaPorPrioridad encolarListaOrdenada(ListaOrdenadaPorPrioridad listaOrd) {
		ColaPorPrioridad colaOrd = new ColaPorPrioridad();
		
		for (Persona p: listaOrd) {
			colaOrd.add(p);
		}
		return colaOrd;
	}
}
