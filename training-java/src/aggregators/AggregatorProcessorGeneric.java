package aggregators;

import java.io.IOException;
import java.util.List;

import fileprocessors.StockFileReader;

public class AggregatorProcessorGeneric<T extends Aggregator> {

	public AggregatorProcessorGeneric(T aggregator, String file) {
		super();
		this.aggregator = aggregator;
		this.file = file;
	}

	T aggregator;
	String file;

	public double runAggregator(int colIndex) {
		StockFileReader fileReader = new StockFileReader(file);
		List<String> lines;
		try {
			lines = fileReader.readFileData();

			for (String line : lines) {
				String[] numbers = line.split(",");
//				Number value = Double.parseDouble(numbers[colIndex]);
//				this.aggregator.add(value.doubleValue());
				double value = Double.parseDouble(numbers[colIndex]);
				this.aggregator.add(value);
			}
		} catch (IOException e) {
			System.out.println("No se pudo leer el archivo");
		}
		double number = aggregator.calculate();
		return number;
	}
}
