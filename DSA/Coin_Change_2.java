// Simple recursion se 
// public class Coin_Change_2 {

//     public static int Coin_Change_2 (int []coin , int amt,int i){
//         if(amt==0) return 1;
//         if(coin.length==1) return 0;

//         int inc=0,exc=0;
//         if(amt>=coin[i]){
//             inc = Coin_Change_2(coin, amt-coin[i], i)
//         }
//         exc = Coin_Change_2(coin, amt,i+1);
//         return inc + exc;
//     }
//     public static void main(String[] args) {
//         int amt = 5 ;
//         int coins []={1,2,3};
//         System.out.println(Coin_Change_2(coins, amt, 0));
//     }
// }



// by dp (top down approach)

// import java.util.Arrays;

// public class Coin_Change_2 {

//     public static int Coin_Change_2 (int []coin , int amt,int i , int [][]dp){
//         if(amt==0) return 1;
//         if(coin.length==1) return 0;

//         if(dp[i][amt]!=-1) return dp[i][amt];

//         int inc=0,exc=0;
//         if(amt>=coin[i]){
//             inc = Coin_Change_2(coin, amt-coin[i], i,dp);
//         }
//         exc = Coin_Change_2(coin, amt,i+1,dp);
//         return dp[i][amt] = inc + exc;
//     }
//     public static void main(String[] args) {
//         int amt = 5 ;
//         int coins []={1,2,3};
//         int [][] dp = new int [coins.length][amt+1];
//         for(int []a :dp){
//             Arrays.fill(a,-1);
//         }
//         System.out.println(Coin_Change_2(coins, amt, 0,dp));
//     }
// }


//BU approach
public class Coin_Change_2 {

    public static int Coin_Change_2(int[] coins, int amt) {
        int[][] dp = new int[coins.length + 1][amt + 1];
        
        for (int i = 0; i <= coins.length; i++) {
            dp[i][0] = 1;
        }
        
            for (int i = 1; i <= coins.length; i++) {
            for (int amount = 1; amount <= amt; amount++) {
                int inc = 0, exc = 0;
                if (amount >= coins[i - 1]) {
                    inc = dp[i][amount - coins[i - 1]];
                }
                exc = dp[i - 1][amount];
                dp[i][amount] = inc + exc;
            }
        }
        
        return dp[coins.length][amt];
    }

    public static void main(String[] args) {
        int amt = 5;
        int coins[] = {1, 2, 3};
        System.out.println(Coin_Change_2(coins, amt));
    }
}
