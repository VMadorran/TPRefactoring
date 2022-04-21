package ar.unrn.eje1;

public class Main {
	public static void main(String args[]) {

		Libro elTunel = new LibroRegular("El Túnel");
		Libro antesDelFin = new LibroRegular("Antes del Fin");

		Alquiler alquilerElTunel = new Alquiler(elTunel, 5);
		Alquiler alquilerAntesDelFin = new Alquiler(antesDelFin, 3);
		Alquileres alquileres = new Alquileres(alquilerElTunel, alquilerAntesDelFin);

		Cliente yo = new Cliente("Javier", alquileres);

		Object[] resultado = yo.calcularDeudaYPuntosObtenidos();
		System.out.println(resultado[0]);
		System.out.println(resultado[1]);
	}
}