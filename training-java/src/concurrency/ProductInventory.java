package concurrency;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ProductInventory {
	List<Product> prods = new ArrayList<>();
	List<Product> prodsConcurrent = new CopyOnWriteArrayList<>();

	/* NO Thread safe*/
	public void populateList() {
		for(int i=0; i < 100; i++) {
			Product prod = new Product(i,Thread.currentThread().getName());
			this.prods.add(prod);
			System.out.println("ADDED    : "+prod);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public void displayList() {
		for(Product prod: this.prods) {
			System.out.println("List    :"+prod);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	/* SI Thread safe*/
	public void populateListSafe() {
		for(int i=0; i < 100; i++) {
			Product prod = new Product(i,Thread.currentThread().getName());
			this.prodsConcurrent.add(prod);
			System.out.println("ADDED safe: "+prod);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public void displayListSafe() {
		for(Product prod: this.prodsConcurrent) {
			System.out.println("List  safe:"+prod);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
