package ar.unrn.eje3;

import java.util.ArrayList;
import java.util.List;

public class Gastos {
	private List<Gasto> gastos = new ArrayList<Gasto>();

	public Gastos(Gasto... gastos) {
		this.gastos = List.of(gastos);
	}

	public int montoDeGastosDeComida() {

		int monto = 0;

		for (Gasto gasto : gastos) {
			monto = monto + gasto.montoDeGastoComida();
		}
		return monto;
	}

	public int montoDeGastos() {

		int monto = 0;

		for (Gasto gasto : gastos) {
			monto = monto + gasto.montoDeGasto();
		}
		return monto;
	}

	public String detallesDeGastos() {
		String detalles = "";

		for (Gasto gasto : gastos) {
			detalles += gasto.detalle() + "\n";
		}
		return detalles;
	}

}
