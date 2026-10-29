class Solution {
    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }

    boolean helper(char[][] board, int row, int col) {

        // all cell filled
        if(row == 9) {
            return true;
        }

        // Next cell
        int nextRow = row;
        int nextCol = col + 1;

        if(nextCol == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        // if cell already filled
        if(board[row][col] != '.') {
            return helper(board, nextRow, nextCol);
        }

        // try  1 to 9
        for(char digit = '1'; digit <= '9'; digit++) {

            if(isSafe(board, row, col, digit)) {

                // place Digit  
                board[row][col] = digit;

                // solve Next cell  
                if(helper(board, nextRow, nextCol)) {
                    return true;
                }

                // if solution not find -> backtrack
                board[row][col] = '.';
            }
        }

        return false;
    }

    static boolean isSafe(char[][] board, int row, int col, char digit) {

        // Row check
        for(int j = 0; j < 9; j++) {
            if(board[row][j] == digit) {
                return false;
            }
        }

        // Column check
        for(int i = 0; i < 9; i++) {
            if(board[i][col] == digit) {
                return false;
            }
        }

        // 3 x 3 box check
        int srow = (row / 3) * 3;
        int scol = (col / 3) * 3;

        for(int i = srow; i <= srow + 2; i++) {
            for(int j = scol; j <= scol + 2; j++) {

                if(board[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }
}