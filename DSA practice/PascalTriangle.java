import java.util.*;

public class PascalTriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int spaces = num;
        
        for (int i = 0; i < num; i++) {
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            spaces--;
            System.out.println();
        }
    }
}

