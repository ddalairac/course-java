package aggregators;

import java.util.ArrayList;
import java.util.List;

public class MeanAggregator extends Aggregator{


	public MeanAggregator() {
		super();
	}
	public MeanAggregator(List<Double> numbers) {
		super(numbers);
	}
	
	public double calculate() {
		double result = 0;
		if(!numbers.isEmpty()){
			double value = 0.00;
			for(Double number : numbers){
				value+=number;
			}
			result = value/numbers.size();
		}
		return result;
	}

	public List<Double> getValues() {
		return numbers;
	}

}
