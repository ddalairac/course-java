package concurrency;

public class ConcurrencyAplication {

	public static void main(String[] args) {
		// Thread que ejecuta un clase que heredo
		Task taskrunner = new Task("Num");
		Task taskrunner2 = new Task("bla");
		taskrunner.start();
		taskrunner2.start();
		
		// Thread que ejecuta un runnable
		Runner runner = new Runner();
		Thread tr = new Thread(runner);
		tr.start();
		// taskrunner.start(); Exception: solo se puede correr una vez un thread
		
		// Thread con instancia de runneable anónima
		Thread trAnonimo = new Thread(new Runnable() {
			public void run() {
				for(int i=0; i < 100; i++) {
					System.out.println("--thd: "+i+" - "+Thread.currentThread().getName());
				}
			}
		});
		trAnonimo.start();
		
		// Para chequear que no es en cascada
		System.out.println("Hola Mundo");
		System.out.println("Hola sistema solar");
		
		// Esperar lapso de tiempo
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Hola Universo");

	}

}
class Runner implements Runnable{
	public void run() {
		for(int i=0; i < 100; i++) {
			System.out.println("--thd: "+i+" - "+Thread.currentThread().getName());
		}
	}
}
class Task extends Thread {
	String str;
	
	
	public Task(String name) {
		super();
		this.str = name;
//		this.setName(str);
	}

	public void run() {
		for(int i=0; i < 100; i++) {
			System.out.println(str+": "+i+" - "+Thread.currentThread().getName());
		}
	}
	
}