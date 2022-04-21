package ar.unrn.eje3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class ReporteDeGastoTest {

	@Test
	public void ReporteDeGastoTest() {
		Gasto gasto = new Cena(200);
		Gasto gasto1 = new Desayuno(7000);
		Gasto gasto3 = new AlquilerDeAuto(1200);

		Gastos gastos = new Gastos(gasto, gasto1, gasto3);

		ReporteDeGastos reporte = new ReporteDeGastos(new ProveedorDeFecha(), gastos);

		String reporteReal = reporte.imprimir();
		String reporteEsperado = "Expenses " + "2022-03-01" + "\n" + "Cena" + "\t" + "200" + "" + "\n" + "Desayuno"
				+ "\t" + "7000" + "\t" + "x" + "\n" + "Alquiler de autos" + "\t" + "1200" + "\n" + "Gastos de comida: "
				+ "7200" + "\n" + "Total de gastos: " + "8400";

		assertEquals(reporteEsperado, reporteReal);
	}

}
