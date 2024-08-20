/*1. Print second frequently occurring number in given series

Example :

Input: 1 1 2 3 1 2 4
Output: 2
Explanation: 1 occurs 3 times, 2 occurs 2 times, 3 occurs 1 time and 4 occurs 1 time. Hence second frequently occurring number
 in given series is 2 */
import java.util.*;
public class secondFrequent{
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,1,2,2};
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num : arr){
            freq.put(num, freq.getOrDefault(num,0)+ 1);
        }
        int firstBig = 0;
        int firstBigValue = 0;
        int secondBig = 0;
        int secondBigValue = 0;

        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();

            if(value > firstBigValue){
                firstBig = key;
                firstBigValue = value;
            }
            else if(value < firstBigValue && value > secondBigValue){
                secondBig = key;
                secondBigValue = value;
            }
        }

        System.out.println(secondBig);
    }
}
