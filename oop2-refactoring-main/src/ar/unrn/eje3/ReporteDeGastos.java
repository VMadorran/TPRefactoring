package ar.unrn.eje3;

import java.util.List;

public class ReporteDeGastos {
	private Fecha proveedorDeFecha;
	private Gastos gastos;

	public ReporteDeGastos(Fecha proveedorDeFecha, Gastos gastos) {
		this.proveedorDeFecha = proveedorDeFecha;
		this.gastos = gastos;

	}

	public String imprimir() {

		String fechaDeReporte = "Expenses " + proveedorDeFecha.now();

		int monto = this.gastos.montoDeGastosDeComida();

		String gastoDeComida = "Gastos de comida: " + monto;

		monto = monto + this.gastos.montoDeGastos();

		String montoTotalDeGastos = "Total de gastos: " + monto;

		return fechaDeReporte + "\n" + gastos.detallesDeGastos() + gastoDeComida + "\n" + montoTotalDeGastos;
	}
}
