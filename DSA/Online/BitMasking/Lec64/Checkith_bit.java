package Online.BitMasking.Lec64;

public class Checkith_bit {

	
	public static boolean isset(int n, int pos) {
		
		n = n >> pos;
		if ((n & 1) == 0) {
			return false;
		} else {
			return true;
		}

	}
	public static void main(String[] args) {
		// int n = 86;
		// int pos = 0;
		int n = 75;
		int pos = 3;
		System.out.println(isset(n, pos));
	
	}

}
