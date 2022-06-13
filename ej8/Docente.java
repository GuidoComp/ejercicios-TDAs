package ej8;

public class Docente extends Persona{
	
	private Nivel nivel;
	
	public Docente(String dni, String nombre, int edad, boolean esDeRiesgo, Nivel nivel) {
		super(dni, nombre, edad, esDeRiesgo);
		this.nivel = nivel;
	}
	
	public Nivel getNivel() {
		return nivel;
	}
}
