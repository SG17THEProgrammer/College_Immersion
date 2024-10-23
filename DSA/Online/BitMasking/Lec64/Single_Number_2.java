package Online.BitMasking.Lec64;

public class Single_Number_2 {

	
	public static void singleNumber(int[] arr) {

		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans = ans ^ arr[i];
		}

		int mask = ans & (~(ans - 1));
		int b = 0;
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] & mask) != 0) {
				b = b ^ arr[i];
			}

		}
		int a = ans ^ b;
		
		System.out.println(a + " " + b);
	}
	
	public static void main(String[] args) {
		// int[] arr = { 2, 3, 4, 5, 3, 4, 2, 7 };
		int[] arr = { 1,2,1,3,2,5};
		singleNumber(arr);

	}
}
