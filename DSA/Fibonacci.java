public class Fibonacci {

    public static int simpleFibonacci(int n){
        if(n==0 || n==1) return n;
        int f1 = simpleFibonacci(n-1);
        int f2 = simpleFibonacci(n-2);
        return f1 + f2;
    }

    public static int fibonacciTD(int n ,int []dp){
        if(n==0 || n==1) return n;
        if(dp[n]!=0) return dp[n];
        int f1 = fibonacciTD(n-1,dp);
        int f2 = fibonacciTD(n-2,dp);
        return dp[n]=f1 + f2;
    }

    //table banti hai 
    public static int fibBU(int n ){
        int [] dp = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[dp.length-1];

    }

    public static void main(String[] args) {
        int n=10;
        int []dp = new int[n+1];
        System.out.println(fibonacciTD(n, dp));
        System.out.println(fibBU(n));
        System.out.println(simpleFibonacci(n));
    }
}
