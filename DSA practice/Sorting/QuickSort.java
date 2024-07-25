//Quick Sort with O(n log n) best and average and O(n^2) worst time complexity
import java.util.*;

public class QuickSort {
    
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int left = low;
        int right = high - 1;
        
        while (true) {
            while (left <= right && arr[left] < pivot) {
                left++;
            }
            while (right >= left && arr[right] > pivot) {
                right--;
            }
            if (left >= right) {
                break;
            }
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        //used to swap the left with pivot;
        int temp = arr[left];
        arr[left] = arr[high];
        arr[high] = temp;

        return left;
    }

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);//uses recursion to sort
            quickSort(arr, pi + 1, high);
        }
    }

    public static void sort(int arr[]) {
        quickSort(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int arr[] = {9, 1, 8, 4, 7, 2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
