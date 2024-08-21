/*Given an array of characters print the characters that have ‘n’ number of occurrences. If a character appears consecutively 
it is counted as 1 occurrence
Eg: a b a a b c c d e d
Here a has only 2 occurrences */
import java.util.*;

public class twoOccurenceIsOne{
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        char arr[] = {'a','b','a','a','b','c','c','d','e','d'};
        int i = 0;
        int n = arr.length;

        while (i < n) {
            char currentChar = arr[i];
            if (!map.containsKey(currentChar)) {
                map.put(currentChar, 1);
            } else {
                map.put(currentChar, map.get(currentChar) + 1);
            }

            // Skip all consecutive occurrences of the current character
            while (i < n - 1 && arr[i + 1] == currentChar) {
                i++;
            }

            i++; // Move to the next character
        }

        // Print characters that have exactly 'n' occurrences
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println("Character " + entry.getKey() + " appeared " + entry.getValue() + " times");
        }
    }
}

