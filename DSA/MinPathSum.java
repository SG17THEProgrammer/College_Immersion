public class MinPathSum {

    public static int MinPathSum(int arr[][] , int row , int column){
        if(row==arr.length-1 && column==arr[0].length-1) return arr[row][column];
        if(row>=arr.length || column>=arr[0].length) return Integer.MAX_VALUE;
        int right = MinPathSum(arr, row, column+1);
        int down = MinPathSum(arr, row+1, column);
        return Math.min(right, down)+arr[row][column];
    }
    public static void main(String[] args) {
        int arr[][] = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(MinPathSum(arr, 0, 0));
        }
    }
