/*5. Insert 0 after consecutive (K times) of 1 is found.
Example:

Input:
Number of bits: 12
Bits: 1 0 1 1 0 1 1 0 1 1 1 1
Consecutive K: 2

Output:
1 0 1 1 0 0 1 1 0 0 1 1 0 1 1 0 */
import java.util.*;
public class insertZeros{
    public static void main(String[] args) {
        int arr[] = {1,0,1,1,0,1,1,0,1,1,1,1};
        int k = 2;
        int ones = 0;
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while(i < arr.length){
            if(arr[i] == 1){
                ones++;
            }
            else {
                ones = 0;
            }
            ans.add(arr[i++]);
            if(ones == k){
                ans.add(0);
                ones = 0;
            }
        }
        System.out.println(ans);
    }
}
