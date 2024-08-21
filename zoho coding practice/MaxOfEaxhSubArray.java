/*Given an array arr[] of size N and an integer K. Find the maximum for each and every contiguous subarray of size K.

Example 1:

Input:
N = 9, K = 3
arr[] = 1 2 3 1 4 5 2 3 6
Output: 
3 3 4 5 5 5 6 
Explanation: 
1st contiguous subarray = {1 2 3} Max = 3
2nd contiguous subarray = {2 3 1} Max = 3
3rd contiguous subarray = {3 1 4} Max = 4
4th contiguous subarray = {1 4 5} Max = 5
5th contiguous subarray = {4 5 2} Max = 5
6th contiguous subarray = {5 2 3} Max = 5
7th contiguous subarray = {2 3 6} Max = 6 */
import java.util.*;
public class MaxOfEaxhSubArray{
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,4,5,2,3,6};
        int k =3;

        //sliding window approach
        int windowStart = 0;
        List<Integer> res = new ArrayList<>();
        List<Integer> subArray = new ArrayList<>();
        for(int windowEnd = 0;windowEnd < arr.length;windowEnd++){

            if(subArray.size() < k){
                subArray.add(arr[windowEnd]);
            }
            if(subArray.size() == k){
                res.add(Collections.max(subArray));

                subArray.remove(windowStart);
            }
        }
        int result[] = res.stream().mapToInt(Integer :: intValue).toArray();
        System.out.println(Arrays.toString(result));
    }
}
