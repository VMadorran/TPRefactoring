package ar.unrn.eje1;

public class LibroNuevoLanzamiento extends Libro {
	private String nombre;
	private int precio = 1;

	public LibroNuevoLanzamiento(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	public double montoDeAlquiler(int diasDeAlquiler) {
		double monto = this.precio;
		monto += (diasDeAlquiler * MONTO_MULTIPLICACION_NUEVO_LANZAMIENTO);
		return monto;
	}

	public int puntoExtraDeNuevoLanzamiento(int diasDeAlquiler) {

		int puntoExtra = 0;
		if (diasDeAlquiler > DIAS_DE_ALQUILER_LIBRO_LANZAMIENTO)
			puntoExtra++;

		return puntoExtra;
	}
}
