package ej3;

public class Documento {

	private String fecha;
	private int cantCarillas;
	private boolean dobleFaz;
	
	public Documento(String fecha, int cantCarillas, boolean dobleFaz) {
		this.fecha = fecha;
		this.cantCarillas = cantCarillas;
		this.dobleFaz = dobleFaz;
	}
	
	public int cantHojasRequeridas() {
		int cant = 0;
		
		if (dobleFaz) {
			cant = cantCarillas / 2;
		} else {
			cant = cantCarillas;
		}
		return cant;
	}

	@Override
	public String toString() {
		return "Documento [fecha=" + fecha + ", cantCarillas=" + cantCarillas + ", dobleFaz=" + dobleFaz + "]";
	}
}
