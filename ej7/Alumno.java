package ej7;

public class Alumno {

	private String dni;
	private String nombre;
	private int edad;
	
	public Alumno(String dni, String nombre, int edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
	}

	public int getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
}
