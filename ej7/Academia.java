package ej7;

public class Academia {

	private CursosOrdenadosPorCodigo listaPorCodigo;

	public Academia(CursosOrdenadosPorCodigo listaPorCodigo) {
		this.listaPorCodigo = listaPorCodigo;
	}
	
	public CursosOrdenadosPorNivel listadoDeCursosPorNivel() {
		CursosOrdenadosPorNivel listaCursosPorNivel = new CursosOrdenadosPorNivel();
		for (Curso c: this.listaPorCodigo) {
			listaCursosPorNivel.add(c);
		}
		return listaCursosPorNivel;
	}
	
	public Estadistica obtenerEstadistica(String codigoCurso) {
		Curso curso = null;
		double edadPromedio = 0;
		String titulo = null;
		
		curso = listaPorCodigo.search(codigoCurso);
		if (curso != null) {
			edadPromedio = curso.promedioEdades();
			titulo = curso.getTitulo();
		}
		return new Estadistica(titulo, edadPromedio);
	}
	
	public Curso getCurso(String codigo) {
		return listaPorCodigo.search(codigo);
	}
}
