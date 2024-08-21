/*19. Print all the possible subsets of array which adds up to give a sum.
Input: array{2, 3, 5, 8, 10}
sum=10
Output: {2, 3, 5}
       {2, 8}
       {10}
 */


 // for this we are using recursion and backtracking
import java.util.*;
public class SubsetSum{

    public static void findSubset(int arr[],int index,int target,List<Integer> currentSum){
        if(target == 0){
            System.out.println(currentSum);
            return;
        }
        if(target < 0 || index >= arr.length){
            return;
        }
        currentSum.add(arr[index]);
        findSubset(arr, index  + 1, target - arr[index], currentSum);

        currentSum.remove(currentSum.size() - 1);
        findSubset(arr, index + 1, target, currentSum);
    }
    public static void findAllSubset(int arr[],int index,List<Integer> currenSubset,List<List<Integer>> allSubset){
        allSubset.add(new ArrayList<>(currenSubset));

        for(int i = index;i < arr.length;i++){

            //to eliminate duplicate add condition
            //if(i > index && arr[i] == arr[i-1]){
            //      continue;}
            currenSubset.add(arr[index]);

            findAllSubset(arr, index + 1, currenSubset, allSubset);
            currenSubset.remove(currenSubset.size() - 1);
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5,8,10};
        int target = 10;


        //to find the subset that adds up to the target
        List<Integer> currentSum = new ArrayList<>();

        findSubset(arr,0,target,currentSum);


        // to find all posible subset
        List<List<Integer>> allSubset = new ArrayList<>();

        List<Integer> currentSubset = new ArrayList<>();

        findAllSubset(arr,0,currentSubset,allSubset);


    }
}
