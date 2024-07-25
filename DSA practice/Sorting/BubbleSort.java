//Bubble sort with O(n)  best and O(n^2) worst time complexity suitable for small data
import java.util.*;
public class BubbleSort{
    public static void sort(int arr[])
    {
        boolean swapped;
        do{
            swapped = false;
            for(int i = 1;i < arr.length;i++)
        {
            if(arr[i] < arr[i-1])
            {
                int temp = arr[i-1];
                arr[i-1] = arr[i];
                arr[i] = temp;
                swapped = true;
            }
        }
    }while(swapped);
    }
    public static void main(String[] args) {
        int arr[] = {8,3,5,23,6};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }    
    
}
