/*Problem Description :
The function accepts two positive integers ‘r’ and ‘unit’ and a positive integer array ‘arr’ of size ‘n’ as its argument 
‘r’ represents the number of rats present in an area, ‘unit’ is the amount of food each rat consumes and each ith element of 
array ‘arr’ represents the amount of food present in ‘i+1’ house number, where 0 <= i

Note:

Return -1 if the array is null
Return 0 if the total amount of food from all houses is not sufficient for all the rats.
Computed values lie within the integer range.
Example:

Input:

r: 7
unit: 2
n: 8
arr: 2 8 3 5 7 4 1 2
Output:
4**/
import java.util.*;
public class Rats {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r = sc.nextInt();
        int unit = sc.nextInt();
        int n = sc.nextInt();
        int []arr=new int[n];
        for(int i = 0;i < n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int food_required = r * unit;
        int avail_food = 0;
        int count  = 0;
        for(int i=0;i<n;i++)
        {
            avail_food += arr[i];
            count ++;
            if(avail_food >= food_required)
            {
                System.out.println(count);
                return;
            }
        }
        System.out.println(" not enough food");
    }
    
}
