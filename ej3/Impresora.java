package ej3;

public class Impresora {

	private boolean encendida;
	private int hojasEnBandeja;
	private ColaDeDocumentos cola;
	
	public Impresora() {
		this.encendida = false;
		this.hojasEnBandeja = 0;
		this.cola = new ColaDeDocumentos();
	}
	
	public void encender() {
		this.encendida = true;
	}
	
	public void cargarHojas(int cant) {
		this.hojasEnBandeja = cant;
	}
	
	public void agregarDocumento(Documento d) {
		this.cola.add(d);
	}
	
	public boolean imprimir() {
		boolean pudo = false;
		
		if (encendida && hojasEnBandeja >= this.calcularCantHojasRequeridas()) {
			imprimirDocumentosDeLaCola();
			pudo = true;
			hojasEnBandeja -= this.calcularCantHojasRequeridas();
		}
		return pudo;
	}

	private void imprimirDocumentosDeLaCola() {
		Documento cent = null;
		Documento doc = null;
		
		cola.add(cent);
		doc = cola.remove();
		while(doc != cent) {
			System.out.println(doc);
			cola.add(doc);
			doc = cola.remove();
		}
	}

	private int calcularCantHojasRequeridas() {
		int cant = 0;
		Documento doc = null;
		ColaDeDocumentos colaAux = new ColaDeDocumentos();
		
		while (!cola.isEmpty()) {
			doc = cola.remove();
			cant += doc.cantHojasRequeridas();
			colaAux.add(doc);
		}
		while (!colaAux.isEmpty()) {
			cola.add(colaAux.remove());
		}
		return cant;
	}
}
