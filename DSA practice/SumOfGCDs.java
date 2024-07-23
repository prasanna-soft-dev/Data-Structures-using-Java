import java.util.*;

public class SumOfGCDs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the value of N:");
        int N = scanner.nextInt();
        
        int sumOfGCDs = calculateSumOfGCDs(N);
        System.out.println("Sum of GCDs for all numbers up to " + N + " with " + N + " is: " + sumOfGCDs);
    }
    
    public static int calculateSumOfGCDs(int N) {
        int sum = 0;
        
        for (int i = 1; i <= N; i++) {
            sum += gcd(i, N);
        }
        
        return sum;
    }
    
    public static int gcd(int a, int b) {//finding gcd using recursion
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
