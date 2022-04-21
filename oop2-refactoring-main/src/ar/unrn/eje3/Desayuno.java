package ar.unrn.eje3;

public class Desayuno extends Gasto {

	private int monto;

	public Desayuno(int monto) {
		super(monto);
		this.monto = monto;
		// TODO Auto-generated constructor stub
	}

	public int montoDeGastoComida() {
		return this.monto;
	}

	private String excedeElLimite() {
		String excede = "";

		if (monto > MONTO_EXCESO_DESAYUNO)
			excede = "\t" + MARCA_EXCESO_DE_COMIDA;
		return excede;
	}

	public String detalle() {
		return NOMBRE_GASTO_DESAYUNO + "\t" + this.montoDeGastoComida() + this.excedeElLimite();
	}

}
