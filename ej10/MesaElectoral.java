package ej10;

public class MesaElectoral {

	private ElectoresPorDni electoresPorDni;
	private PadronElectoral padron;
	
	public MesaElectoral(ElectoresPorDni electoresPorDni, PadronElectoral padron) {
		this.electoresPorDni = electoresPorDni;
		this.padron = padron;
	}
	
	public void generarPadron() {
		Elector electorSinM = null;
		for (ElectorConMesa electorConM: this.electoresPorDni) {
			electorSinM = electorConM.generarElectorSinMesa();
			padron.registrarElectorEnMesa(electorSinM, electorConM.getNroMesa());
		}
	}
}
