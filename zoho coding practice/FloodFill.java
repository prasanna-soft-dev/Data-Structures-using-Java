/*. In MS-Paint, when we take the brush to a pixel and click, the color of the region of that pixel is replaced with a 
new selected color. Following is the problem statement to do this task.
Given a 2D screen, location of a pixel in the screen and a color, replace color of the given pixel and all adjacent 
same colored pixels with the given color.
 */
import java.util.*;
public class FloodFill{
    public static void dfs(int screen[][],int x,int y,int newColor,int oldColor)
    {
        if(x < 0 || x >= screen.length || y < 0 || y >= screen[0].length || screen[x][y] != oldColor)
        {
            return;
        }
        screen[x][y] = newColor;

        dfs(screen, x + 1, y, newColor,oldColor);
        dfs(screen, x - 1, y, newColor,oldColor);
        dfs(screen, x, y + 1, newColor,oldColor);
        dfs(screen, x, y - 1, newColor,oldColor);
    }
    public static void fill(int screen[][],int x,int y,int newColor)
    {
        int oldColor = screen[x][y];
        if(oldColor == newColor){
            return;
        }

        dfs(screen,x,y,newColor,oldColor);
    }
    public static void main(String[] args) {
        int screen[][] = {{1, 1, 1, 1, 1, 1, 1, 1},
                            {1, 1, 1, 1, 1, 1, 0, 0},
                            {1, 0, 0, 1, 1, 0, 1, 1},
                            {1, 2, 2, 2, 2, 0, 1, 0},
                            {1, 1, 1, 2, 2, 0, 1, 0},
                            {1, 1, 1, 2, 2, 2, 2, 0},
                            {1, 1, 1, 1, 1, 2, 1, 1},
                            {1, 1, 1, 1, 1, 2, 2, 1}
                            };
        int x = 4;
        int y = 4;

        int newColor = 3;

        fill(screen, x,y,newColor);

        System.out.println(Arrays.deepToString(screen));

    }
}
