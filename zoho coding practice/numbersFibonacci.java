/*2. Print only numbers which is present in Fibonacci series (0 1 1 2 3 5 8 ……..)

Example:

Input: 2 10 4 8
Output: 2 8 
Input: 1 10 6 8 13 21
Output: 1 8 13 21*/
import java.util.*;
public class numbersFibonacci{
    public static void main(String[] args) {
        int arr[] = {1,10,6,8,13,21};
        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        Set<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);//this will eliminate the duplicates
        }
        List<Integer> ans = new ArrayList<>();
        int a = 0,b = 1;
        if(set.contains(a))ans.add(a);
        while(b <= max){
            int next = a + b;
            a = b;
            b = next;

            if(set.contains(next)){
                ans.add(next);
            }
        }
        System.out.println(ans);
    }
}
