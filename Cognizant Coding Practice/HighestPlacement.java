/*Problem Statement – FOE college wants to recognize the department which has succeeded in getting the maximum 
number of placements for this academic year. The departments that have participated in the recruitment drive are CSE,ECE, MECH.
 Help the college find the department getting maximum placements. Check for all the possible output given in the sample snapshot

Note : If any input is negative, the output should be “Input is Invalid”.  If all department has equal number of placements, 
the output should be “None of the department has got the highest placement”.

Sample Input 1:

Enter the no of students placed in CSE:90
Enter the no of students placed in ECE:45
Enter the no of students placed in MECH:70
Sample Output 1:

Highest placement
CSE

Sample Input 2:

Enter the no of students placed in CSE:55
Enter the no of students placed in ECE:85
Enter the no of students placed in MECH:85
Sample Output 2:

Highest placement
ECE

MECH

Sample Input 3:

Enter the no of students placed in CSE:0
Enter the no of students placed in ECE:0
Enter the no of students placed in MECH:0
Sample Output 3:

None of the department has got the highest placement
Sample Input 4:

Enter the no of students placed in CSE:10
Enter the no of students placed in ECE:-50
Enter the no of students placed in MECH:40
Sample Output 4:

Input is Invalid */
import java.util.*;

public class HighestPlacement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students placed in CSE: ");
        int CSE = sc.nextInt();
        if (CSE < 0) {
            System.out.println("Input is Invalid");
            return; // Exit the program if input is invalid
        }

        System.out.print("Enter the number of students placed in ECE: ");
        int ECE = sc.nextInt();
        if (ECE < 0) {
            System.out.println("Input is Invalid");
            return; // Exit the program if input is invalid
        }

        System.out.print("Enter the number of students placed in MECH: ");
        int MECH = sc.nextInt();
        if (MECH < 0) {
            System.out.println("Input is Invalid");
            return; // Exit the program if input is invalid
        }

        if (CSE == ECE && ECE == MECH) {
            System.out.println("None of the departments has the highest placement");
            return; // Exit the program since there's no highest department
        }

        // Determine the department with the highest placement
        if (CSE > ECE && CSE > MECH) {
            System.out.println("Highest placement:\nCSE");
        } else if (ECE > CSE && ECE > MECH) {
            System.out.println("Highest placement:\nECE");
        } else if (MECH > CSE && MECH > ECE) {
            System.out.println("Highest placement:\nMECH");
        } else if (CSE == ECE && CSE > MECH) {
            System.out.println("Highest placement:\nCSE\nECE");
        } else if (CSE == MECH && CSE > ECE) {
            System.out.println("Highest placement:\nCSE\nMECH");
        } else if (ECE == MECH && ECE > CSE) {
            System.out.println("Highest placement:\nECE\nMECH");
        }
    }
}
