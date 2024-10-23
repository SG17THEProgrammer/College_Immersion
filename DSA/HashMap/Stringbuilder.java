package HashMap;

public class Stringbuilder {

	//Stringbuilder ek in-built class hai ; class hai toh heap mein bna hoga 
	//new capacity = (old capacity)*2+2 

	//String se better hota hai as string is immutable and StringBuilder is mutable  (internally implements array )

	//StringBuffer -- thread safe ; synchornize ; one by one kaam hoga  
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Hello");
		sb.append("Bye");
		sb.append("HelloBye");
		sb.append(1);
		System.out.println(sb.length());
		System.out.println(sb.capacity()); // isme 16 aaayega ; array list mein 10 hota hai  
		System.out.println(sb);
		System.out.println(sb.delete(0, 3));//0-2 uda dega 
		System.out.println(sb);
		String s = sb.toString();
		System.out.println(sb.substring(4));
		System.out.println(sb.substring(4,7));
		///System.out.println(sb.reverse());
		System.out.println(sb);

	}

}
