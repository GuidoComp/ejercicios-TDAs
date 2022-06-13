package ej1;

public class DVD {

	private String marca;
	private boolean rallado;
	
	public DVD(String marca, boolean rallado) {
		this.marca = marca;
		this.rallado = rallado;
	}

	public boolean estaRallado() {
		return rallado == true;
	}
}
