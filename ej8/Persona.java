package ej8;

public class Persona implements Vacunable {

	private static final int EDAD_RIESGO = 60;
	private static final int EDAD_PR_MIN = 30;
	private static final Nivel NIVEL_PR_MAX = Nivel.INICIAL;
	private String dni;
	private String nombre;
	private int edad;
	private boolean esDeRiesgo;
	
	public Persona(String dni, String nombre, int edad, boolean esDeRiesgo) {
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.esDeRiesgo = esDeRiesgo;
	}
	
	@Override
	public Prioridad establecerPrioridad() {
		Prioridad prioridad = Prioridad.MINIMA;
		Docente cast = null;
		
		if (this.edad >= EDAD_PR_MIN) {
			prioridad = Prioridad.MEDIA;
			if (this.edad > EDAD_RIESGO) {
				prioridad = Prioridad.MAXIMA;
			}
		}
		if (esDeRiesgo || this instanceof Medico) {
			prioridad = Prioridad.MAXIMA;
		}
		if (this instanceof Docente) {
			cast = (Docente) this;
			if (cast.getNivel().equals(NIVEL_PR_MAX)) {
				prioridad = Prioridad.MAXIMA;
			}
		}
		return prioridad;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", esDeRiesgo=" + esDeRiesgo + "]";
	}
}
