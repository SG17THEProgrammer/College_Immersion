package Array;

public class RotateArray {

    public static void RotateArr(int []arr , int k ){
        int n = arr.length;
        k= k%n; 

        for (int j = 0; j <k; j++) { // for k rotations

            //itna code is for 1 rotation
            int temp = arr[n-1];  //array ka last banda temp mein daal diya 
            for (int i = n-2; i>=0; i--) {
                arr[i+1]=arr[i];
            }
            arr[0] = temp ;
            
        }

    }
        public static void main(String[] args) {
                int k =3 ; 
                int arr[] ={1,2,3,4,5,6,7};
                RotateArr(arr, k);
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i]+" ");
                }
        }
}
