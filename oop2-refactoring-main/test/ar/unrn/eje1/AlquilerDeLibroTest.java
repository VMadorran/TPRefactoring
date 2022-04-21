package ar.unrn.eje1;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AlquilerDeLibroTest {
	@Test
	public void calcularDeudaYPununtosDeClienteTest() {

		Libro elTunel = new LibroRegular("El Túnel");
		Libro antesDelFin = new LibroRegular("Antes del Fin");

		Alquiler alquilerElTunel = new Alquiler(elTunel, 5);
		Alquiler alquilerAntesDelFin = new Alquiler(antesDelFin, 3);
		Alquileres alquileres = new Alquileres(alquilerElTunel, alquilerAntesDelFin);

		Cliente yo = new Cliente("Javier", alquileres);

		Object[] resultadoReal = yo.calcularDeudaYPuntosObtenidos();
		Object[] resultadoEsperado = { 10.0, 2 };
		assertArrayEquals(resultadoEsperado, resultadoReal);
	}
}
