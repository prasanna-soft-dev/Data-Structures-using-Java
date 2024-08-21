/*1: Given two sorted arrays output a merged array without duplicates.
Array1: [1, 2, 3, 6, 9]
Array2: [2, 4, 5, 10]
Merged Array: [1, 2, 3, 4, 5, 6, 9, 10] */
import java.util.*;
public class MergeSortedArray{
    public static int[] merge(int m1[],int m2[]){
        

        Set<Integer> res = new HashSet<>();
        int pointer1 = 0;
        int pointer2 = 0;
        while(pointer1 < m1.length && pointer2 < m2.length){
            if(m1[pointer1] < m2[pointer2]){
                res.add(m1[pointer1++]);
            }
            else{
                res.add(m2[pointer2++]);
            }
        }
        while(pointer1 < m1.length){
           res.add(m1[pointer1++]);
        }
        while(pointer2 < m2.length){
           res.add(m2[pointer2++]);
        }
        int ans[] = res.stream().mapToInt(Integer :: intValue).toArray();

        return ans;
        
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,6,9};
        int arr2[] = {2,4,5,10};

        //to remove the duplicates use the hashset
        Set<Integer> set1 = new HashSet<>();
        for(int num : arr1){
            set1.add(num);
        }
        Set<Integer> set2 = new HashSet<>();
        for(int num : arr2){
            set2.add(num);
        }

        int newArr1[] = set1.stream().mapToInt(Integer :: intValue).toArray();
        int newArr2[] = set2.stream().mapToInt(Integer :: intValue).toArray();

        int result[] = merge(newArr1,newArr2);


        System.out.println(Arrays.toString(result));
    }
    
}
