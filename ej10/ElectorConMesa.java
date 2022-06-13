package ej10;

public class ElectorConMesa extends Elector {

	private int nroMesa;

	public ElectorConMesa(int dni, String apellido, String nombre, int nroMesa) {
		super(dni, apellido, nombre);
		this.nroMesa = nroMesa;
	}

	public int getNroMesa() {
		return nroMesa;
	}
	
	public Elector generarElectorSinMesa() {
		return new Elector(this.getDni(), this.getApellido(), this.getNombre());
	}
}
