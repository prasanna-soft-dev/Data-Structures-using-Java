/*6. Remove the duplicates in the String.
Testcase 1:
Input: Java1234
Output: Javb1234 (Remove the second ‘a’ as it is duplicated)
Testcase 2:
Input: Python1223:
Output: Python1234 (Replace the second 2 with 3, and replace 3 with 4 as 3 is replaced for the duplicated 2)
Testcase 3:
Input: aBuzZ9900
Output: aBuzC9012
(Replace the second ‘Z’ with ‘C’ as ‘a’ and ‘B’ are already there in the String. Replace with capital C as the letter to be replaced is 
capital Z. The second 9 turns out to be zero and the zero turns out to ‘1’ and the second zero turns out to ‘2’)
 */
import java.util.*;

public class RemoveDuplicateInString {
    public static void main(String[] args) {
        String s = "aBuzZ9900"; // You can change the input string to test different cases

        StringBuilder output = new StringBuilder();
        Set<Character> seen = new HashSet<>();
        int digit = 1;

        for (char c : s.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                if ((Character.isUpperCase(c) && seen.contains(Character.toLowerCase(c))) || 
                    (Character.isLowerCase(c) && seen.contains(Character.toUpperCase(c)))) {
                    
                    char replacement = Character.isUpperCase(c) ? 'A' : 'a';
                    while (seen.contains(replacement) || seen.contains(Character.toLowerCase(replacement))) {
                        replacement++;
                    }
                    output.append(replacement);
                    seen.add(replacement);
                } else if (seen.contains(c)) {
                    char replacement = Character.isUpperCase(c) ? 'A' : 'a';
                    while (seen.contains(replacement)) {
                        replacement++;
                    }
                    output.append(replacement);
                    seen.add(replacement);
                } else {
                    output.append(c);
                    seen.add(c);
                }
            } else if (Character.isDigit(c)) {
                if (seen.contains(c)) {
                    char replacement = (char) ('0' + (digit % 10));
                    while (seen.contains(replacement)) {
                        digit++;
                        replacement = (char) ('0' + (digit % 10));
                    }
                    output.append(replacement);
                    seen.add(replacement);
                } else {
                    output.append(c);
                    seen.add(c);
                }
            } else {
                output.append(c);
                seen.add(c);
            }
        }

        // Output the final processed string
        System.out.println(output.toString());
    }
}
