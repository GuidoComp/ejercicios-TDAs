package ej4;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		DepartamentoDeportes dep = new DepartamentoDeportes();
		
		System.out.println(Arrays.toString(dep.getArray()));
		
		System.out.println(dep.agregarPilaDePelotas(new PilaDePelotas(5)));
		System.out.println(dep.agregarPilaDePelotas(new PilaDePelotas(5)));
		System.out.println(dep.agregarPilaDePelotas(new PilaDePelotas(5)));
		System.out.println(dep.agregarPilaDePelotas(new PilaDePelotas(5)));
		
		dep.agregarPelota(new Pelota(4, Tipo.BASQUET));
		dep.agregarPelota(new Pelota(5, Tipo.VOLEY));
		dep.agregarPelota(new Pelota(6, Tipo.FUTBOL));
		dep.agregarPelota(new Pelota(7, Tipo.BASQUET));
		dep.agregarPelota(new Pelota(8, Tipo.VOLEY));
		dep.agregarPelota(new Pelota(9, Tipo.FUTBOL));
		dep.agregarPelota(new Pelota(10, Tipo.FUTBOL));
		dep.agregarPelota(new Pelota(11, Tipo.VOLEY));
		dep.agregarPelota(new Pelota(12, Tipo.BASQUET));
		dep.agregarPelota(new Pelota(13, Tipo.BASQUET));
		dep.agregarPelota(new Pelota(14, Tipo.VOLEY));
		
		dep.verPelotasEnTopes();
		
		int[][] matriz = dep.pelotasPorTipo();
		
		for (int fila = 0; fila < matriz.length; fila++) {
			for (int col = 0; col < matriz[0].length; col++) {
				System.out.print(matriz[fila][col]);
			}
			System.out.println();
		}
		
	}

}
