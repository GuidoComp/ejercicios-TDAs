package ej10;

public class PadronElectoral {

	private MesasPorNumero mesasPorNumero;

	public PadronElectoral(MesasPorNumero mesasPorNumero) {
		this.mesasPorNumero = mesasPorNumero;
	}

	public void registrarElectorEnMesa(Elector electorSinM, int nroMesa) {
		Mesa mesa = null;
		mesa = this.mesasPorNumero.search(nroMesa);
		mesa.agregarElector(electorSinM);
	}
	
	public RegistroDeElector generarRegistroElector(int dni) {
		Elector elector = null;
		Mesa mesa = null;
		RegistroDeElector registro = null;
		int nroOrdenEnMesa = 0;
		
		elector = this.buscarElector(dni);
		if (elector != null) {
			mesa = this.getMesa(elector);
			nroOrdenEnMesa = mesa.getNroOrden(dni);
			System.out.println(nroOrdenEnMesa);
			registro = new RegistroDeElector(dni, mesa, nroOrdenEnMesa);
		}
		return registro;
	}

	private Mesa getMesa(Elector elector) {
		Mesa mesa = null;
		boolean encontrada = false;
		int index = 0;
		Mesa mesaEncontrada = null;
		Elector electorDeMesa = null;
		
		while (index < mesasPorNumero.size() && !encontrada) {
			mesaEncontrada = mesasPorNumero.get(index);
			electorDeMesa = mesaEncontrada.buscarElector(elector.getDni());
			if (electorDeMesa != null) {
				mesa  = mesaEncontrada;
				encontrada = true;
			} else {
				index++;
			}
		}
		return mesa;
	}

	private Elector buscarElector(int dni) {
		int index = 0;
		boolean encontrado = false;
		Mesa mesa = null;
		Elector elector = null;
		
		while (index < mesasPorNumero.size() && !encontrado) {
			mesa = this.mesasPorNumero.get(index);
			elector = mesa.buscarElector(dni);
			if (elector != null) {
				encontrado = true;
			} else {
				index++;
			}
		}
		return elector;
	}
}
