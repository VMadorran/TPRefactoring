package ar.unrn.eje1;

public class LibroInfantil extends Libro {
	private String nombre;
	private int precio = 2;

	public LibroInfantil(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	public double precioLibro() {
		return this.precio;
	}

	public double montoDeAlquiler(int diasDeAlquiler) {
		double monto = this.precio;

		if (diasDeAlquiler > DIAS_DE_ALQUILER_LIBRO_INFANTIL)
			monto = monto + ((diasDeAlquiler - MONTO_RESTA_LIBRO_INFANTIL) * MONTO_MULTIPLICACION);
		return monto;
	}
}
