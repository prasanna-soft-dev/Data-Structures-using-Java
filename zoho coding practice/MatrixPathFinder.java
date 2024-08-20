/*
 * 4. NxN matrix will be provided. 0->block, 1->Not a block
Always starting point is (0,0), Ending point is (N-1,N-1).
You have to go from starting point to ending point. One valid solution is enough.
Example:

 
   Input:
   N=4 
   1 1 0 0
   1 0 0 1
   1 1 1 1
   0 0 0 1
   Output:
   _ 1 0 0
   _ 0 0 1
   _ _ _ _
   0 0 0 _

 */
public class MatrixPathFinder{
    //there only two possible direction one is right,down
    //starting point is always {0,0}
    //one solution is enough
    public static boolean  dfs(int [][]mat,int path[][],int r,int c){
        int row = mat.length;
        int col = mat[0].length;
        if(r < 0 ||  r >= row || c < 0 || c >= col || mat[r][c] == 0 || path[r][c] == 1)//check the boundary to  make sure to stay inside the matrix
            {
                return false;
            }
            path[r][c] = 1;
            if(r == row - 1 && c == col - 1){
                return true;
            }
            if(dfs(mat, path, r, c+1)){
                return true;
            }
            if(dfs(mat, path, r+1, c)){
                return true;
            }
        path[r][c] = 0;
        return false;
    }
    public static void main(String[] args) {
        int mat[][] = { {1,1,0,0},
                        {1,0,0,1},
                        {1,1,1,1},
                        {0,0,0,1} };
        int row = mat.length;
        int col = mat[0].length;
        int path[][]= new int[row][col];
        if(dfs(mat,path,0,0)){
            for(int i = 0;i < row;i++){
                for(int j = 0;j < col;j++){
                    if(path[i][j] == 1){
                        System.out.print("_ ");
                    }
                    else{
                        System.out.print(mat[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
        else{
            System.out.println("no path found");
        }
    }
}
/*import java.util.*;

public class AllMatrixPaths {
    // Function to find all paths using DFS and backtracking
    public static void findAllPaths(int[][] mat, int r, int c, List<String> path, List<List<String>> allPaths) {
        int row = mat.length;
        int col = mat[0].length;

        // Check boundary conditions and validity of the path
        if (r < 0 || r >= row || c < 0 || c >= col || mat[r][c] == 0) {
            return;
        }

        // Add the current cell to the path
        path.add("(" + r + "," + c + ")");

        // If we have reached the bottom-right corner, add the path to allPaths
        if (r == row - 1 && c == col - 1) {
            allPaths.add(new ArrayList<>(path));
        } else {
            // Explore further: move right and down
            findAllPaths(mat, r, c + 1, path, allPaths);
            findAllPaths(mat, r + 1, c, path, allPaths);
        }

        // Backtrack: remove the current cell from the path
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        int mat[][] = {
            {1, 1, 0, 0},
            {1, 0, 0, 1},
            {1, 1, 1, 1},
            {0, 0, 0, 1}
        };

        List<List<String>> allPaths = new ArrayList<>();
        List<String> path = new ArrayList<>();

        // Start the DFS from the top-left corner (0, 0)
        findAllPaths(mat, 0, 0, path, allPaths);

        // Print all found paths
        for (List<String> p : allPaths) {
            System.out.println(p);
        }
    }
}
 */
