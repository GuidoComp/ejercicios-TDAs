package ej7;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		CursosOrdenadosPorCodigo lista = new CursosOrdenadosPorCodigo();
		ArrayList<Alumno> a = new ArrayList<>();
		a.add(new Alumno("456", "Carlos", 50));
		a.add(new Alumno("5734", "Marcelo", 30));
		a.add(new Alumno("447", "Laura", 15));
		a.add(new Alumno("998", "Georgina", 46));
		a.add(new Alumno("328", "Melina", 27));
		a.add(new Alumno("990", "Alberto", 32));
		ArrayList<Alumno> a2 = new ArrayList<>();
		a2.add(new Alumno("111", "Eduardo", 13));
		a2.add(new Alumno("3325", "Maria", 16));
		a2.add(new Alumno("105", "Ale", 24));
		a2.add(new Alumno("189", "Sofia", 25));
		a2.add(new Alumno("234", "Victoria", 36));
		lista.add(new Curso("2", "Titulo2", 20, Nivel.BASICO, a));
		lista.add(new Curso("1", "Titulo1", 30, Nivel.INTERMEDIO, a2));
		
		
		Academia ac = new Academia(lista);
		
		for (Curso c: ac.listadoDeCursosPorNivel()) {
			System.out.println(c);
		}
		
		System.out.println(ac.obtenerEstadistica("2"));
		
		AlumnosPorEdad porEdad = ac.getCurso("2").top5AlumnosMasLongevos();
		
		for (Alumno al: porEdad) {
			System.out.println(al);
		}
		
	}

}
