import java.util.Arrays;

public class LCS {

    public static int normalLCS(String s1 , String s2,int i , int j) {
        if(i==s1.length() || j==s2.length()) return 0;
        int ans=0;
            if(s1.charAt(i)==s2.charAt(j)){
                ans=1+normalLCS(s1, s2, i+1, j+1);
            }
            else{
                int f = normalLCS(s1, s2, i+1, j);
                int s = normalLCS(s1, s2, i, j+1);
                ans=Math.max(f,s);
            }
            return ans;

    }

    public static int lcsTD(String s1 , String s2 , int i , int j , int dp[][] ){
        if(i==s1.length() || j==s2.length()) return 0;
        if(dp[i][j]!=-1) return dp[i][j];

            int ans=0;
            if(s1.charAt(i)==s2.charAt(j)){
                ans=1+lcsTD(s1, s2, i+1, j+1,dp);

            }
            else{
                int f = lcsTD(s1, s2, i+1, j,dp);
                int s = lcsTD(s1, s2, i, j+1,dp);
                ans=Math.max(f,s);
            }
            return dp[i][j]=ans;
    }

        //table bharenge
    public static int lcsBU(String s1 , String s2){
        int [] [] dp = new int [s1.length()+1][s2.length()+1]; //ek extra length ki banayi hai as we have to work for blank string as well
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int ans=0;
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    ans=1+dp[i-1][j-1]; //diagonal wala block ==> dp[i-1][j-1]
    
                }
                else{
                    int f =dp[i-1][j];
                    int s =dp[i][j-1];
                    ans=Math.max(f,s);
                }
                dp[i][j]=ans;
            }
            
        }
    return dp[dp.length-1][dp[0].length-1];
    }

        
    public static void main(String[] args) {
        String s1="abcde";
        String s2="ace";
        int dp[][] = new int[s1.length()][s2.length()];
        for (int[] a : dp) {
            Arrays.fill(a, -1);
            
        }
        System.out.println(normalLCS(s1, s2, 0, 0));
        System.out.println(lcsTD(s1, s2, 0, 0,dp));
        System.out.println(lcsBU(s1,s2));
    }
}
