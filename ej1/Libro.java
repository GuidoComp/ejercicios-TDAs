package ej1;

public class Libro {

	private int ISBN;
	private int nroPaginas;
	
	public Libro(int iSBN, int nroPaginas) {
		this.ISBN = iSBN;
		this.nroPaginas = nroPaginas;
	}
	
	public int getNroPaginas() {
		return this.nroPaginas;
	}
}
