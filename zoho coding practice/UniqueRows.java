public class UniqueRows {
    public static void printUniqueRows(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            boolean isUnique = true;

            // Compare the current row with all previous rows
            for (int j = 0; j < i; j++) {
                boolean areRowsEqual = true;

                // Check if current row is equal to the j-th row
                for (int k = 0; k < cols; k++) {
                    if (matrix[i][k] != matrix[j][k]) {
                        areRowsEqual = false;
                        break;
                    }
                }

                // If the current row is found to be equal to a previous row, it's not unique
                if (areRowsEqual) {
                    isUnique = false;
                    break;
                }
            }

            // If the row is unique, print it
            if (isUnique) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {1, 2, 3},
            {4, 5, 6},
            {1, 2, 3},
            {4, 5, 6}
        };

        printUniqueRows(matrix);
    }
}
