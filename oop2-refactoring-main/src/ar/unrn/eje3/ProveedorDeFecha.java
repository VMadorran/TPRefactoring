package ar.unrn.eje3;

import java.time.LocalDate;

public class ProveedorDeFecha implements Fecha {

	@Override
	public LocalDate now() {
		// TODO Auto-generated method stub
		LocalDate hoy = LocalDate.of(2022, 3, 1);
		return hoy;
	}

}
