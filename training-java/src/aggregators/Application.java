package aggregators;

import java.io.IOException;

import aggregators.*;

public class Application {

	public static void main(String[] args)  {
		
			
		/* *** Metodos y herencia ****/
//		Aggregator values = new MeanAggregator();
//		values.add(100.93);
//		values.add(101.32);
//		values.add(103.41);
//		values.add(107.87);
//		values.add(100.90);
//		values.add(98.76);
//		Aggregator minValue = new MinAggregator(values.getValues());
//		double result = minValue.calculate();
//		System.out.println(result);
		

		/* *** Procesar File ****/
//		AggregatorProcessor processor = new AggregatorProcessor()s;
//		processor.calculateMaxMaxAvNums();
		

		/* *** Procesar File Generico ****/
		MaxAggregator agg = new MaxAggregator();
		AggregatorProcessorGeneric<MaxAggregator> aggProcessor = new AggregatorProcessorGeneric<MaxAggregator>(agg,"table.csv");
		double value = aggProcessor.runAggregator(1);
		System.out.println("agg max: "+value);	
	}

}
