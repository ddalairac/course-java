package concurrency;

public class Product {
	int num;
	String name;
	public Product(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Product [num=" + num + ", name=" + name + "]";
	}
}
