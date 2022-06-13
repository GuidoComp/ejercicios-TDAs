package ej7;

import java.util.ArrayList;

public class Curso {

	private String codigo;
	private String titulo;
	private int cantHoras;
	private Nivel nivel;
	private ArrayList<Alumno> alumnos;
	private static final int CANT_ALUMNOS_REQ = 5;
	
	public Curso(String codigo, String titulo, int cantHoras, Nivel nivel, ArrayList<Alumno> alumnos) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.cantHoras = cantHoras;
		this.nivel = nivel;
		this.alumnos = alumnos;
	}
	
	public AlumnosPorEdad top5AlumnosMasLongevos() {
		AlumnosPorEdad completa = null;
		AlumnosPorEdad requerida = new AlumnosPorEdad();
		
		completa = this.ordenarPorEdad();
		if (completa.size() > CANT_ALUMNOS_REQ) {
			requerida = completa.devolverCantidadRequerida(CANT_ALUMNOS_REQ);
		} else {
			requerida = completa;
		}
		return requerida;
	}
	

	private AlumnosPorEdad ordenarPorEdad() {
		AlumnosPorEdad alumnos = new AlumnosPorEdad();
		for(Alumno a: this.alumnos) {
			alumnos.add(a);
		}
		return alumnos;
	}

	public Nivel getNivel() {
		return this.nivel;
	}

	public String getCodigo() {
		return codigo;
	}

	public double promedioEdades() {
		double sumaEdades = 0;
		
		for (Alumno a: this.alumnos) {
			sumaEdades += a.getEdad();
		}
		return (double) sumaEdades / this.alumnos.size();
	}

	public String getTitulo() {
		return titulo;
	}

	@Override
	public String toString() {
		return "Curso [codigo=" + codigo + ", titulo=" + titulo + ", cantHoras=" + cantHoras + ", nivel=" + nivel
				+ ", alumnos=" + alumnos + "]";
	}
}
