package ej7;

import ar.edu.ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;

public class AlumnosPorEdad extends ListaOrdenadaNodos<Integer, Alumno>{

	@Override
	public int compare(Alumno dato1, Alumno dato2) {
		return dato2.getEdad() - dato1.getEdad();
	}

	@Override
	public int compareByKey(Integer clave, Alumno elemento) {
		return clave - elemento.getEdad();
	}

	public AlumnosPorEdad devolverCantidadRequerida(int cantAlumnosReq) {
		AlumnosPorEdad requerida = new AlumnosPorEdad();
		
		for (int i = 0; i < cantAlumnosReq; i++) {
			requerida.add(this.get(i));
		}
		
		return requerida;
	}

}
