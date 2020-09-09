import java.util.*;

public class CollectionsEj {

	public static void main(String[] args) {


		//COLECTIONS
		/* No se pueden usar los primitivos como tipo, Hay clases para definirlos (ej: int => Integer) */
		ArrayList<String> arrList = new ArrayList<>();						// Implementa Arrays: mas rapido para recorrerlo
		LinkedList<Integer> linkList = new LinkedList<>();   				// Double linkedList: Mas rapido para agregar y quitar items
		LinkedList<Veicle> veicles = new LinkedList<>();   					// custom obj type
		HashSet<Integer> hash = new HashSet<>();   							// Hash: evita items duplicados. Siempre esta ordenada
		LinkedHashSet<Integer> linkhash = new LinkedHashSet<>(); 			// Hash: evita items duplicados. Mantiene orden original
		HashMap<String,Integer> dictionarySorted = new HashMap<>();			// Map <Key,Value>. Siempre esta ordenado (no puede haber duplicados, sobreescribe)
		LinkedHashMap<String,Integer> dictionary = new LinkedHashMap<>();	// Map <Key,Value>. Mantiene orden original (no puede haber duplicados, sobreescribe)
		LinkedList<? extends Veicle> whildcardUpper = new LinkedList<>();	// Whildcard Upper, Lista de objetos que extienden o implementan X class
		LinkedList<? super Veicle> whildcardLower = new LinkedList<>();		// Whildcard Lower, Lista de objetos de x class o sus padres
		
		
		
		arrList.add("Radio");
		arrList.add("Alarm");
//				arrList.remove(0);
		
		System.out.println("arrList: "+arrList);
		linkList.add(1);
		linkList.addFirst(2);
		linkList.remove(0);
//			.removeFirst();
//			.clear(); // borra todos los items
//			.addAll(dummyList) merge lista
//			.removeAll(dummyList) borra todos los items de la list1 que existen en la lista 2 (inclusive dupicados)
//			.retainAll(dummyList) Borra todo salvo lo que recibio como parametro 
//			.contains(5) Retorna un boolean 
//			.isEmpty() Retorna un boolean 
		veicles.add(new Veicle("208","Peugeot",5,false,arrList));
		veicles.add(new Veicle("Gol","Volkswagen",3,true,arrList));
		veicles.add(new Veicle("A3","Audi",3,true,arrList));
		veicles.add(new Veicle("Chevy","Chevrolet",5,false,arrList));
		System.out.println("veicles.toString():	\n	"+veicles.toString()); // custom toString()
		hash.add(12);
		hash.add(13);
		hash.add(12);
		hash.add(11);
		hash.add(12);
		System.out.println("hash: "+hash);
		linkhash.add(12);
		linkhash.add(13);
		linkhash.add(12);
		linkhash.add(11);
		linkhash.add(12);
		linkhash.add(24);
		linkhash.add(3);
		System.out.println("linkhash: "+linkhash);
		linkList = new LinkedList<Integer>(linkhash);
		Collections.sort(linkList);
		System.out.println("linkhash to linkList sorted: "+linkList);
		Collections.sort(veicles);
		System.out.println("veicles sorted: "+veicles);
		dictionary.put("Gandalf",10);
		dictionary.put("Aragon",8);
		dictionary.put("Gimili",6);
		dictionary.put("Bilbo",2);
		dictionary.put("Bilbo",3);// si la key se repite, sobreescribe el Value
		dictionary.put("Legolas",9);
		dictionarySorted = new HashMap<String,Integer>(dictionary);
		System.out.println("dictionary: "+dictionary);
		System.out.println("dictionarySorted: "+dictionarySorted);
		
//		for(String warrior: dictionary.keySet()) { // itera key
		for(Map.Entry<String,Integer> warrior: dictionary.entrySet()) {	// itera key & value
			System.out.println(warrior.getKey() + ": " +warrior.getValue());
		}

	}

}
