/*Problem Statement –

You’re given an array of integers, print the number of times each integer has occurred in the array.

Example

Input :
10
1 2 3 3 4 1 4 5 1 2 

Output :
1 occurs 3 times
2 occurs 2 times
3 occurs 2 times
4 occurs 2 times
5 occurs 1 times */
import java.util.*;
public class FrequencyNumbers{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : arr)
        {
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey() +" occurs "+entry.getValue()+" times");
        }
    }
    
}
