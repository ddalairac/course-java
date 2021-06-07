package concurrency;

public class ThreadSafetyApplication {

	public static void main(String[] args) throws InterruptedException {
		Service s = new Service();
		Work w1 = new Work(s);
		Work w2 = new Work(s);
		Work w3 = new Work(s);
		Thread.sleep(100);
		w1.start();
		w2.start();
		w3.start();
	}
}

class Service {
	private int number1 = 0;
	private int number2 = 0;
	
	public Service() {
		this.number1 = 0;
		this.number2 = 0;
	}
	/* Si al intentar ejecutar el mismo proceso en diferentes threads no va a correr entero antes de cambiar de thread
	 * Eso puede dar un resultado no esperado en el calculo*/
	public int nextNumber() {
		int aux = this.number1;
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.number1 = aux + 1;
		
		return this.number1;
	}
	/*synchronized fuerza ejecutar el conjunto como un atomo, o unidad antes de cambiar de thread*/
	public synchronized int nextNumberSafe() {
//		synchronized(this) {
			int aux = this.number2;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.number2 = aux + 1;
//		}
		return this.number2;
	}

	
}

class Work extends Thread {
	Service s;
	
	public Work(Service s) {
		super();
		this.s = s;
	}

	public void run() {
		for(int i=0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+"Safe: "+s.nextNumberSafe());
			System.out.println(Thread.currentThread().getName()+"    : "+s.nextNumber());
		}
	}
	
}