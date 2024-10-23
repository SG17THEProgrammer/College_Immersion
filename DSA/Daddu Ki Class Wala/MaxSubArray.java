public class MaxSubArray {

    static int msa(int [] arr , int k ){
        int max=0;
        int windowSum = 0;
        int start=0;
        for( int i=0; i<arr.length; i++){
            windowSum += arr[i];
            if(i>=k-1){
                max = Math.max(max,windowSum);
                windowSum -=arr[start++];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6};
        System.out.println(msa(arr,3));
    }
    
}
