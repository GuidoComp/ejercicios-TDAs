package ej5;

public class Test {

	public static void main(String[] args) {

		SuppORT s = new SuppORT();
		s.agregarTicket(new Ticket(12, "20/06", Prioridad.ALTA, Sector.DIRECCION));
		s.agregarTicket(new Ticket(22, "15/05", Prioridad.MEDIA, Sector.ESCUELA));
		s.agregarTicket(new Ticket(24, "14/04", Prioridad.BAJA, Sector.INSTITUTO));
		s.agregarTicket(new Ticket(34, "30/05", Prioridad.BAJA, Sector.RRHH));
		s.agregarTicket(new Ticket(35, "5/08", Prioridad.ALTA, Sector.ESCUELA));
		s.agregarTicket(new Ticket(40, "4/01", Prioridad.BAJA, Sector.INSTITUTO));
		
		s.recorrer();
		
		//System.out.println(s.eliminarTicket(22));
		
		s.recorrer();
		
		for(int fila = 0; fila < s.cantTicketsXSectorPrioridad().length; fila++) {
			for (int col = 0; col < s.cantTicketsXSectorPrioridad()[0].length; col++) {
				System.out.print(" " + s.cantTicketsXSectorPrioridad()[fila][col]);
			}
			System.out.println();
		}
		
		
	}

}
