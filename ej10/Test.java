package ej10;

public class Test {

	public static void main(String[] args) {

		ElectorConMesa e1 = new ElectorConMesa(36158188, "Perez", "Carlos", 8);
		ElectorConMesa e2 = new ElectorConMesa(11206598, "Gimenez", "Susana", 5);
		ElectorConMesa e3 = new ElectorConMesa(20526894, "Castels", "Raul", 2);
		ElectorConMesa e4 = new ElectorConMesa(35629581, "Conte", "Laura", 1);
		ElectorConMesa e5 = new ElectorConMesa(56894563, "Luquini", "Lucas", 5);
		
		ElectoresPorDni lista = new ElectoresPorDni();
		lista.add(e1);
		lista.add(e2);
		lista.add(e3);
		lista.add(e4);
		lista.add(e5);
		
		MesasPorNumero mesasPorNumero = new MesasPorNumero();
		for (int i = 0; i < 10; i++) {
			mesasPorNumero.add(new Mesa(i+1));
		}
		
		PadronElectoral p = new PadronElectoral(mesasPorNumero);
		MesaElectoral mesaEle = new MesaElectoral(lista, p);
		
		mesaEle.generarPadron();
		
		System.out.println(p.generarRegistroElector(56894563));
	}

}
