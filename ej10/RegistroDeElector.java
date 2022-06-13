package ej10;

public class RegistroDeElector {

	private int dni;
	private Mesa mesa;
	private int nroOrdenEnMesa;
	
	public RegistroDeElector(int dni, Mesa mesa, int nroOrdenEnMesa) {
		this.dni = dni;
		this.mesa = mesa;
		this.nroOrdenEnMesa = nroOrdenEnMesa;
	}

	@Override
	public String toString() {
		return "RegistroDeElector [dni=" + dni + ", mesa=" + mesa + ", nroOrdenEnMesa=" + nroOrdenEnMesa + "]";
	}
}
