package concurrency;

public class ThreadSafeCollectionApplication {

	public static void main(String[] args) throws InterruptedException {
		ProductInventory inventory = new ProductInventory();

		/* Las listas no son sincronizadas (las hace mas lentas) por lo que lanzan la excepcion ConcurrentModificationException*/
//		Thread popularLista = new Thread(new Runnable() {
//			public void run() {
//				inventory.populateList();
//			}
//		});
//		Thread mostrarLista = new Thread(new Runnable() {
//			public void run() {
//				inventory.displayList();
//			}
//		});
//		popularLista.start();
//		try {
//			Thread.sleep(50);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		mostrarLista.start();
		
		/* Usar lista thread safe CopyOnWriteArrayList*/
		Thread popularListaSafe = new Thread(new Runnable() {
			public void run() {
				inventory.populateListSafe();
			}
		});
		Thread mostrarListaSafe = new Thread(new Runnable() {
			public void run() {
				inventory.displayListSafe();
			}
		});
		popularListaSafe.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		mostrarListaSafe.start();
		popularListaSafe.join(); // une el thread al thread del main
		

	}

}
