package ar.unrn.eje1;

import java.util.ArrayList;
import java.util.List;

public class Alquileres {
	private List<Alquiler> alquileres;
	public static final int PUNTOS_POR_ALQUILER = 1;

	public Alquileres(Alquiler... alquileres) {
		this.alquileres = List.of(alquileres);
	}

	public double montoTotalDeAlquileres() {

		double montoTotal = 0;

		for (Alquiler alquiler : alquileres) {
			montoTotal += alquiler.montoDeAlquiler();
		}

		return montoTotal;
	}

	public int puntosTotales() {
		int puntosTotales = 0;

		for (Alquiler alquiler : alquileres) {
			puntosTotales += PUNTOS_POR_ALQUILER + alquiler.puntoExtraDeNuevoLanzamiento();
		}
		return puntosTotales;
	}
}
