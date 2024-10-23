class Queen_Permutation{

    public static void Print(boolean[] board , int totalQueen , String ans , int queenPlacesSoFar){
        if(queenPlacesSoFar==totalQueen){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if(board[i] == false){
                board[i] = true;
                Print(board, totalQueen, ans+"b"+i+"q"+queenPlacesSoFar, queenPlacesSoFar+1);
                board[i] = false; // undo kiya operation --- this is backtracking 

            }
        }
    }
    public static void main(String[] args) {
        boolean [] board = new boolean[4];
        int totalQueen=2;
        Print(board,totalQueen,"",0);
    }
}