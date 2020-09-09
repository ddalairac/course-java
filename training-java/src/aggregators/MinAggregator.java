package aggregators;

import java.util.ArrayList;
import java.util.List;

public class MinAggregator extends Aggregator{
	public MinAggregator() {
		super();
	}
	public MinAggregator(List<Double> numbers) {
		super(numbers);
	}

	public double calculate() {
		double min = numbers.get(0);
		for(Double number : numbers){
			if(number < min){
				min = number;
			}
		}
		return min;
	}

	public List<Double> getValues() {
		return numbers;
	}

}
