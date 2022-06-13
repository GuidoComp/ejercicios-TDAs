package ej6;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		PilaDeFacturas pila = new PilaDeFacturas();
		pila.push(new Factura(2, TipoFactura.ABL, 1000));
		pila.push(new Factura(5, TipoFactura.GAS, 300));
		pila.push(new Factura(11, TipoFactura.LUZ, 1500));
		pila.push(new Factura(3, TipoFactura.INTERNET, 3700));
		pila.push(new Factura(6, TipoFactura.ABL, 800));
		pila.push(new Factura(1, TipoFactura.GAS, 500));
		pila.push(new Factura(5, TipoFactura.LUZ, 3000));
		
		Edificio e = new Edificio();
		
		e.catalogar(pila);
		e.mostrarColas();
		
		double[] array = e.montoAAbonarPorTipo();
		System.out.println(Arrays.toString(array));

		
	}
}
