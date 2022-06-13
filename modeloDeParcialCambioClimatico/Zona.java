package modeloDeParcialCambioClimatico;

public abstract class Zona implements Evaluable {

	private static final int MESES_ANIO = 2;
	private static final int DIAS_MES = 2;
	private int extension;
	private int elevacion;
	private double[][] tempMedia;
	
	public Zona(int extension, int elevacion) {
		this.extension = extension;
		this.elevacion = elevacion;
		this.tempMedia = new double[DIAS_MES][MESES_ANIO];
	}
	
	public void setMatriz(double tempMes1Dia1, double tempMes2Dia1, double tempMes1Dia2, double tempMes2Dia2) {
		double[] array = {tempMes1Dia1, tempMes2Dia1, tempMes1Dia2, tempMes2Dia2};
		int i = 0;
		for (int dia = 0; dia < tempMedia.length; dia++) {
			for (int mes = 0; mes < tempMedia[dia].length; mes++) {
				tempMedia[dia][mes] = array[i];
				i++;
			}
		}
	}
	
	public double getTempMedia() {
		double sumaTemps = 0;
		int cantRegistros = 0;
		
		cantRegistros = DIAS_MES * MESES_ANIO;
		for (int dia = 0; dia < tempMedia.length; dia++) {
			for (int mes = 0; mes < tempMedia[dia].length; mes++) {
				sumaTemps += tempMedia[dia][mes];
			}
		}
		return (double) sumaTemps / cantRegistros;
	}

	public int getElevacion() {
		return elevacion;
	}
	
	public boolean traspasoLimiteInferior(double temp) {
		boolean traspaso = false;
		
		for (int dia = 0; dia < tempMedia.length; dia++) {
			for (int mes = 0; mes < tempMedia[dia].length; mes++) {
				if (tempMedia[dia][mes] < temp) {
					traspaso = true;
				}
			}
		}
		return traspaso;
	}
	
	public boolean traspasoLimiteInferior(int nroMes, double temp) {
		boolean traspaso = false;
		
		for (int dia = 0; dia < tempMedia.length; dia++) {
			if (tempMedia[dia][nroMes] < temp) {
				traspaso = true;
			}
		}
		return traspaso;
	}

	@Override
	public String toString() {
		return "Zona [extension=" + extension + ", elevacion=" + elevacion + "]";
	}
}
