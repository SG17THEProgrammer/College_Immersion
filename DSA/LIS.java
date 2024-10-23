import java.util.Arrays;

public class LIS {

    public static int  LIS(int arr[]){
        int []lis = new int[arr.length];
        Arrays.fill(lis,1);
        for (int i = 1; i < lis.length; i++) {
            for (int j = i-1; j >= 0; j--) {
                if(arr[j]<arr[i]){
                    int jIndexTkKaLIS = lis[j];
                    lis[i]=Math.max(lis[i], jIndexTkKaLIS+1);
                }
            }
        }
        int max=lis[0];
        for (int i = 0; i < lis.length; i++) {
            max=Math.max(max,lis[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        int [] arr = {10,9,2,5,3,7,101,18};
        System.out.println(LIS(arr));

    }
}
