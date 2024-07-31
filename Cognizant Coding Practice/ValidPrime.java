/*
 * Problem Statement – To speed up his composition of generating unpredictable rhythms, 
 * Blue Bandit wants the list of prime numbers available in a range of numbers.Can you help him out?

Write a java program to print all prime numbers in the interval [a,b] (a and b, both inclusive).

Note

Input 1 should be lesser than Input 2. Both the inputs should be positive. 
Range must always be greater than zero.
If any of the condition mentioned above fails, then display “Provide valid input”
Use a minimum of one for loop and one while loop
Sample Input 1:

2

15

Sample Output 1:

2 3 5 7 11 13

Sample Input 2:

8

5

Sample Output 2:

Provide valid input
 */
import java.util.Scanner;

public class ValidPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        if (start > end || start < 0 || end < 0) {
            System.out.println("Provide a valid input range");
            return;
        }

        for (int i = start; i <= end; i++) {
            if (i <= 1) {
                continue; // skip non-positive numbers
            }
            if (i == 2) {
                System.out.println(i);
                continue; // 2 is a prime number
            }
            if (i % 2 == 0) {
                continue; // skip even numbers
            }

            boolean isPrime = true;
            int d = 3;
            while (d * d <= i) {
                if (i % d == 0) {
                    isPrime = false;
                    break;
                }
                d += 2;
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}

