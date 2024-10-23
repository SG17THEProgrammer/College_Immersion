import java.util.Arrays;

public class Minimum_Falling_Path_Sum2 {

    public static int Falling_Path_SumTD2(int arr[][] , int currentRow, int currentCol,int [][]dp){

        if(currentRow==arr.length-1) return arr[currentRow][currentCol];
        if(dp[currentRow][currentCol]!=-10000000) return dp[currentRow][currentCol];
        int ans=Integer.MAX_VALUE;
        for (int i = 0; i <arr[0].length; i++) {

            //same column pr call na lage
            if(currentCol!=i){

                ans = Math.min(ans,Falling_Path_SumTD2(arr, currentRow+1,i, dp));
            }
        }
        return dp[currentRow][currentCol] = ans + arr[currentRow][currentCol];
    }

    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int dp [][] = new int [arr.length][arr[0].length];
        for (int[] a : dp) {
            Arrays.fill(a,-10000000);   
        }
        int ans=Integer.MAX_VALUE;
        for (int i = 0; i < arr[0].length; i++) {
            ans = Math.min(ans,Falling_Path_SumTD2(arr,0, i,dp));
        }
        System.out.println(ans);
    }
}
