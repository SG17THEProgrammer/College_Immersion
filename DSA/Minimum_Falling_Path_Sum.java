import java.util.Arrays;

public class Minimum_Falling_Path_Sum {

    public static int Falling_Path_Sum(int arr[][] , int currentRow, int currentCol){
        //column khtm ho jaaye toh 
        if(currentCol<0 || currentCol>=arr[0].length) return Integer.MAX_VALUE;
        //last row hai toh 
        if(currentRow==arr.length-1) return arr[currentRow][currentCol];
        // 3 choices 
        int diagonalLeft = Falling_Path_Sum(arr, currentRow+1, currentCol-1);
        int down = Falling_Path_Sum(arr, currentRow+1, currentCol);
        int diagonalRight = Falling_Path_Sum(arr, currentRow+1, currentCol+1);

        return  Math.min(diagonalLeft,Math.min(diagonalRight,down)) + arr[currentRow][currentCol];
    }

    public static int Falling_Path_SumTD(int arr[][] , int currentRow, int currentCol,int [][]dp){
        //column khtm ho jaaye toh 
        if(currentCol<0 || currentCol>=arr[0].length) return Integer.MAX_VALUE;
        //last row hai toh 
        if(currentRow==arr.length-1) return arr[currentRow][currentCol];

        if(dp[currentRow][currentCol]!=-10000000) return dp[currentRow][currentCol];
        // 3 choices 
        int diagonalLeft = Falling_Path_SumTD(arr, currentRow+1, currentCol-1,dp);
        int down = Falling_Path_SumTD(arr, currentRow+1, currentCol,dp);
        int diagonalRight = Falling_Path_SumTD(arr, currentRow+1, currentCol+1,dp);

        return  dp[currentRow][currentCol] = Math.min(diagonalLeft,Math.min(diagonalRight,down)) + arr[currentRow][currentCol];
    }


    public static void main(String[] args) {
        int arr[][] = {{2,1,3},{6,5,4},{7,8,9}};
        int dp [][] = new int [arr.length][arr[0].length];
        for (int[] a : dp) {
            Arrays.fill(a,-10000000);   
        }
        // int ans=Integer.MAX_VALUE;
        // for (int i = 0; i < arr[0].length; i++) {
        //     ans = Math.min(ans,Falling_Path_Sum(arr,0, i,dp));
        // }
        // System.out.println(ans);
        
        int ans=Integer.MAX_VALUE;
        for (int i = 0; i < arr[0].length; i++) {
            ans = Math.min(ans,Falling_Path_SumTD(arr,0, i,dp));
        }
        System.out.println(ans);

    }
}
