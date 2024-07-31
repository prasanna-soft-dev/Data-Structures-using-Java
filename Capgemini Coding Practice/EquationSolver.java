import java.util.Scanner;

public class EquationSolver{

    // Method to calculate the value of a^3 + 3a^2b + 3ab^2 + b^3
    public static double calculateEquation(double a, double b) {
        // Compute each term
        double aCubed = a * a * a; // a^3
        double threeA2B = 3 * a * a * b; // 3a^2b
        double threeAB2 = 3 * a * b * b; // 3ab^2
        double bCubed = b * b * b; // b^3

        // Sum all terms
        return aCubed + threeA2B + threeAB2 + bCubed;
    }
   /*  public static double calculateEquation(double a, double b) {
        return Math.pow(a + b, 3);
    }*/

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Accept values for a and b from the user
        System.out.print("Enter the value for a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter the value for b: ");
        double b = scanner.nextDouble();
        
        // Calculate the result
        double result = calculateEquation(a, b);
        
        // Display the result
        System.out.println("The result of the equation is: " + result);
        
        // Close the scanner
        scanner.close();
    }
}

