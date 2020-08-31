import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class StockFileReader {
	String filePath;

	public StockFileReader(String filePath) {
		this.filePath = filePath;
	}

	public List<String> getHeaders() throws IOException{
		String line = readFirstLine(filePath);
		String[] header = line.split(",");
		List<String> values  = new ArrayList<>();
		values = Arrays.asList(header);
		return values;
	}
	private String readFirstLine(String path) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			return br.readLine();
		}
	}

	public List<String> readFileData() throws IOException {
		List<String> lines = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			// saltear primera linea
			br.readLine();

			// Seguir desde la segunda linea
			String line = null;
			while ((line = br.readLine()) != null) {
				lines.add(line);
			}

		}
		return lines;
	}
	
	public static List<HashMap<String,Double>> populateStockFileData(List<String> headers, List<String> lines){
		List<HashMap<String,Double>> dataResult  = new ArrayList<>();
		for (String line: lines) {
			String[] values = line.split(",");
			int index = 0;
			HashMap<String,Double> headerValueMap = new HashMap<>();
			for (String value: values) {
				double dval = Double.parseDouble(value);
				headerValueMap.put(headers.get(index),dval);
				index++;
			}
			dataResult.add(headerValueMap);
		}
		return dataResult;
	}

}
