//Inserion sort with O(N) when the array is already sorted and worst O(n^2) when it is not sorted
import java.util.*;
public class InsertionSort{
    public static void sort(int arr[])
    {
        for(int i = 1;i < arr.length;i++)
        {
            int j = i;
            while(j > 0 && arr[j-1] > arr[j])
            {
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={9,1,8,4,7,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
