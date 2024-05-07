package es.srvicen24.six_kyu.highest_scoring_word;

import java.util.List;

import lombok.NoArgsConstructor;

@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class High {

  /*
   * Given a string of words, you need to find the highest scoring word.
   * 
   * Each letter of a word scores points according to its position in the
   * alphabet: a = 1, b = 2, c = 3 etc.
   * 
   * For example, the score of abad is 8 (1 + 2 + 1 + 4).
   * 
   * You need to return the highest scoring word as a string.
   * 
   * If two words score the same, return the word that appears earliest in the
   * original string.
   * 
   * All letters will be lowercase and all inputs will be valid.
   */

  public static String high(String s) {
    List<String> words = List.of(s.split(" ")); // O(n) - Space: O(n)
    return words.stream().max((a, b) -> getScore(a) - getScore(b)).orElse(""); // O(n * m)
  }

  private static int getScore(String word) {
    return word.chars().reduce(0, (acc, c) -> acc + c - 'a' + 1); // O(m) - Space: O(1)
  }

  // Complexity: O(n) + O(n * m) + O(m) = O(n * m)
  // Space: O(n) + O(1) = O(n)
}
