public class Edit_Distance {
// i ==>s  j==> t
    public static int  Min_ops(String s , String t  , int i , int j) {
        if(s.length()==i){return t.length()-j;}
        if(t.length()==j){return s.length()-i;}
        int ans=0;
        if(s.charAt(i)==t.charAt(j)){
            ans = Min_ops(s, t, i+1, j+1); // string ko ek ek  se reduce kr diya  //dp[i-1][j-1]
        }
        else{
            int Delete = Min_ops(s, t, i+1,j);//dp[i-1][j]
            int Insert = Min_ops(s, t,i,j+1);//dp[j][i-1]
            int Replace = Min_ops(s,t,i+1,j+1);//dp[i-1][j-1]
            ans=Math.min(Insert , Math.min(Delete,Replace))+1;
       }
return ans;
    }

    public static void main(String[] args) {
            String s="FOOD";
            String t ="MONEY";
            System.out.println(Min_ops(s, t, 0, 0));
    }

}
