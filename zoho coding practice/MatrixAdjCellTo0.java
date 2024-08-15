/*2.Given a Boolean matrix mat[M][N] of size M X N, modify it such that if a matrix cell mat[i][j] is 1 then make its adjacent cells as 0.*/
import java.util.*;

public class MatrixAdjCellTo0{

    public static void setAdjacentZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        
        // List to store positions of '1's
        List<int[]> onesPositions = new ArrayList<>();
        
        // Step 1: Find all positions of '1's
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                if (matrix[r][c] == 1) {
                    onesPositions.add(new int[]{r, c});
                }
            }
        }
        
        // Step 2: Set adjacent cells to 0
        for (int[] pos : onesPositions) {
            int r = pos[0];
            int c = pos[1];
            
            //if wee need the change the original position rather than only the adjacent cell
             matrix[r][c] = 0;
            // Set adjacent cells to 0 if within bounds
            if (r > 0) matrix[r-1][c] = 0;         // Up
            if (r < row - 1) matrix[r+1][c] = 0;    // Down
            if (c > 0) matrix[r][c-1] = 0;         // Left
            if (c < col - 1) matrix[r][c+1] = 0;    // Right
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };
        setAdjacentZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}

