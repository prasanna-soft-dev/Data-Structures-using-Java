/*Problem Statement –

Capgemini in its online written test have a coding question, wherein the students are given a string with multiple characters 
that are repeated consecutively. You’re supposed to reduce the size of this string using mathematical logic given as in the example below :

Input :
aabbbbeeeeffggg

Output:
a2b4e4f2g3

Input :
abbccccc

Output:
ab2c5 */
import java.util.Scanner;

public class StringToMathsEquation {
    public static void smilyfy(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= s.length(); i++) {
            if (i < s.length() && s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                sb.append(s.charAt(i - 1));
                if (count > 1) {
                    sb.append(count);
                }
                count = 1;
            }
        }

        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        smilyfy(s);
    }
}