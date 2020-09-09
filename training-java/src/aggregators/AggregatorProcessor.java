package aggregators;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import fileprocessors.StockFileApplication;
import fileprocessors.StockFileReader;

public class AggregatorProcessor {
	public List<HashMap<String,Double>> dataResult;
	public List<String> colNames;
	

	public AggregatorProcessor()  {
		try {
			StockFileReader fr = new StockFileReader("table.csv");
			this.dataResult = StockFileApplication.populateStockFileData(fr.getHeaders(), fr.readFileData());
			this.colNames = fr.getHeaders();
			
		} catch (IOException e) {
			System.out.println("No se pudo recuperar datos de 'table.csv'");
		}
	}
	public AggregatorProcessor(List<HashMap<String, Double>> dataResult) {
		this.dataResult = dataResult;
	}
	
	public ArrayList<Double> getColumnList(String colName) {
		ArrayList<Double> list = new ArrayList<>();
		//	{High=142.919998, Low=141.160004, Volume=2.32511E7, Adj Close=142.440002, Close=142.440002, Open=141.220001}
		for(HashMap<String, Double> hm: dataResult) {
			for (Entry<String, Double> kv : hm.entrySet()) {
				if (kv.getKey().contains(colName)) {
//					System.out.print(kv.getValue() + " "+kv.getValue().TYPE);
					list.add(kv.getValue());
				}
			}
			
		}
//		System.out.println(list);
		return list;
	}
	public void calculateMaxMaxAvNums() {
		for(String colName : colNames) {
//			System.out.println("| "+colName.toUpperCase()+": colNames");
			List<Double> numbers = getColumnList(colName);
//			System.out.println(numbers);
			MinAggregator minag = new MinAggregator(numbers);
			MaxAggregator maxag = new MaxAggregator(numbers);
			MeanAggregator meanag = new MeanAggregator(numbers);
			System.out.println(colName
					+"     	| Min: "+minag.calculate()
					+" 	- Max: "+maxag.calculate()
					+" 	- Average: "+meanag.calculate());
		}
	}
	
}
