/*
 You are given a function.
int CheckPassword(char str[], int n);
The function accepts string str of size n as an argument. Implement the function which returns 1 
if given string str is valid password else 0.
str is a valid password if it satisfies the below conditions.

– At least 4 characters
– At least one numeric digit
– At Least one Capital Letter
– Must not have space or slash (/)
– Starting character must not be a number
Assumption:
Input string will not be empty.

Example:

Input 1:
aA1_67
Input 2:
a987 abC012

Output 1:
1
Output 2:
0
 */
import java.util.*;

public class passwordValidate {

    public static boolean checkPassword(char[] str) {
        if (str.length < 4) {
            return false;
        }

        if (Character.isDigit(str[0])) {
            return false;
        }

        boolean upperCase = false;
        boolean lowerCase = false;
        boolean specialCase = false;

        for (char ch : str) {
            if (ch != ' ' && ch != '/') {
                if (Character.isUpperCase(ch)) {
                    upperCase = true;
                }
                if (Character.isLowerCase(ch)) {
                    lowerCase = true;
                }
                if (!Character.isLetterOrDigit(ch) && ch != ' ' && ch != '/') {
                    specialCase = true;
                }
            }
        }
        
        return upperCase && lowerCase && specialCase;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] str = s.toCharArray();
        boolean result = checkPassword(str);
        System.out.println("Password valid: " + result);
        sc.close();
    }
}
