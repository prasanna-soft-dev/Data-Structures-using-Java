/*17.Given an array of integers, compute the maximum value for each integer in the index, by either summing all the digits or 
multiplying all the digits. (Choose which operation gives the maximum value)
•	Input:
•	5
•	120 24 71 10 59
•	Output:
•	3 8 8 1 45
Explanation: For index 0, the integer is 120. Summing the digits will give 3, and whereas Multiplying the digits gives 0. 
Thus, maximum of this two is 3.
 */
import java.util.*;

public class ProductOrSumNum{
    public static int getProduct(int num){
        int result = 1;

        while(num > 0){
            result *= num % 10;
            num /= 10;
        }
        return result;
    }
    public static int getSum(int num){
        int result = 0;
        while(num > 0){
            result += num % 10;
            num /= 10;
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {120,24,71,10,59};

        int sum = 0;
        int product = 0;

        int index = 0;
        int res[] = new int[arr.length];
        for(int num : arr){
            sum = getSum(num);
            product = getProduct(num);

            res[index++] = Math.max(sum , product);
        }
        System.out.println(Arrays.toString(res));
    }
}
