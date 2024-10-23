package String;

public class Wrapper_Demo {

	public static void main(String[] args) {

		Integer a = 100;//yeh heap mein store hota hai 
		int a1 = 10; //yeh stack mein store hota hai
		System.out.println(a);
		System.out.println(a1);
		Short s1 = 78;// Class
		// Byte b1 = 19;// Class
		System.out.println(s1);
		// System.out.println(b1);

		// autoboxing -- jab ek primitive data ko non primitive mein rakhte hai uske corresponding waale mein 
		// unboxing -- jab ek non primitive data ko  primitive mein rakhte hai uske corresponding waale mein 


		a = a1;// int---> Integer AutoBoxing  (heap mein a ki jagah a1 aa jaayega with a1 ki value  )
		System.out.println(a);

		Integer c = 100;
		int c3 = 10;
		c3 = c;// Integer --> int unboxing(non primitive ko primitive mein store)
		System.out.println(c3);

		// Important
		Integer b1 = 19;// -128 to 127 (cache ka range ) -- also no duplicate values comes in cache 
		Integer b2 = 19;
		System.out.println(b1 == b2);// adresss

		Integer c1 = 190;// 2k
		Integer c2 = 190;// 4k
		System.out.println(c1 == c2);

		Byte bb = 12;
		Byte bb1 = 12;
		System.out.println(bb == bb1);


		Long l1 = 128l;
		Long l2 = 128l;
		System.out.println(l1 == l2);

	}

}