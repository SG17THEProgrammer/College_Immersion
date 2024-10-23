package Online.BitMasking.Lec64;

public class Subsequnce_Using_BitMasking {

	
	public static void Subsequnce(String str) {
		// 2^n -- 1 << str.length()
		// 1<<3 = 1* (2^3)

		// Example
		// 12 << 3 (left shift mtlb multiply)
		// = 12 * (2^3)
		// = 12 * 8
		// = 96

		// 12 >> 3 (right shift mtlb divide)
		// = 12 / (2^3)
		// = 12 / 8
		// = 1

		for (int i = 0; i < 1 << str.length(); i++) {
			print_pattren(i, str);

		}

	}

	private static void print_pattren(int i, String str) {
		int pos = 0;
		while (i != 0) {

			if ((i & 1) != 0) {
				System.out.print(str.charAt(pos));
			}
			pos++;
			i >>= 1;
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		String str = "abc";
		Subsequnce(str);
	
	}

}
