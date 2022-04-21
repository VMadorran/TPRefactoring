package ar.unrn.eje1;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private Alquileres alquileres;
	private String nombre;

	public Cliente(String nombre, Alquileres alquileres) {
		this.nombre = nombre;
		this.alquileres = alquileres;
	}

	public Object[] calcularDeudaYPuntosObtenidos() {
		Object[] resultado = new Object[2];
		double total = 0;
		int puntosDeAlquiler = 0;

		total = alquileres.montoTotalDeAlquileres();
		puntosDeAlquiler = alquileres.puntosTotales();

		resultado[0] = total;
		resultado[1] = puntosDeAlquiler;

		return resultado;
	}

}