
public class StringMethods {

	public static void main(String[] args) {
		String str = "hola mundo hola mundo";
		System.out.println(		str);

		System.out.println(		"length: "+str.length());	// 21
		
		String subStr = str.substring(0, 10);
		System.out.println(		"substring: "+subStr);		// "hola mundo"


		System.out.println(  	subStr.equals("hola mundo") ); // true
		System.out.println(  	str.charAt(5)				); // 'm'
		System.out.println(  	str.indexOf("mundo")		); // 5
		System.out.println(  	str.indexOf("mundo")		); // 5
		System.out.println(  	str.indexOf("mundo", 6)		); // 16
		System.out.println(  	str.lastIndexOf("mundo")	); // 16
	}

}
