package ej8;

public class Test {

	public static void main(String[] args) {

		ColaDeVacunables cola1 = new ColaDeVacunables();
		cola1.add(new Persona("25649862", "Ramiro", 27, false));
		//cola1.add(new Persona("26598345", "Carlos", 35, false));
		//cola1.add(new Medico("35648592", "Marcelo", 45, false, 4569));
		cola1.add(new Docente("12485963", "Laura", 30, false, Nivel.SECUNDARIO));
		ColaDeVacunables cola2 = new ColaDeVacunables();
		cola2.add(new Persona("48591235", "Saul", 61, false));
		//cola2.add(new Persona("59765236", "Camila", 82, false));
		//cola2.add(new Medico("526349859", "Edgardo", 25, true, 5963));
		cola2.add(new Docente("26529586", "Javier", 20, false, Nivel.SECUNDARIO));
		ColaDeVacunables cola3 = new ColaDeVacunables();
		cola3.add(new Persona("26359864", "Selma", 50, false));
		//cola3.add(new Persona("89955663", "Paty", 10, false));
		//cola3.add(new Medico("598623", "Raul", 15, false, 5999));
		cola3.add(new Docente("599966", "Sofia", 30, false, Nivel.INICIAL));
		
		ColaDeVacunables[] array = {cola1, cola2, cola3};
		CentroDeVacunacion centro = new CentroDeVacunacion(array);
		
		ColaPorPrioridad cola = centro.obtenerColaPorPrioridadYOrden();
		cola.recorrer();
		
	}

}
