package ej5;

public class SuppORT {

	private ColaDeTickets cola;

	public SuppORT() {
		this.cola = new ColaDeTickets();
	}

	public void agregarTicket(Ticket t) {
		cola.add(t);
	}

	public int[][] cantTicketsXSectorPrioridad() {
		int[][] cantTicketsPorSectorYPrioridad = new int[Sector.values().length][Prioridad.values().length];

		Ticket centinela = null;
		Ticket ticket = null;
		
		cola.add(centinela);
		ticket = cola.remove();
		while (ticket != centinela) {
			cantTicketsPorSectorYPrioridad[ticket.getSector().ordinal()][ticket.getPrioridad().ordinal()]++;
			cola.add(ticket);
			ticket = cola.remove();
		}
		return cantTicketsPorSectorYPrioridad;
	}

	public Ticket eliminarTicket(int id) {
		System.out.println("Eliminar ticket");
		Ticket ticketBorrado = null;
		Ticket centinela = null;
		Ticket ticketEncontrado = null;

		cola.add(centinela);
		ticketEncontrado = cola.remove();
		while (ticketEncontrado != centinela) {
			if (ticketEncontrado.getId() == id) {
				ticketBorrado = ticketEncontrado;
			} else {
				cola.add(ticketEncontrado);
			}
			ticketEncontrado = cola.remove();
		}
		return ticketBorrado;
	}

	public void recorrer() {
		System.out.println("Recorrer:");
		Ticket centinela = null;
		Ticket ticket = null;

		cola.add(centinela);
		ticket = cola.remove();
		while (ticket != centinela) {
			System.out.println(ticket);
			cola.add(ticket);
			ticket = cola.remove();
		}
	}

}
