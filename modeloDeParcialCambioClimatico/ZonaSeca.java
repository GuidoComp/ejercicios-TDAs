package modeloDeParcialCambioClimatico;

public class ZonaSeca extends Zona {

	private static final double TEMP_LIMITE = 43;
	private static final double INS_LIMITE = 0.9;
	
	private double porcInsProm;
	
	public ZonaSeca(int extension, int elevacion, double porcInsProm) {
		super(extension, elevacion);
		this.porcInsProm = porcInsProm;
	}

	@Override
	public boolean estaEnRiesgo() {
		return this.getTempMedia() > TEMP_LIMITE && this.porcInsProm <= INS_LIMITE;
	}

}
