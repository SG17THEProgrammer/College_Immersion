import java.util.Arrays;

public class Valentine_Magic {

    public static int min_diff( int[] boys,int[] girls,int i ,int j){
        if(boys.length ==i){ return 0;}
        if(girls.length ==j){ return 99999999;}
        // boys[i]-girls[j] -- this is difference of candies and chocolates
        int pair = Math.abs(boys[i]-girls[j]) + min_diff(boys, girls, i+1, j+1);
        // min_diff(boys, girls, i+1, j+1); --> ladka/ladki dono alag chahiye kyonki pair ban gya 
        int no_pair = min_diff(boys, girls,i, j+1);
        //yahan pair nhi bna isliye ladki doosri chahiye ladka wohi rahega
        return Math.min(pair, no_pair);

    }
    public static void main(String[] args) {
        int[] boys = {2,11,3};
        int[] girls = {5,7,3,2};
        Arrays.sort(boys);
        Arrays.sort(girls);

        System.out.println(min_diff(boys, girls, 0, 0));
    }
}
