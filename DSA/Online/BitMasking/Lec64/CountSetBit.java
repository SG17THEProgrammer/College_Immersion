package Online.BitMasking.Lec64;

public class CountSetBit {
	
	public static int CountSet(int n) {
		
		int count = 0;
		while (n != 0) {
			if ((n & 1) != 0) {
				count++;
			}
			n >>= 1;// n= n>> 1;
		}
		return count;

	}

	public static int FastCountSet(int n) {
		//jitni set bit hai utni baar hi loop chalega 
		int count = 0;
		while (n != 0) {
			
			count++;
			n = n & (n - 1);
		}
		return count;
		
	}
	public static void main(String[] args) {
		// int n = 119;
		// int n = 75;
		int n=5;
		System.out.println(CountSet(n));
		System.out.println(FastCountSet(n));

	}

}
