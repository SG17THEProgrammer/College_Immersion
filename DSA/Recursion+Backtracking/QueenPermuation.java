public class QueenPermuation {
	// qpsf --- queen placed so far
	public static void Permuation(boolean[] board, int totalQueen, String ans, int qpsf) {
		if (qpsf == totalQueen) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;
				Permuation(board, totalQueen, ans + "b" + i + "q" + qpsf, qpsf + 1);
				board[i] = false;// UNDO
			}

		}

	}
	public static void main(String[] args) {
		int n = 4;	//4 boxes hai 
		boolean[] board = new boolean[n];
		int totalQueen = 2;
		Permuation(board, totalQueen, "", 0);
	
	}
}
