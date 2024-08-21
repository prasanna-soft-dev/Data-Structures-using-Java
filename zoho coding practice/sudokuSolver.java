//solve sudoku

import java.util.*;
public class sudokuSolver{
    private static final int size = 9;

    //check the row
    public static boolean isValidRow(int board[][],int r,int num){
        for(int i = 0;i < size;i++){
            if(board[r][i] == num){
                return false;
            }
        }
        return true;
    }

    //check the column
    public static boolean  isValidColumn(int board[][],int c,int num){
        for(int i = 0;i < size;i++){
            if(board[i][c] == num)
            {
                return false;
            }
        }
        return true;
    }

    //check if the box is valid
    public static boolean isValidBox(int board[][],int r,int c,int num){
        int localRow = r - r % 3;
        int localCol = c - c % 3;

        for(int i = localRow;i < localRow + 3;i++){
            for(int j = localCol;j < localCol + 3;j++){
                if(board[i][j] == num){
                    return false;
                }
            }
        }
        return true;
    }

    //to check of the cell is valid placement
    public static boolean isValidPlacement(int board[][],int r,int c,int num){
        return isValidRow(board,r,num) &&
                isValidColumn(board,c,num) &&
                isValidBox(board,r,c,num);
    }

    public static boolean  solveBoard(int board[][]){

        //traverse through the board
        for(int r = 0;r < size;r++){
            for(int c = 0;c < size;c++){

                //check if the place is empty before filling with values
                if(board[r][c] == 0)
                {
                    for(int numbers = 1;numbers <= 9;numbers++)
                    {
                        if(isValidPlacement(board,r,c,numbers))
                        {
                            board[r][c] = numbers;
                            if(solveBoard(board))
                            {
                                return true;
                            }
                            else
                            {
                                board[r][c] = 0;
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
        int[][] board = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        solveBoard(board);

        System.out.println(Arrays.deepToString(board));
    }
}
