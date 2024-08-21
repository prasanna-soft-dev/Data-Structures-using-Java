/*. 18. -1 represents ocean and 1 represents land find the number of islands in the given matrix.



Input:   n*n matrix
       1 -1 -1  1
      -1  1 -1  1
      -1 -1  1 -1
      -1 -1 -1  1
Output: 2 (two islands that I have 
bold in matrix at 1, 1 and 2, 2)
 */
import java.util.*;
public class islandCount{
    public static int[] directions[] = {  {0,1},
                                    {1,0},
                                    {0,-1},
                                    {-1,0}};

    public static void bfs(int grid[][],int r,int c,int row,int col){
        Queue<int []> q = new LinkedList<>();
        q.add(new int[]{r,c});

        grid[r][c] = -1;//marking the visted cell 

        while(!q.isEmpty()){
            int current[] = q.poll();
            int cr = current[0];
            int cc = current[1];

            for(int dir[] : directions){
                int newRow = cr + dir[0];
                int newCol = cc + dir[1];

                if(newRow >= 0 && newRow < row && newCol >= 0 && newCol < col && grid[newRow][newCol] == 1){
                    q.add(new int[]{newRow,newCol});
                    grid[newRow][newCol] = -1;
                }
            }
        }
    }
    public static void main(String[] args) {
        int grid[][] = {{1,-1,-1,1},
                        {-1,1,-1,1},
                        {-1,-1,1,-1},
                        {-1,-1,-1,1}};

        int row = grid.length;
        int col = grid[0].length;

        int islands = 0;
        for(int r = 0;r < row;r++){
            for(int c = 0;c < col;c++){
                
                if(grid[r][c] == 1){
                    bfs(grid,r,c,row,col);
                    islands++;
                }
            }
        }
        System.out.println(islands);
    }
}
