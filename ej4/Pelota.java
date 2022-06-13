package ej4;

public class Pelota {

	private int codigo;
	private Tipo tipo;
	
	public Pelota(int codigo, Tipo tipo) {
		this.codigo = codigo;
		this.tipo = tipo;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public Tipo getTipo() {
		return tipo;
	}

	@Override
	public String toString() {
		return "Pelota [codigo=" + codigo + ", tipo=" + tipo + "]";
	}
}
