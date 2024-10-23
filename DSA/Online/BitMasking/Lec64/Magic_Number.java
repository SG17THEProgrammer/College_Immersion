package Online.BitMasking.Lec64;

public class Magic_Number {

	
	public static int Number(int n) {
		int ans = 0;
		int mul = 5;
		while (n != 0) {

			// if ((n & 1) != 0) {
			// 	ans = ans + mul;
			// }
					// OR
			int rem = n%2;
			ans = ans + rem*mul;



			mul = mul * 5;
			n >>= 1;
			
		}
		return ans;
		
	}
	
	public static void main(String[] args) {
		int n = 6;
		System.out.println(Number(n));

	}
}
