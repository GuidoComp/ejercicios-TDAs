package ej4;

public class DepartamentoDeportes {

	private PilaDePelotas[] pilasDePelotas;

	public DepartamentoDeportes() {
		this.pilasDePelotas = new PilaDePelotas[3];
	}
	
	public int[][] pelotasPorTipo() {
		int[][] cantPelotasPorTipoPorPila = new int[pilasDePelotas.length][Tipo.values().length];
		
		for (int pila = 0; pila < pilasDePelotas.length; pila++) {
			cantPelotasPorTipoPorPila[pila] = contarTipoPelotasPorPila(pilasDePelotas[pila]);
		}
		
		return cantPelotasPorTipoPorPila;
	}
	
	private int[] contarTipoPelotasPorPila(PilaDePelotas pilaDePelotas) {
		int[] vectorTipoPelotasPorPila = new int[Tipo.values().length];
		PilaDePelotas pilaAux = new PilaDePelotas(5);
		Pelota pelota = null;
		
		while (!pilaDePelotas.isEmpty()) {
			pelota = pilaDePelotas.pop();
			vectorTipoPelotasPorPila[pelota.getTipo().ordinal()]++;
			pilaAux.push(pelota);
		}
		while (!pilaAux.isEmpty()) {
			pilaDePelotas.push(pilaAux.pop());
		}
		return vectorTipoPelotasPorPila;
	}
	
	public Pelota buscarPelota(int codigo) {
		Pelota pelotaBuscada = null;
		int index = 0;
		
		while (index < pilasDePelotas.length && pelotaBuscada == null) {
			pelotaBuscada = pilasDePelotas[index].buscarPelota(codigo);
			if (pelotaBuscada == null) {
				index++;
			}
		}
		
		return pelotaBuscada;
	}
	
	public boolean agregarPelota(Pelota p) {
		boolean pudoAgregar = false;
		int index = 0;
		
		while (index < pilasDePelotas.length && !pudoAgregar) {
			if (!pilasDePelotas[index].isFull()) {
				pilasDePelotas[index].push(p);
				pudoAgregar = true;
			} else {
				index++;
			}
		}
		return pudoAgregar;
	}
	
	public void verPelotasEnTopes() {
		for (int i = 0; i < pilasDePelotas.length; i++) {
			System.out.println("Pelota tope de la pila " + (i+1));
			if (!pilasDePelotas[i].isEmpty()) {
				System.out.println(pilasDePelotas[i].peek());
			} else {
				System.out.println("Vacía");
			}
		}
	}
	
	public boolean agregarPilaDePelotas(PilaDePelotas p) {
		boolean agregada = false;
		int index = 0;
		
		while (index < pilasDePelotas.length && !agregada) {
			if (pilasDePelotas[index] == null) {
				pilasDePelotas[index] = p;
				agregada = true;
			} else {
				index++;
			}
		}
		return agregada;
	}
	
	public PilaDePelotas[] getArray() {
		return this.pilasDePelotas;
	}
	
}
