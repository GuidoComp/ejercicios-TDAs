package modeloDeParcialCambioClimatico;

public class ZonaTropical extends Zona {

	private static final double TEMP_LIMITE = 18;
	private static final int ELEV_LIMITE = 1000;
	
	public ZonaTropical(int extension, int elevacion) {
		super(extension, elevacion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean estaEnRiesgo() {
		return this.traspasoLimiteInferior(TEMP_LIMITE) && this.getElevacion() <= ELEV_LIMITE;
	}

	@Override
	public String toString() {
		return "ZonaTropical []";
	}
}
