package ar.unrn.eje1;

public class LibroRegular extends Libro {
	private String nombre;
	private int precio = 2;

	public LibroRegular(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	public double montoDeAlquiler(int diasDeAlquiler) {
		double monto = this.precio;

		if (diasDeAlquiler > DIAS_DE_ALQUILER_LIBRO_REGULAR)
			monto += (diasDeAlquiler - MONTO_RESTA_LIBRO_REGULAR) * MONTO_MULTIPLICACION;

		return monto;
	}

}
