package ej1;

import ar.edu.ort.tp1.tdas.implementaciones.PilaNodos;

public class Test {

	public static void main(String[] args) {

		Libro l1 = new Libro(0, 200);
		Libro l2 = new Libro(1, 500);
		DVD dvd1 = new DVD("Compact", true);
		DVD dvd2 = new DVD("Generic", false);
		
		PilaNodos<DVD> pilaDVDs = new PilaNodos<>();
		pilaDVDs.push(dvd1);
		pilaDVDs.push(dvd2);
		
		PilaNodos<Libro> pilaLibros = new PilaNodos<>();
		pilaLibros.push(l1);
		pilaLibros.push(l2);
		
		Empleado e = new Empleado();
		System.out.println(e.cantDVDsRallados(pilaDVDs));
		System.out.println(e.paginasPromedio(pilaLibros));
	}

}
