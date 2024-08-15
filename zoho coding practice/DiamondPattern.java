/*46.Diamond pattern : for given input size -> Here 3
  *
 ***
*****
 ***
  *
 */
public class DiamondPattern{
    public static void main(String[] args) {
        int n = 3;

        //for diamond first half pyramid upwards
    for(int i = 1;i <= n;i++)
    {
        for(int j = n ;j > i;j--)
        {
            System.out.print(" ");
        }
        for(int k = 1 ;k <= (2 * i -1);k++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
        //for diamond second half pyramid downwards

    for(int i = n;i >= 1;i--)
    {
        for(int j = i ;j < n;j++)
        {
            System.out.print(" ");
        }
        for(int k = 1;k <= (2 * i -1);k++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    }
}
