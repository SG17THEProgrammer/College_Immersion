import java.util.Arrays;

public class Min_Cost_Climbing_Tree {

    public static int mcct(int []arr,int i , int []dp){
        if(i>=arr.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int firstStep = mcct(arr, i+1,dp);
        int secondStep = mcct(arr, i+2,dp);
        return dp[i]=Math.min(firstStep, secondStep)+arr[i];
    }
    public static void main(String[] args) {
     int arr[]={1,100,1,1,1,100,1,1,100,1};
    //  int arr[]={10,15,20};
     int []dp = new int[arr.length];
     Arrays.fill(dp,-1);
     int zerothIndex = mcct(arr, 0,dp);
     int firstIndex = mcct(arr, 1,dp);
     System.out.println(Math.min(zerothIndex, firstIndex));

    }
}   
