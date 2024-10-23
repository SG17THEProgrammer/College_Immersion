import java.util.Arrays;

public class Distint_Subsequences {

    // s-->coin t==>amount i==>s j==>t
    // same as coin change
    public static int disSub(String s, String t, int i, int j) {
        if (t.length() == j)
            return 1;
        if (s.length() == i)
            return 0;
        int inc = 0, exc = 0;
        if (s.charAt(i) == t.charAt(j)) {
            inc = disSub(s, t, i + 1, j + 1);

        }
        exc = disSub(s, t, i + 1, j); // coin change amount remains same
        return inc + exc;
    }

    public static int disSubTD(String s, String t, int i, int j, int[][] dp) {
        if (t.length() == j)
            return 1;
        if (s.length() == i)
            return 0;
        if (dp[i][j] != -1)
            return dp[i][j];
        int inc = 0, exc = 0;
        if (s.charAt(i) == t.charAt(j)) {
            inc = disSubTD(s, t, i + 1, j + 1, dp);

        }
        exc = disSubTD(s, t, i + 1, j, dp); // coin change amount remains same
        return dp[i][j] = inc + exc;
    }

    public static void main(String[] args) {
        // String s = "rabbbit";
        // String t = "rabbit";
        String s = "babgbag";
        String t = "bag";
        int[][] dp = new int[s.length() + 1][t.length() + 1];
        for (int[] a : dp) {
            Arrays.fill(a, -1);
        }
        System.out.println(disSub(s, t, 0, 0));
        System.out.println(disSubTD(s, t, 0, 0, dp));
    }
}
