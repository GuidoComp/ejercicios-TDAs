package ej10;

public class Elector {

	private int dni;
	private String apellido;
	private String nombre;
	
	public Elector(int dni, String apellido, String nombre) {
		this.dni = dni;
		this.apellido = apellido;
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getDni() {
		return this.dni;
	}

}
