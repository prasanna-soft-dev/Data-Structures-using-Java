import java.util.*;
class Quick{
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int partition(int arr[],int low,int high)
    {
        int pivot=arr[high];
        int i=low-1;//to keep track of the smallest element
        for(int j=0;j<=high-1;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;

    }
    static void quicksort(int arr[],int low,int high)
    {
        if(low<high)
        {
            int pi=partition(arr,low,high);
            quicksort(arr, low, pi-1);
            quicksort(arr, pi+1, high);
        }
    }
    static void printArrary(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String args[])
    {
        int arr[]={10, 1, 4 ,3, 5};
        int n=arr.length;
        quicksort(arr, 0, n-1);
        printArrary(arr);
    }
}