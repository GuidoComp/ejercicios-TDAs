package ej1;

import ar.edu.ort.tp1.tdas.implementaciones.PilaNodos;

public class Empleado {

	public int cantDVDsRallados(PilaNodos<DVD> pilaDVDs) {
		int cantDVDsRallados = 0;
		DVD dvd = null;
		PilaNodos<DVD> pilaAux = new PilaNodos<>();
		
		while (!pilaDVDs.isEmpty()) {
			dvd = pilaDVDs.pop();
			if (dvd.estaRallado()) {
				cantDVDsRallados++;
			}
			pilaAux.push(dvd);
		}
		while(!pilaAux.isEmpty()) {
			dvd = pilaAux.pop();
			pilaDVDs.push(dvd);
		}
		return cantDVDsRallados;
	}
	
	public double paginasPromedio(PilaNodos<Libro> pilaLibros) {
		double cantLibros = 0;
		double sumaCantPaginas = 0;
		PilaNodos<Libro> pilaAux = new PilaNodos<>();
		Libro libro = null;
		
		while (!pilaLibros.isEmpty()) {
			libro = pilaLibros.pop();
			cantLibros++;
			sumaCantPaginas += libro.getNroPaginas();
			pilaAux.push(libro);
		}
		while (!pilaAux.isEmpty()) {
			pilaLibros.push(pilaAux.pop());
		}
		return (double) sumaCantPaginas / cantLibros;
	}
}
