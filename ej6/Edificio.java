package ej6;

public class Edificio {

	private static final int CANT_TIPOS_FACTURAS = TipoFactura.values().length;
	private ColaDeFacturas[] colasPorTipo;
	
	public Edificio() {
		this.colasPorTipo = new ColaDeFacturas[CANT_TIPOS_FACTURAS];
		for (int i = 0; i < colasPorTipo.length; i++) {
			colasPorTipo[i] = new ColaDeFacturas();
		}
	}
	
	public double[] montoAAbonarPorTipo() {
		double[] montosPorTipo = new double[CANT_TIPOS_FACTURAS];
		
		for (int cola = 0; cola < colasPorTipo.length; cola++) {
			for (int tipo = 0; tipo < TipoFactura.values().length; tipo++) {
				montosPorTipo[tipo] += this.acumularMonto(colasPorTipo[cola], TipoFactura.values()[tipo]);
			}
		}
		return montosPorTipo;
	}
	
	private double acumularMonto(ColaDeFacturas colaDeFacturas, TipoFactura tipoFactura) {
		double montoPorTipo = 0;
		Factura centinela = null;
		Factura factura = null;
		
		colaDeFacturas.add(centinela);
		factura = colaDeFacturas.remove();
		while (factura != centinela) {
			if (factura.getTipo().equals(tipoFactura)) {
				montoPorTipo += factura.getMonto();
			}
			colaDeFacturas.add(factura);
			factura = colaDeFacturas.remove();
		}
		return montoPorTipo;
	}

	public void catalogar(PilaDeFacturas pila) {
		Factura facturaEncontrada = null;
		ColaDeFacturas cola = null;
		
		while (!pila.isEmpty()) {
			facturaEncontrada = pila.pop();
			cola = colasPorTipo[facturaEncontrada.getTipo().ordinal()];
			this.ubicarFacturaPorTipo(facturaEncontrada, cola);
		}
	}

	private void ubicarFacturaPorTipo(Factura facturaAIngresar, ColaDeFacturas cola) {
		Factura centinela = null;
		Factura factura = null;
		boolean entro = false;
		
		cola.add(centinela);
		factura = cola.remove();
		while (factura != centinela) {
			if (factura.esMasNueva(facturaAIngresar) && !entro) {
				cola.add(facturaAIngresar);
				entro = true;
			}
			cola.add(factura);
			factura = cola.remove();
		}
		if (!entro) {
			cola.add(facturaAIngresar);
		}
	}
	
	public void mostrarColas() {
		for (int i = 0; i < colasPorTipo.length; i++) {
			this.recorrer(colasPorTipo[i]);
		}
	}

	private void recorrer(ColaDeFacturas colaDeFacturas) {
		Factura centinela = null;
		Factura factura = null;
		
		colaDeFacturas.add(centinela);
		factura = colaDeFacturas.remove();
		while (factura != centinela) {
			System.out.println(factura);
			colaDeFacturas.add(factura);
			factura = colaDeFacturas.remove();
		}
		
	}
}
