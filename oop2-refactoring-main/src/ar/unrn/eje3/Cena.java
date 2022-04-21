package ar.unrn.eje3;

public class Cena extends Gasto {

	private int monto;

	public Cena(int monto) {
		super(monto);
		// TODO Auto-generated constructor stub
		this.monto = monto;
	}

	public int montoDeGastoComida() {
		return this.monto;
	}

	private String excedeElLimite() {
		String excede = "";

		if (monto > MONTO_EXCESO_CENA)
			excede = "\t" + MARCA_EXCESO_DE_COMIDA;
		return excede;
	}

	public String detalle() {
		return NOMBRE_GASTO_CENA + "\t" + this.montoDeGastoComida() + this.excedeElLimite();
	}

}
