package ej3;

public class Test {

	public static void main(String[] args) {

		Impresora i = new Impresora();
		i.agregarDocumento(new Documento("20/06", 10, false));
		i.agregarDocumento(new Documento("26/08", 30, true));
		i.agregarDocumento(new Documento("15/02", 20, true));
		i.encender();
		i.cargarHojas(35);
		System.out.println(i.imprimir());
		System.out.println(i.imprimir());
	}

}
