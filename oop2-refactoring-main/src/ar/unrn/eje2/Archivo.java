package ar.unrn.eje2;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface Archivo {

	public List<String[]> reader() throws IOException;

}
