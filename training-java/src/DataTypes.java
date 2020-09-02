import java.util.*;

public class DataTypes {

	public static void main(String[] args) {
		// PRIMITIVES
		byte numByte = 127; 		//1 byte
		short numShort = 32767; 	//2 bytes
		int numInt = 2147483647; 	//4 bytes
		long numLong = 9223372036854775807L; //8 bytes
		float numFloat = 0.00000001f;//4 bytes
		double numDouble = 0.0d; 	//8 bytes
		boolean someBoolean = false;//1 bit
		char someChar = 'c';  		//2 bytes
		
		
		// OBJECTS
		String someText = "texto";
		
		int[] arrayNum = new int[5]; // arrays
		arrayNum[0] = 10;
		arrayNum[1] = 20;
		
		int[] arrayNum2 = new int[] {111,222,333};
		System.out.println(arrayNum2[0]);
		

		Veicle vehicle1 = new Veicle("208","Peugeot",5,false,null);
		Veicle vehicle2 = new Veicle("Gol","Volkswagen",3,true,null);
		Veicle vehicle3 = new Veicle("Gol","Volkswagen",3,true,null);
		
		System.out.println("vehicle equals: "+vehicle1.equals(vehicle2));
		System.out.println("vehicle hashCode v1: "+vehicle1.hashCode());
		System.out.println("vehicle hashCode v2: "+vehicle2.hashCode());
		System.out.println("vehicle hashCode v3: "+vehicle3.hashCode());
		System.out.println("vehicle toString: "+vehicle1.toString());
		
				
		
		
		// COLECTIONS
		/* No se pueden usar los primitivos como tipo, Hay clases para definirlos (ej: int => Integer) 
		 * No es necesario repetir el tipo, al crear la instancia.*/
		
		//List Collections (Hay idems duplicados, orden de insercion por default)
		ArrayList<String> arrList = new ArrayList<>();						// Implementa Arrays: mas rapido para recorrerlo
		LinkedList<Integer> linkList = new LinkedList<>();   				// Double linkedList: Mas rapido para agregar y quitar items
		LinkedList<Veicle> veicles = new LinkedList<>();   					// custom obj type
		Vector<Integer> vectorList = new Vector<>(); 
		
		//Set Collections (No hay items duplicados)
		HashSet<Integer> hash = new HashSet<>();   							// Siempre esta ordenada
		LinkedHashSet<Integer> linkhash = new LinkedHashSet<>(); 			// Mantiene orden original
		TreeSet<Integer> treeset; 
		SortedSet <Integer> sortedset ; 
		
		// Maps
		HashMap<String,Integer> dictionarySorted = new HashMap<>();			// Siempre esta ordenado (no puede haber duplicados, sobreescribe)
		LinkedHashMap<String,Integer> dictionary = new LinkedHashMap<>();	// Mantiene orden original (no puede haber duplicados, sobreescribe)
		Hashtable<String,Integer> hashtable = new Hashtable<>();
		TreeMap<String,Integer> treemap  = new TreeMap<>();
		SortedMap<String,Integer> sortedmap  = new TreeMap<>();
		
		
	}
	

}
