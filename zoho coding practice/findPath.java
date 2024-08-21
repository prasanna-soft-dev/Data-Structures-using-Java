/*•	Given a matrix NxN, you are initially in the 0, 0 position. The matrix is filled with ones and zeros. 
Value “one” represents the path is available, while “zero” represents the wall. You need to find the can you able 
to reach the (N-1)x(N-1) index in the matrix. You can move only along the right and down directions if there’s “one” available.
•	Input:
•	5 //N value
•	1 0 1 0 0
•	1 1 1 1 1
•	0 0 0 1 0
•	1 0 1 1 1
•	0 1 1 0 1
•	Output:
Yes
 */
public class findPath{
    public static boolean dfs(int mat[][],int path[][],int r,int c){
        int row = mat.length;
        int col =mat[0].length;

        if(r < 0 || r >= row || c < 0 || c >= col || path[r][c] == 1 || mat[r][c] == 0){
            return false;
        }
        path[r][c] = 1;

        if(r == row-1 && c == col-1){
            return true;
        }

        if(dfs(mat, path, r+1, c) || dfs(mat, path, r, c+1)){
            
            return true;
        }
        

        path[r][c] = 0;
        return false;
    }
    public static void main(String[] args) {
        int mat[][] = { {1,0,1,0,0},
                        {1,1,1,1,1},
                        {0,0,0,1,0},
                        {1,0,1,1,0},
                        {0,1,1,0,1}};
        int row = 0;
        int col = 0;

        int path[][] = new int[mat.length][mat[0].length];

        boolean ans = dfs(mat,path,row,col);

        System.out.println(ans);
    }
}
