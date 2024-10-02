public class D_N_Queens {

    public static boolean isSafe(char board[][], int row, int col) {
        // Vertical Up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diag left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // diag rigt up
        for(int i=row-1,j=col+1; i>=0 && j<board.length; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public static void nQueens(char board[][], int row) {
        // BASE CASE
        if (row == board.length) {
            printBoard(board);
            return;
        }

        // nQueens applying loop on a Column
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1); // Function call
                board[row][j] = 'X'; // Backtracking step
            }

        }
    }

    public static void printBoard(char board[][]) {
        System.out.println("--------CHESS BOARD-------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n = 5;
        char board[][] = new char[n][n];

        // Initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        nQueens(board, 0);
    }
}
