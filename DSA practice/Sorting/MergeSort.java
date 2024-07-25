//Merger sort with O(n log n) as its best, average, worst time complexity

import java.util.Arrays;

public class MergeSort{
    public static void merge(int arr[],int left,int mid,int right)
    {
        int LengthOfLeftSubArray = mid -left + 1;
        int LengthOfRightSubArray = right - mid;

        int leftArray[] = new int[LengthOfLeftSubArray];
        int rightArray[] =new int[LengthOfRightSubArray];


        for(int i = 0;i < LengthOfLeftSubArray;i++){
            leftArray[i] = arr[left + i];
        }
        for(int i = 0;i < LengthOfRightSubArray;i++)
        {
            rightArray[i] = arr[mid + 1 + i];
        }

        int i = 0,j = 0,k = left;
        while(i < LengthOfLeftSubArray && j < LengthOfRightSubArray)
        {
            if(leftArray[i] <= rightArray[j])
            {
                arr[k++] = leftArray[i++];
            }
            else
            {
                arr[k++] = rightArray[j++];
            }
        }
        while( i < LengthOfLeftSubArray)
        {
            arr[k++] = leftArray[i++];
        }
        while(j < LengthOfRightSubArray)
        {
            arr[k++] = rightArray[j++];
        }
    }
    public static void mergeSort(int arr[],int low,int high)
    {
        if(low < high)
        {
            int mid = low + (high -low) / 2;
            mergeSort(arr,low,mid);//using recurion to sort the array
            mergeSort(arr,mid+1,high);

            merge(arr,low,mid,high);
        }
    }
    public static void main(String[] args) {
        int arr[]= {9,1,8,4,7,2};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    
}
