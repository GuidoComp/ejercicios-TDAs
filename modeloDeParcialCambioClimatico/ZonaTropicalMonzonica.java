package modeloDeParcialCambioClimatico;

public class ZonaTropicalMonzonica extends ZonaTropical {

	private static final double TEMP_LIMITE = 15;
	private static final Intensidad INT_LIMITE = Intensidad.LEVE;
	
	private Intensidad intensidad;
	
	public ZonaTropicalMonzonica(int extension, int elevacion, Intensidad i) {
		super(extension, elevacion);
		this.intensidad = i;
	}

	@Override
	public boolean estaEnRiesgo() {
		return super.estaEnRiesgo() || (this.traspasoLimiteInferior(TEMP_LIMITE) && this.intensidad.equals(INT_LIMITE));
	}

	@Override
	public String toString() {
		return "ZonaTropicalMonzonica [intensidad=" + intensidad + "]";
	}
}
