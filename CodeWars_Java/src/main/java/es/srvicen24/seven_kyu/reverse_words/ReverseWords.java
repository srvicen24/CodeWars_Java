package es.srvicen24.seven_kyu.reverse_words;

import java.util.Arrays;
import java.util.stream.Collectors;

import lombok.NoArgsConstructor;

@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class ReverseWords {

    /*
     * Complete the function that accepts a string parameter, and reverses each word
     * in the string. All spaces in the string should be retained.
     * 
     * Examples
     * 
     * "This is an example!" ==> "sihT si na !elpmaxe"
     * "double  spaces" ==> "elbuod  secaps"
     */

    public static String reverseWords(final String original) {
        if (original.trim().isEmpty()) { // Complexity: O(n) - Space: O(1)
            return original;
        }
        String[] words = original.split(" "); // Complexity: O(n) - Space: O(n)
        StringBuilder result = new StringBuilder();
        for (String word : words) { // Complexity: O(n) - Space: O(1)
            result.append(new StringBuilder(word).reverse()).append(" "); // Complexity: O(m) - Space: O(1)
        }
        return result.deleteCharAt(result.length() - 1).toString();
    }
    // Complexity: O(n) - Space: O(n)

    public static String reverseWords2(final String original) {
        return Arrays.stream(original.split("(?<=\\s)|(?=\\s+)"))
                .map(str -> new StringBuilder(str).reverse().toString())
                .collect(Collectors.joining());
    }
    // Complexity: O(n) - Space: O(n)
}
