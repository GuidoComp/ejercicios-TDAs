package ej5;

public class Ticket {

	private int id;
	private String fecha;
	private Prioridad prioridad;
	private Sector sector;
	
	public Ticket(int id, String fecha, Prioridad prioridad, Sector sector) {
		this.id = id;
		this.fecha = fecha;
		this.prioridad = prioridad;
		this.sector = sector;
	}

	public int getId() {
		return id;
	}
	
	public Prioridad getPrioridad() {
		return prioridad;
	}

	public Sector getSector() {
		return sector;
	}

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", fecha=" + fecha + "]";
	}
}
