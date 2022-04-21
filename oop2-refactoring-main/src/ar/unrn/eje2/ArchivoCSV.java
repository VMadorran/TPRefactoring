package ar.unrn.eje2;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.opencsv.CSVReader;

public class ArchivoCSV implements Archivo {

	@Override
	public List<String[]> reader() throws IOException {
		// TODO Auto-generated method stub
		List<String[]> csvData = new ArrayList<String[]>();
		CSVReader reader;
		reader = new CSVReader(new FileReader("data.csv"));

		String[] row = null;

		while ((row = reader.readNext()) != null) {
			csvData.add(row);
		}

		reader.close();
		csvData.remove(0);
		return csvData;
	}
	
	public void clavesDelArchivo() {
		
	}

}
