public class TicTacToeApp5 {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    public static void main(String[] args) {
        System.out.println(isValidMove(1, 2)); // example test
    }

    /**
     * Checks if the given row and column are within bounds
     * and if the target cell is empty.
     * Input: row, column
     * Output: true if valid, false otherwise
     */
    static boolean isValidMove(int row, int col) {

        // Check bounds
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // Check if cell is empty
        if (board[row][col] == '-') {
            return true;
        }

        return false;
    }
}