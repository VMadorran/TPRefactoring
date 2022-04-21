package ar.unrn.eje1;

public class Alquiler {
	private Libro copia;
	private int diasAlquilados;
	public static final int MONTO_RESTA_LIBRO_REGULAR = 2;
	public static final double MONTO_MULTIPLICACION = 1.5;
	public static final int MONTO_MULTIPLICACION_NUEVO_LANZAMIENTO = 3;
	public static final int MONTO_RESTA_LIBRO_INFANTIL = 3;
	public static final int DIAS_DE_ALQUILER_LIBRO_REGULAR = 2;
	public static final int DIAS_DE_ALQUILER_LIBRO_INFANTIL = 3;
	public static final int DIAS_DE_ALQUILER_LIBRO_LANZAMIENTO = 1;

	public Alquiler(Libro copia, int diasAlquilados) {
		this.copia = copia;
		this.diasAlquilados = diasAlquilados;
	}

	protected double montoDeAlquiler() {

		double resultado = 0;
		resultado = copia.montoDeAlquiler(this.diasAlquilados);
		return resultado;
	}

	protected int puntoExtraDeNuevoLanzamiento() {
		return this.copia.puntoExtraDeNuevoLanzamiento(this.diasAlquilados);

	}

}
