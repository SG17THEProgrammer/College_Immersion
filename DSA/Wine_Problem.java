public class Wine_Problem {

    // public static int max_profit(int []wine , int si , int ei , int year){
    //     if(si>ei){
    //         return 0;
    //     }
    //     int fs = wine[si]*year + max_profit(wine, si+1, ei, year+1);
    //     int ls = wine [ei]*year + max_profit(wine,si,ei-1,year+1);
    //     return Math.max(fs, ls);
    // }

    public static int max_profitBU(int []wine){
        int [][] dp = new int[wine.length][wine.length];
        int yr = wine.length;
        for (int i = 0; i < dp.length; i++) {
            dp[i][i]=wine[i]*yr;
        }
        yr--;
        for (int gap = 1; gap < dp.length; gap++) {
            for (int j =gap; j < dp.length; j++) {
                int i=j-gap;

                int fs = wine[i]*yr +dp[i-1][j];
                int ls = wine[j]*yr +dp[i][j-1];
                dp[i][j] = Math.max(fs, ls);
            }
            yr--;
        }
        return dp[0][dp[0].length-1];
    }
    public static void main(String[] args) {
        int []wine = {2,3,5,1,4};
        // System.out.println(max_profit(wine, 0, wine.length-1, 1));
        System.out.println(max_profitBU(wine));
    }
}
