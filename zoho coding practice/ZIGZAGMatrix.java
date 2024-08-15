/*5. Given a matrix of 2D array of n rows and m coloumns. 
Print this matrix in ZIG-ZAG fashion as shown in figure. */

import java.util.Arrays;
public class ZIGZAGMatrix{
    public static int[] zz(int mat[][])
    {
        int row = mat.length;
        int col = mat[0].length;
        if(row == 0 || col == 0) return new int[]{};

        int ans[] = new int[row * col];
        int r = 0;
        int c = 0;
        int i = 0;
        boolean up = true;

        while( r < row && c < col)
        {
            if(up)
            {
                while(r > 0 && c < col - 1)
                {
                    ans[i++] = mat[r][c];
                    r--;
                    c++;
                }
                ans[i++] = mat[r][c];
                if(c == col - 1)
                {
                    r++;
                }
                else{
                    c++;
                }
            }
            else{
                while(c > 0 && r < row - 1)
                {
                    ans[i++] = mat[r][c];
                    r++;
                    c--;
                }
                ans[i++] = mat[r][c];
                if(r == row - 1)
                {
                    c++;
                }
                else{
                    r++;
                }
                
            }
            up = !up;
        }
        return ans;
    }
    public static void main(String args[])
    {
        int mat[][] ={{1,2,3},
                    {4,5,6},
                    {7,8,9}};
        int res[] = zz(mat);

        System.out.println(Arrays.toString(res));
    }
}
