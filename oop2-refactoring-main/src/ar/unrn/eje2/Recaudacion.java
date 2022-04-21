package ar.unrn.eje2;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.opencsv.CSVReader;

public class Recaudacion {
	private Archivo parse;

	public Recaudacion(Archivo parse) {
		this.parse = parse;
	}

	public List<Map<String, String>> where(Map<String, String> options) throws IOException {
		List<String[]> csvData = new ArrayList<String[]>();
		csvData = parse.reader();

		if (options.containsKey("company_name")) {
			csvData = this.filtrarPorClave(() -> this.existeLaClave("company_name", options), 1, "company_name",
					csvData, options);
			;
		}

		if (options.containsKey("city")) {
			csvData = this.filtrarPorClave(() -> this.existeLaClave("city", options), 4, "city", csvData, options);
		}

		if (options.containsKey("state")) {

			csvData = this.filtrarPorClave(() -> this.existeLaClave("state", options), 5, "state", csvData, options);
		}

		if (options.containsKey("round")) {
			csvData = this.filtrarPorClave(() -> this.existeLaClave("round", options), 9, "round", csvData, options);
		}

		List<Map<String, String>> output = new ArrayList<Map<String, String>>();

		for (int i = 0; i < csvData.size(); i++) {
			Map<String, String> mapped = new HashMap<String, String>();
			extracted(csvData, mapped, i);
			output.add(mapped);
		}

		return output;
	}

	private List<String[]> filtrarPorClave(Condicion c, int columna, String clave, List<String[]> csvData,
			Map<String, String> options) {

		List<String[]> results = new ArrayList<String[]>();

		for (int i = 0; i < csvData.size(); i++) {
			if (csvData.get(i)[columna].equals(options.get(clave))) {
				results.add(csvData.get(i));
			}
		}
		return results;
	}

	public Map<String, String> findBy(Map<String, String> options) throws IOException, NoSuchEntryException {
		List<String[]> csvData = new ArrayList<String[]>();
		csvData = parse.reader();

		Map<String, String> mapped = new HashMap<String, String>();

		for (int i = 0; i < csvData.size(); i++) {
			if (options.containsKey("company_name")) {
				if (csvData.get(i)[1].equals(options.get("company_name"))) {
					extracted(csvData, mapped, i);
				} else {
					continue;
				}
			}

			if (options.containsKey("city")) {
				if (csvData.get(i)[4].equals(options.get("city"))) {
					extracted(csvData, mapped, i);
				} else {
					continue;
				}
			}

			if (options.containsKey("state")) {
				if (csvData.get(i)[5].equals(options.get("state"))) {
					extracted(csvData, mapped, i);
				} else {
					continue;
				}
			}

			if (options.containsKey("round")) {
				if (csvData.get(i)[9].equals(options.get("round"))) {
					extracted(csvData, mapped, i);
				} else {
					continue;
				}
			}

			return mapped;
		}

		throw new NoSuchEntryException();
	}

	private void extracted(List<String[]> csvData, Map<String, String> mapped, int i) {
		mapped.put("permalink", csvData.get(i)[0]);
		mapped.put("company_name", csvData.get(i)[1]);
		mapped.put("number_employees", csvData.get(i)[2]);
		mapped.put("category", csvData.get(i)[3]);
		mapped.put("city", csvData.get(i)[4]);
		mapped.put("state", csvData.get(i)[5]);
		mapped.put("funded_date", csvData.get(i)[6]);
		mapped.put("raised_amount", csvData.get(i)[7]);
		mapped.put("raised_currency", csvData.get(i)[8]);
		mapped.put("round", csvData.get(i)[9]);
	}

	private boolean existeLaClave(String clave, Map<String, String> options) {

		return options.containsKey(clave);
	}

	public static void main(String[] args) {

		Recaudacion recaudacion = new Recaudacion(new ArchivoCSV());
		try {
			Map<String, String> options = new HashMap<String, String>();
			options.put("company_name", "Facebook");
			options.put("round", "a");
			System.out.print(recaudacion.where(options).size());
		} catch (IOException e) {
			System.out.print(e.getMessage());
			System.out.print("error");
		}
	}
}

class NoSuchEntryException extends Exception {
}