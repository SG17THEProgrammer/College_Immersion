package Online.BitMasking.Lec64;

public class Odd_even_Using_BitMasking {

	public static void main(String[] args) {

		int n = 89;
		if ((n & 1) == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

	}

}
