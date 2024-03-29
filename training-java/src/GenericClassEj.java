
public class GenericClassEj<K, V> {
	private K item1;
	private V item2;
	
	public GenericClassEj(K item1, V item2) {
		super();
		this.item1 = item1;
		this.item2 = item2;
	}
	
	
	@Override
	public String toString() {
		return "GenericClassEj [item1=" + item1 + ", item2=" + item2 + "]";
	}


	public K getItem1() {
		return item1;
	}
	public void setItem1(K item1) {
		this.item1 = item1;
	}
	
	public V getItem2() {
		return item2;
	}
	public void setItem2(V item2) {
		this.item2 = item2;
	}
	
	

}
