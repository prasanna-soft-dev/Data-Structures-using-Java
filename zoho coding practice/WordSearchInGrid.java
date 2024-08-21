/*4) Given a 2D grid of characters, you have to search for all the words in a dictionary by
moving only along two directions, either right or down. Print the word if it occurs.

 
Sample :         
  a   z  o   l 
  n   x  h   o
  v   y   i   v 
  o   r   s  e 
 Dictionary = {van, zoho, love, are, is} 
 
 Output: 
    zoho 
    love 
    Is 
  */

import java.util.*;

public class WordSearchInGrid{
    // Method to search for all words in the dictionary in the grid
    public static void findWords(char[][] grid, List<String> dictionary) {
        int rows = grid.length;
        int cols = grid[0].length;

        for (String word : dictionary) {
            boolean found = false;

            // Search for the word starting from every cell
            for (int r = 0; r < rows && !found; r++) {
                for (int c = 0; c < cols && !found; c++) {
                    if (searchWord(grid, word, r, c, 0)) {
                        System.out.println(word);
                        found = true;
                    }
                }
            }
        }
    }

    // Recursive method to search for the word in the grid
    private static boolean searchWord(char[][] grid, String word, int r, int c, int index) {
        int rows = grid.length;
        int cols = grid[0].length;

        // If all characters are found
        if (index == word.length()) {
            return true;
        }

        // Boundary check and character match check
        if (r >= rows || c >= cols || grid[r][c] != word.charAt(index)) {
            return false;
        }

        // Move right or down
        return searchWord(grid, word, r, c + 1, index + 1) || // Move right
               searchWord(grid, word, r + 1, c, index + 1);    // Move down
    }

    public static void main(String[] args) {
        char[][] grid = {
            {'a', 'z', 'o', 'l'},
            {'n', 'x', 'h', 'o'},
            {'v', 'y', 'i', 'v'},
            {'o', 'r', 's', 'e'}
        };

        List<String> dictionary = Arrays.asList("van", "zoho", "love", "are", "is");

        findWords(grid, dictionary);
    }
}
