package aggregators;

import java.util.ArrayList;
import java.util.List;

public abstract class Aggregator {
	
	List<Double> numbers;
	
	public Aggregator(){
		this.numbers = new ArrayList<Double>();
	}
	
	public Aggregator(List<Double> numbers){
		this.numbers = new ArrayList<Double>(numbers);
	}
	
	/**
	 * add data to the given collection
	 * 
	 */
	public void add(double number) {
		this.numbers.add(number);
	}
	/**
	 * Any class that is a derivative of the abstract class
	 * Aggregator must implement the calculate method.
	 * @return double
	 */
	public abstract double calculate();
	
	public abstract List<Double> getValues();
	
}
