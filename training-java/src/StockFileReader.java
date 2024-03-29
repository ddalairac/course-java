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
	

}
