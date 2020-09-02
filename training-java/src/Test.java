import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello W");

		System.out.println("ingrese un texto:");
		Scanner input = new Scanner(System.in);
		String enteredText = input.nextLine();
		System.out.println("Texto ingresado: "+enteredText);

		GenericClassEj<String,Integer> genericClass = new GenericClassEj("hola",19);
		System.out.println(genericClass);
	}

}
