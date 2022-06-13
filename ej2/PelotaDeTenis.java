package ej2;

public class PelotaDeTenis {

	private int cantUsos;
	private boolean nueva;
	
	public PelotaDeTenis(int cantUsos) {
		this.cantUsos = cantUsos;
		if (cantUsos > 0) {
			this.nueva = false;
		} else {
			this.nueva = true;
		}
	}

	public int getCantUsos() {
		return cantUsos;
	}

	public boolean estaNueva() {
		return nueva == true;
	}

	@Override
	public String toString() {
		return "PelotaDeTenis [cantUsos=" + cantUsos + ", nueva=" + nueva + "]";
	}
}
