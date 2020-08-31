import java.util.ArrayList;
import java.util.LinkedList;

public class Veicle implements Comparable<Veicle>{
	private String model;
	private String brand;
	private int doors;
	private boolean automatic;
	private ArrayList<String> features;
	
	public Veicle(String model, String brand, int doors, boolean automatic, ArrayList<String> features) {
		super();
		this.model = model;
		this.brand = brand;
		this.doors = doors;
		this.automatic = automatic;
		this.features = features;
	}

	/* para que se peuda usar el sort*/
	public int compareTo(Veicle v) {
//		if(this.model > v.model) {
//			return 1;
//		} else if(this.model < v.model){
//			return -1;
//		}
//		return 0;
		
		return  toString().compareTo(v.toString());
	}
	
	@Override
	public String toString() {
		return "{model=" + model + ", brand=" + brand + ", doors=" + doors + ", automatic=" + automatic
				+ ", features=" + features 
//				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
//				+ ", toString()=" + super.toString() 
				+ "}\n	";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (automatic ? 1231 : 1237);
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + doors;
		result = prime * result + ((features == null) ? 0 : features.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veicle other = (Veicle) obj;
		if (automatic != other.automatic)
			return false;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (doors != other.doors)
			return false;
		if (features == null) {
			if (other.features != null)
				return false;
		} else if (!features.equals(other.features))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}
	
	
	
}
