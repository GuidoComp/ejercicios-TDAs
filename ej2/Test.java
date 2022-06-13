package ej2;

public class Test {

	public static void main(String[] args) {

		ClubDeTenis club = new ClubDeTenis();
		
		TuboDePelotasDeTenis tubo1 = new TuboDePelotasDeTenis(3);
		TuboDePelotasDeTenis tubo2 = new TuboDePelotasDeTenis(3);
		TuboDePelotasDeTenis tubo3 = new TuboDePelotasDeTenis(3);
		
		tubo1.push(new PelotaDeTenis(0));
		tubo1.push(new PelotaDeTenis(0));
		tubo1.push(new PelotaDeTenis(5));
		
		tubo2.push(new PelotaDeTenis(0));
		tubo2.push(new PelotaDeTenis(0));
		
		tubo3.push(new PelotaDeTenis(0));
		tubo3.push(new PelotaDeTenis(0));
		tubo3.push(new PelotaDeTenis(0));
		
		/*club.agregarTubo(tubo1);
		club.agregarTubo(tubo2);
		club.agregarTubo(tubo3);*/
		
		tubo1.recorrer();
		
		System.out.println("Es tubo usado (1):" + club.esTuboUsado(tubo1));
		System.out.println("Es tubo usado (2):" + club.esTuboUsado(tubo2));
		System.out.println("Es tubo usado (3):" + club.esTuboUsado(tubo3));
		
		tubo1.recorrer();
	}

}
