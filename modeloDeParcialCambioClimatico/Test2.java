package modeloDeParcialCambioClimatico;

public class Test2 {

	public static void main(String[] args) {

		Zona z1 = new ZonaSeca(100, 700, 0.5);
		Zona z2 = new ZonaTropical(250, 1001);
		Zona z3 = new ZonaTropicalMonzonica(300, 1100, Intensidad.FUERTE);
		Zona z4 = new ZonaTropicalMonzonica(300, 800, Intensidad.LEVE);

		z1.setMatriz(23, 25, 30, 29);
		z2.setMatriz(35, 39, 41, 18);
		z3.setMatriz(15, 30, 35, 40);
		z4.setMatriz(12, 35, 30, 27);

		PilaZonas pila = new PilaZonas();
		pila.push(z1);
		pila.push(z2);
		pila.push(z3);
		pila.push(z4);

		CentroMonitoreo c = new CentroMonitoreo(pila);

		System.out.println("Porcentaje de zonas en riesgo: " + c.porcentajeDeZonasEnRiesgo());

		ListaOrdXElevacion lista = c.zonasInferioresSegunMesYTemp(0, 30);

		System.out.println(
				"Lista de zonas ordenadas por elevación descendente que en el mes indicado tenga temperaturas inferiores a la indicada: ");
		for (Zona l : lista) {
			System.out.println(l);
		}

	}

}
