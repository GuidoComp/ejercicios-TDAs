package ej6;

public class Factura {

	private int nroMes;
	private TipoFactura tipo;
	private double monto;

	public Factura(int nroMes, TipoFactura tipo, double monto) {
		this.nroMes = nroMes;
		this.tipo = tipo;
		this.monto = monto;
	}
	
	public boolean esMasNueva(Factura f) {
		return this.getNroMes() > f.getNroMes();
	}
	
	public int getNroMes() {
		return nroMes;
	}
	
	public TipoFactura getTipo() {
		return tipo;
	}
	
	public double getMonto() {
		return monto;
	}
	
	@Override
	public String toString() {
		return "Factura [nroMes=" + nroMes + ", tipo=" + tipo + "]";
	}
}
