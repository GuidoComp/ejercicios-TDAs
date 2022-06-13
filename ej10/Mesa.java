package ej10;

public class Mesa {

	private int nroMesa;
	private ElectoresSinMPorDni electoresPorDni;
	private ElectoresPorNombreCompleto electoresPorNombre;
	
	public Mesa(int nroMesa) {
		this.nroMesa = nroMesa;
		this.electoresPorDni = new ElectoresSinMPorDni();
		this.electoresPorNombre = new ElectoresPorNombreCompleto();
	}
	
	public Integer getNroMesa() {
		return nroMesa;
	}

	public void agregarElector(Elector electorSinM) {
		electoresPorDni.add(electorSinM);
		electoresPorNombre.add(electorSinM);
	}

	public Elector buscarElector(int dni) {
		return this.electoresPorDni.search(dni);
	}

	public int getNroOrden(int dni) {
		int index = 0;
		boolean encontrado = false;
		Elector electorEncontrado = null;
		int pos = -1;
		
		while (index < electoresPorDni.size() && !encontrado) {
			electorEncontrado = this.electoresPorDni.get(index);
			if (electorEncontrado.getDni() == dni) {
				encontrado = true;
				pos = index;
			} else {
				index++;
			}
		}
		return pos;
	}

	@Override
	public String toString() {
		return "Mesa [nroMesa=" + nroMesa + ", electoresPorDni=" + electoresPorDni + ", electoresPorNombre="
				+ electoresPorNombre + "]";
	}
}
