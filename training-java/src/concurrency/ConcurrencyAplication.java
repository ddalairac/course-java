package concurrency;

public class ConcurrencyAplication {

	public static void main(String[] args) {
		Task taskrunner = new Task("Num");
		Task taskrunner2 = new Task("	bla");
		taskrunner.start();
		// taskrunner.start(); Exception
		System.out.println("Hola Mundo");
		taskrunner2.start();
		System.out.println("Hola Solar System");
	}

}
class Task extends Thread {
	String str;
	
	public Task(String name) {
		super();
		this.str = name;
	}

	public void run() {
		for(int i=0; i < 100; i++) {
			System.out.println(str+": "+i);
		}
	}
	
}