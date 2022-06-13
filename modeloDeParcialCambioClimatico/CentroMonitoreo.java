package modeloDeParcialCambioClimatico;

import ar.edu.ort.tp1.tdas.implementaciones.PilaNodos;

public class CentroMonitoreo extends PilaNodos<Zona>{

	private PilaZonas pilaDeZonas;

	public CentroMonitoreo(PilaZonas pilaDeZonas) {
		this.pilaDeZonas = pilaDeZonas;
	}
	
	public double porcentajeDeZonasEnRiesgo() {
		int cantZonasRiesgo = 0;
		Zona zona = null;
		int cantZonas = 0;
		PilaZonas pilaAux = new PilaZonas();
		
		while (!pilaDeZonas.isEmpty()) {
			zona = pilaDeZonas.pop();
			pilaAux.push(zona);
			cantZonas++;
			if (zona.estaEnRiesgo()) {
				cantZonasRiesgo++;
			}
		}
		while (!pilaAux.isEmpty()) {
			pilaDeZonas.push(pilaAux.pop());
		}
		return (double) (cantZonasRiesgo * 100) / cantZonas;
	}
	
	public ListaOrdXElevacion zonasInferioresSegunMesYTemp(int nroMes, double temp) {
		ListaOrdXElevacion lista = new ListaOrdXElevacion();
		PilaZonas pilaAux = new PilaZonas();
		Zona zona = null;
		
		while (!pilaDeZonas.isEmpty()) {
			zona = pilaDeZonas.pop();
			pilaAux.push(zona);
			if (zona.traspasoLimiteInferior(nroMes, temp)) {
				lista.add(zona);
			}
		}
		while (!pilaAux.isEmpty()) {
			pilaDeZonas.push(pilaAux.pop());
		}
		return lista;
	}
}
