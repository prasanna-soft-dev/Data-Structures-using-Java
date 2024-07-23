class SudokuSolver {
    public static boolean isValidRow(char[][] board, char number, int row) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == number)
                return false;
        }
        return true;
    }

    public static boolean isValidColumn(char[][] board, char number, int column) {
        for (int i = 0; i < 9; i++) {
            if (board[i][column] == number)
                return false;
        }
        return true;
    }

    public static boolean isValidBox(char[][] board, char number, int row, int column) {
        int localRow = row - row % 3;
        int localColumn = column - column % 3;

        for (int i = localRow; i < localRow + 3; i++) {
            for (int j = localColumn; j < localColumn + 3; j++) {
                if (board[i][j] == number)
                    return false;
            }
        }
        return true;
    }

    public static boolean isValidPlacement(char[][] board, char number, int row, int column) {
        return isValidRow(board, number, row) &&
                isValidColumn(board, number, column) &&
                isValidBox(board, number, row, column);
    }

    public boolean solveSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {  // Empty cells are represented by '.'
                    for (int numberToTry = 1; numberToTry <= 9; numberToTry++) {
                        char charToTry = (char) ('0' + numberToTry);
                        if (isValidPlacement(board, charToTry, i, j)) {
                            board[i][j] = charToTry;

                            if (solveSudoku(board)) {
                                return true;
                            } else {
                                board[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        SudokuSolver solver = new SudokuSolver();
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println("Before solving");
        // Print the solved Sudoku board
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        solver.solveSudoku(board);
        System.out.println("After solving");
        // Print the solved Sudoku board
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
