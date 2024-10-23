package String;

public class Finding_CB_Numbers {

// Q . Deepak and Gautam are having a discussion on a new type of number that they
// call Coding Blocks Number or CB Number. They use following criteria to define
// a CB Number.

// 0 and 1 are not a CB number.
// 2,3,5,7,11,13,17,19,23,29 are CB numbers.
// Any number not divisible by the numbers in point 2( Given above) are also CB
// numbers.
// Deepak said he loved CB numbers.Hearing it, Gautam throws a challenge to him.

// Gautam will give Deepak a string of digits. Deepak’s task is to find the
// number of CB numbers in the string.

// CB number once detected should not be sub-string or super-string of any other
// CB number.
// Ex- In 4991, both 499 and 991 are CB numbers but you can choose either 499 or
// 991, not both.

// Further, the CB number formed can only be a sub-string of the string.
// Ex - In 481, you can not take 41 as CB number because 41 is not a sub-string
// of 481.

// As there can be multiple solutions, Gautam asks Deepak to find the maximum
// number of CB numbers that can be formed from the given string.

// Deepak has to take class of Launchpad students.Help him by solving Gautam’s challenge.




	public static int PrintSubtring(String str) {
		int count = 0;
		boolean[] visited = new boolean[str.length()];
		for (int len = 1; len <= str.length(); len++) {
			for (int si = 0; si <= str.length() - len; si++) {
				int ei = si + len;
				String s = str.substring(si, ei);// CB Number
				// Integer.parseInt(s);// string to Integer
				// Long.parseLong(s);// String to long
				if (iscbnumber(Long.parseLong(s)) == true && isvistied(visited, si, ei - 1) == false) {
                      // visited marked 
					for (int i = si; i <= ei - 1; i++) {
						visited[i] = true;

					}
					count++;
				}

			}

		}

		return count;

	}

	public static boolean isvistied(boolean[] visited, int si, int ei) {
		for (int i = si; i <= ei; i++) {
			if (visited[i] == true) {
				return true;
			}

		}
		return false;

	}

	public static boolean iscbnumber(long n) {
		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		// point 1
		if (n == 0 || n == 1) {
			return false;
		}
		// point 2

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				return true;
			}
		}

		// point 3
		for (int i = 0; i < arr.length; i++) {
			if (n % arr[i] == 0) {
				return false;
			}
		}

		return true;

	}


	public static void main(String[] args) {
		String str = "816152";
		System.out.println(PrintSubtring(str));

	}

}