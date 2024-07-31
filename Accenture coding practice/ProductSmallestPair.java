/*def ProductSmallestPair(sum, arr)

The function accepts an integers sum and an integer array arr of size n.
 Implement the function to find the pair, (arr[j], arr[k]) where j!=k, Such that arr[j] and arr[k] 
 are the least two elements of array (arr[j] + arr[k] <= sum) and return the product of element of this pair

NOTE

Return -1 if array is empty or if n<2
Return 0, if no such pairs found
All computed values lie within integer range
Example

Input

sum:9

size of Arr = 7

Arr:5 2 4 3 9 7 1

Output

2

Explanation

Pair of least two element is (2, 1) 2 + 1 = 3 < 9, Product of (2, 1) 2*1 = 2. Thus, output is 2 
Sample Input

sum:4

size of Arr = 6

Arr:9 8 3 -7 3 9

Sample Output

-21*/
import java.util.*;
public class ProductSmallestPair{
    public static int pair(int arr[],int size, int sum)
    {
        for(int j = 0 ; j < size;j++)
         {
            for(int k = 0;k < size;k++)
            {
                if(j != k)
                {
                    int curSum = arr[j] + arr[k];
                    if(curSum < sum)
                    {
                        return arr[j] * arr[k];
                    }
                }
            }
         }
         return 0;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
         int sum = sc.nextInt();

         int size = sc.nextInt();
         if(size <  2)
         {
            System.out.println(-1);
         }
         int arr[] = new int[size];
         for(int i =0 ;i < size;i++)
         {
            arr[i] = sc.nextInt();
         }
         Arrays.sort(arr);
         int ans = pair(arr, size, sum);
         System.out.println(ans);
         
    }
    
}
