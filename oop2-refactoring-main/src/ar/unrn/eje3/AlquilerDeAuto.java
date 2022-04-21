package ar.unrn.eje3;

public class AlquilerDeAuto extends Gasto {

	private int monto;

	public AlquilerDeAuto(int monto) {
		super(monto);
		this.monto = monto;
		// TODO Auto-generated constructor stub
	}

	public int montoDeGasto() {
		return this.monto;
	}

	public String detalle() {
		return NOMBRE_GASTO_ALQUILER_AUTO + "\t" + this.monto;
	}

}
