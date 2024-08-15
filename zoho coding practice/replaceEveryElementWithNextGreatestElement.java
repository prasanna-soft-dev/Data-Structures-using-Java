/*Given an array of integers, replace every element with the next greatest element (greatest element on the right side) in the array. 
Since there is no element next to the last element, replace it with -1. 
For example, if the array is {16, 17, 4, 3, 5, 2}, then it should be modified to {17, 5, 5, 5, 2, -1}. */
import java.util.*;
public class replaceEveryElementWithNextGreatestElement{
    public static int great(int pos,int arr[])
    {  
        int ans = Integer.MIN_VALUE;
        for(int i = pos ;i < arr.length;i++)
        {
            if(arr[i] > ans)
            {
                ans = arr[i];
            }
        }
        return ans > 0 ? ans : -1;
    }
    public static void main(String[] args) {
        int arr[] = {16,17,4,3,5,2};
        //traverse through the array
        for(int i = 0;i < arr.length;i++)
        {
            int Nextgreatest  = great(i+1,arr);
            arr[i] = Nextgreatest;
        }
        System.out.println(Arrays.toString(arr));
    }
}
