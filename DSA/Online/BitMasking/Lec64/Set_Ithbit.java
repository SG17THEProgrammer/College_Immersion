package Online.BitMasking.Lec64;

public class Set_Ithbit {

	
	public static int setbit(int n, int pos) {
		int mask = (1 << pos);
		return n | mask;
		
		
	}
	
	public static void main(String[] args) {

		int n = 86;
		int pos = 3;
		System.out.println(setbit(n, pos));

	}
}
