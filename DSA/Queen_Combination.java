public class Queen_Combination {
    // we only need combination (no repetition) ; agar we have combination to uska arrangement mt nikalo  
    public static void Print(boolean[] board , int totalQueen , String ans , int queenPlacedSoFar , int index){ 
        // for combination ek index rakh liya -- hume uske aage se chalana hai
        if(queenPlacedSoFar==totalQueen){
            System.out.println(ans);
            return;
        }
        for (int i = index; i < board.length; i++) {
            if(board[i] == false){
                board[i] = true;//mark that queen baith gya 
                Print(board, totalQueen, ans+"b"+i+"q"+queenPlacedSoFar, queenPlacedSoFar+1 , i+1);
                board[i] = false; // undo kiya operation --- this is backtracking 

            }
        }
    }
    public static void main(String[] args) {
        boolean [] board = new boolean[4];
        int totalQueen=2;
        Print(board,totalQueen,"",0,0);
    }
    
}
