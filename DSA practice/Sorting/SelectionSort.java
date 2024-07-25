//selection sort having time Complexity O(n^2)

import java.util.*;
public class SelectionSort{
    public static void sort(int []arr)
    {
        for(int i = 0;i < arr.length;i++)
        {
            int  last = arr.length - i - 1;
            int maximumElement  = maxELe(arr,0,last);//we are giving last postion to make sure it does not return the sorted max element
            swap(arr, maximumElement,last);

        }
    }
    public static int maxELe(int arr[],int start,int last)
    {
        int max = start;
        for(int maxIndex = start;maxIndex <= last;maxIndex++)
        {
            if (arr[maxIndex] > arr[max]) {
                max = maxIndex;
                
            }
        }
        return max;
    }
    public static void swap(int []arr,int maximumElement,int last)//used to swap the elements in the array
    {
        int temp = arr[maximumElement];
        arr[maximumElement] = arr[last];
        arr[last] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i = 0;i < n;i++)
        {
            arr[i] = sc.nextInt();
        }
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    
}
