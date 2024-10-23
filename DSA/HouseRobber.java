import java.util.Arrays;

public class HouseRobber {

    public static int simpleRobber(int [] arr , int i ){
        if(i>=arr.length) return 0;
        int rob = arr[i]+simpleRobber(arr, i+2);
        int donot_rob =simpleRobber(arr, i+1);

        return Math.max(rob, donot_rob);
    }

    //piche se bhari hai dp array 
    public static int robberTD(int [] arr , int i , int dp[]){
        if(i>=arr.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int rob = arr[i]+robberTD(arr, i+2,dp);
        int donot_rob =robberTD(arr, i+1,dp);

        return  dp[i] = Math.max(rob, donot_rob);
    } 

    //aage se dp array  bharegi 
    public static int robberTD2(int [] arr , int i , int dp[]){
        if(i<0) return 0;
        if(dp[i]!=-1) return dp[i];
        int rob = arr[i]+robberTD2(arr, i-2,dp);
        int donot_rob =robberTD2(arr, i-1,dp);

        return  dp[i] = Math.max(rob, donot_rob);
    } 


    public static int robberBU(int [] arr){
        if(arr.length==1) return arr[0];
        int dp[] = new int[arr.length];
        dp[0]=arr[0];
        dp[1] = Math.max(arr[0],arr[1]);

        for (int j = 2; j < dp.length; j++) {
            int rob = arr[j]+dp[j-2];
            int donot_rob =dp[j-1];
            dp[j] = Math.max(rob, donot_rob);
        }
        return dp[dp.length-1];

    } 

    public static void main(String[] args) {
        // int arr[] = {5,3,1,7,2};
        int arr[] = {2,7,9,3,1};
        int dp[] = new int[arr.length];
        Arrays.fill(dp,-1);
        // System.out.println(robberTD(arr, 0, dp));
        System.out.println(robberTD2(arr, arr.length-1, dp));
        System.out.println(simpleRobber(arr, 0));
        System.out.println(robberBU(arr));
    }
}
