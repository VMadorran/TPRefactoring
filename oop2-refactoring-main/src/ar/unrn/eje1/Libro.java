package ar.unrn.eje1;

public abstract class Libro {
	private String nombre;
	private int precio;
	public static final int MONTO_RESTA_LIBRO_REGULAR = 2;
	public static final double MONTO_MULTIPLICACION = 1.5;
	public static final int MONTO_MULTIPLICACION_NUEVO_LANZAMIENTO = 3;
	public static final int MONTO_RESTA_LIBRO_INFANTIL = 3;
	public static final int DIAS_DE_ALQUILER_LIBRO_REGULAR = 2;
	public static final int DIAS_DE_ALQUILER_LIBRO_INFANTIL = 3;
	public static final int DIAS_DE_ALQUILER_LIBRO_LANZAMIENTO = 1;

	public Libro(String nombre) {
		this.nombre = nombre;
	}

	public double precioLibro() {
		return 0;
	}

	public double montoDeAlquiler(int diasDeAlquiler) {
		return 0;
	}

	public int puntoExtraDeNuevoLanzamiento(int diasDeAlquiler) {
		return 0;
	}

}