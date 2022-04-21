package ar.unrn.eje3;

public abstract class Gasto {
	private int monto;
	public static final String NOMBRE_GASTO_CENA = "Cena";
	public static final String NOMBRE_GASTO_DESAYUNO = "Desayuno";
	public static final String NOMBRE_GASTO_ALQUILER_AUTO = "Alquiler de autos";
	public static final int MONTO_EXCESO_DESAYUNO = 1000;
	public static final int MONTO_EXCESO_CENA = 5000;
	public static final String MARCA_EXCESO_DE_COMIDA = "x";

	public Gasto(int monto) {
		this.monto = monto;
	}

	public int montoDeGastoComida() {
		return 0;
	}

	public int montoDeGasto() {
		return 0;
	}

	public String detalle() {
		return null;
	}
}
