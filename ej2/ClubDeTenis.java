package ej2;

public class ClubDeTenis {
	
	public boolean esTuboUsado(TuboDePelotasDeTenis tubo) {
		return !tubo.isFull() || tubo.tieneAlgunaPelotaVieja();
	}
}
