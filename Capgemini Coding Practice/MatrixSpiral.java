/*Problem Statement –

Write the code to traverse a matrix in a spiral format. 

Sample Input 

Input 

5   4

1   2   3   4

5   6   7   8

9   10 11 12

13 14 15 16

17 18 19 20

Output 

1  2  3  4  8  12  16  20  19  18  17  13  9  5  6  7  11  15  12  14 10   */
import java.util.*;
public class MatrixSpiral{
    public static void main(String args[])
    {
        int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
        int n = a.length;        // number of rows
        int m = a[0].length;
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = m-1;
        int dir = 0;

        while( top <=  bottom && left <= right)
        {
            if(dir == 0)
            {
                for(int i = left ;i <= right;i++)
                {
                    System.out.print(a[top][i]+" ");
                }
                top++;
            }
            else if(dir == 1)
            {
                for(int i = top ; i <= bottom;i++)
                {
                    System.out.print(a[i][right]+" ");
                }
                right--;
            }
            else if(dir == 2)
            {
                for(int i = right ;i >= left;i--)
                {
                    System.out.print(a[bottom][i]+" ");
                }
                bottom--;
            }
            else if(dir == 3)
            {
                for(int i = bottom ;i >= top; i--)
                {
                    System.out.print(a[i][left]+" ");
                }
                left++;
            }
            dir = (dir+1)%4;
        }
    }
    
}
