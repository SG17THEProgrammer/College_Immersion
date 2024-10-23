public class PascalTriangle {


 public static void main(String[] args) {
        int n =6 ; 
        int row = 0;
        int star=1; 
        while(row<n){
            int i=0;
            int val=1;
            while (i<star) {

                // nC(r+1) = ((n-r)/r+1) * nCr
                        // = ((row-i)/(i+1))*val
                        
                // n is row r is i 
                System.out.print(val+" ");
                val = ((row-i)*val)/(i+1);
                // System.out.print("* ");
                i++;
            }
            row++;
            star++;
            System.out.println();
        }
 }   
}
