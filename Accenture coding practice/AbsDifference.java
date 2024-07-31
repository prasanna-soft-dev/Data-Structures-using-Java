/*You are given a function,
int findCount(int arr[], int length, int num, int diff);

The function accepts an integer array ‘arr’, its length and two integer variables ‘num’ and ‘diff’. 
Implement this function to find and return the number of elements of ‘arr’ having an absolute 
difference of less than or equal to ‘diff’ with ‘num’.
Note: In case there is no element in ‘arr’ whose absolute difference with ‘num’ is less than or 
equal to ‘diff’, return -1.

Example:
Input:

arr: 12 3 14 56 77 13
num: 13
diff: 2
Output:
3 */
import java.util.*;
class AbsDifference
{
  public static int findCount (int arr[], int length, int num, int diff)
  {
    int count = 0;
    for (int i = 0; i < length; i++)
      {
	if (Math.abs (num - arr[i]) <= diff)
	  count++;
      }
    return count > 0 ? count : -1;
  }
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt ();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++)
      arr[i] = sc.nextInt ();
    int num = sc.nextInt ();
    int diff = sc.nextInt ();

    System.out.println (findCount (arr, n, num, diff));
  }
}