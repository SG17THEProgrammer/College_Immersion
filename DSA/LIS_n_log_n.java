public class LIS_n_log_n {

    public static int LIS(int [] arr){
        int [] lis = new int[arr.length];
        lis[0] = arr[0]; // pahle no. ka lis 1 length ka hoga wo bhi khud hi 
        int len=1;
        for (int i =1; i < arr.length; i++) {
                if(arr[i]>lis[len-1]){
                    lis[len] = arr[i];
                    len++;
                }
                else{
                    // arr[i] se jo bhi no. aa rha usse 1st greatest no ko replace krna hai in lis array 
                    int idx = BinarySearch(lis,0,len-1,arr[i]);
                    lis[idx] = arr[i];
                }
        }
return len;
    } 


    public static int BinarySearch(int[]lis,int si,int ei , int currVal ){
        int idx =0 ;
        while(si<=ei){
            int mid = (si+ei)/2;
            if(lis[mid]>=currVal){
                idx = mid;
                ei = mid-1;
            }
            else{
si = mid+1;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int[] arr = { 0, 8, 4, 2, 12, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };
		System.out.println(LIS(arr));
    }
}
