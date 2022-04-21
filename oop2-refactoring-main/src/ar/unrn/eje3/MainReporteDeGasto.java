package ar.unrn.eje3;

import java.util.ArrayList;
import java.util.List;

public class MainReporteDeGasto {

	public static void main(String[] args) {
		Gasto gasto = new Cena(200);
		Gasto gasto1 = new Desayuno(7000);
		Gasto gasto3 = new AlquilerDeAuto(1200);

		Gastos gastos = new Gastos(gasto, gasto1, gasto3);

		ReporteDeGastos reporte = new ReporteDeGastos(new ProveedorDeFecha(), gastos);

		String detalles = reporte.imprimir();
		System.out.println(detalles);

	}

}
