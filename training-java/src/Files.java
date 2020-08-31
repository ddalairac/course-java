import java.io.*; // importar todas las clases del package
import java.util.*;

public class Files {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String myStr = "   	    12312312        ";
//		System.out.println(myStr);
//		System.out.println(myStr.trim());

//		fileScanner();
//		fileReader();
		fileReader2();
	
	}

	public static void fileScanner() {
		try {
			File textFile = new File("text-file.txt");
			Scanner input;
			input = new Scanner(textFile);
			while (input.hasNextLine()) {
				String line = input.nextLine();
				System.out.println(line);
			}
			input.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Archivo no encontrado");
			e.printStackTrace();
		}
	}

	public static void fileReader() {
		File file = null;
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		String line;
		try {
			file = new File("text-file.txt");
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);

			line = bufferedReader.readLine();
			while (line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}

		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado ");
//			e.printStackTrace();

		} catch (IOException e) {
			System.out.println("No se pudo leer el archivo " + file.getName());

		} finally {
			try {
				// chequear si es null para no usar NullPointerException
				if (bufferedReader != null)
					bufferedReader.close();
				if (fileReader != null)
					fileReader.close();

			} catch (IOException e) {
				System.out.println("No se pudo cerrar el archivo " + file.getName());
//			} catch(NullPointerException ex) {
//				System.out.println("Probablemente el archivo nunca se abrio " + ex.getMessage());				
			}
		}
	}

	public static void fileReader2() {
		File file = new File("text-file.txt");
		/*
		 * try con resources, para los que implementan AutoCloseable, para no tener que
		 * usar el finally para cerrarlos (Desde Java 1.7)
		 */
		try (FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);) {

			String line = bufferedReader.readLine();
			while (line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}

		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado ");

		} catch (IOException e) {
			System.out.println("No se pudo leer el archivo " + file.getName());

		} catch (NullPointerException ex) {
			System.out.println("Probablemente el archivo nunca se abrio ");
		}
	}

	
}

