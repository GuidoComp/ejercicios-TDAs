package ej8;

public class Medico extends Persona{
	
	private int matricula;
	
	public Medico(String dni, String nombre, int edad, boolean esDeRiesgo, int matricula) {
		super(dni, nombre, edad, esDeRiesgo);
		this.matricula = matricula;
	}
}
