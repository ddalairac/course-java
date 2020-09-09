package aggregators;

import java.util.List;

public class MaxAggregator extends Aggregator{
	
	public MaxAggregator() {
		super();
	}
	public MaxAggregator(List<Double> numbers) {
		super(numbers);
	}

	public double calculate() {
		double max = numbers.get(0);
		for(Double number : numbers){
			if(number > max){
				max = number;
			}
		}
		return max;
	}

	public List<Double> getValues() {
		return numbers;
	}
	
}
