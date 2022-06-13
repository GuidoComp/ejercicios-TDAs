package ej7;

public class Estadistica {

	private String nombreCurso;
	private double promedioEdadAlumnos;
	
	public Estadistica(String nombreCurso, double promedioEdadAlumnos) {
		this.nombreCurso = nombreCurso;
		this.promedioEdadAlumnos = promedioEdadAlumnos;
	}

	@Override
	public String toString() {
		return "Estadistica [nombreCurso=" + nombreCurso + ", promedioEdadAlumnos=" + promedioEdadAlumnos + "]";
	}
}
