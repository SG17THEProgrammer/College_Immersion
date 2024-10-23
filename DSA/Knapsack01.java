import java.util.Arrays;

public class Knapsack01 {

    public static int knapsack(int wt[] ,int [] val , int capacity , int i  ){
        if(i==wt.length || capacity==0) return 0;
        int inc=0,exc=0;
        if(capacity>=wt[i]){
            inc=val[i]+knapsack(wt, val, capacity-wt[i], i+1);
        }
        exc = knapsack(wt, val, capacity, i+1);
        return Math.max(inc, exc);
    } 


    public static int knapsackTD(int wt[] ,int [] val , int capacity , int i ,int[][]dp ){
        if(i==wt.length || capacity==0) return 0;
        if(dp[i][capacity]!=-1) return dp[i][capacity];
                int inc=0,exc=0;
        
        if(capacity>=wt[i]){
            inc=val[i]+knapsackTD(wt, val, capacity-wt[i], i+1,dp);
        }
        exc = knapsackTD(wt, val, capacity, i+1,dp);
        return dp[i][capacity] = Math.max(inc, exc);
    } 
    public static void main(String[] args) {
        int []wt = {1,2,3,2,2};
        int []val = {8,4,0,5,3};
        int capacity=4;
        int [][] dp = new int[wt.length+1][val.length+1];
        for (int[] a : dp) {
            Arrays.fill(a,-1);
        }
        System.out.println(knapsack(wt, val, capacity, 0));
        System.out.println(knapsackTD(wt, val, capacity, 0,dp));

    }

}
