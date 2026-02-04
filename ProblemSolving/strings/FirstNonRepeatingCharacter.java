package strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem: First Non-Repeating Character in a String
 * <p>
 * Given a string s, return the index of the first character
 * that appears exactly once in the string.
 * If no such character exists, return -1.
 * <p>
 * Sample Inputs & Outputs:
 * <p>
 * Input:  "leetcode"
 * Output: 0
 * <p>
 * Input:  "loveleetcode"
 * Output: 2
 * <p>
 * Input:  "aabb"
 * Output: -1
 * <p>
 * Edge Cases:
 * - Empty string -> -1
 * - Single character -> 0
 */

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        FirstNonRepeatingCharacter solution = new FirstNonRepeatingCharacter();

        // Test cases
        System.out.println(solution.firstNonRepeatingCharV1("leetcode"));       // Expected: 0
        System.out.println(solution.firstNonRepeatingCharV1("loveleetcode"));   // Expected: 2
        System.out.println(solution.firstNonRepeatingCharV1("aabb"));           // Expected: -1
        System.out.println(solution.firstNonRepeatingCharV1("a"));              // Expected: 0
        System.out.println(solution.firstNonRepeatingCharV1(""));               // Expected: -1
    }

    // TODO: Implement optimal solution: HashMap to track character counts and a single pass to find the first non-repeating character
    public int firstNonRepeatingCharV1(String s) {
        int length = s.length();
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (int i = 0; i < length; i++) {
            char c =
            int count = charCountMap.getOrDefault(s.charAt(i), 0);
            charCountMap.put(c
        }

        return -1;
    }

    // TODO: Implement optimal solution: Using an array to track character counts for lowercase letters
    public int firstNonRepeatingCharV2(String s) {
        return -1;
    }
}
