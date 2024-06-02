package es.srvicen24.four_kyu.strip_comments;

import lombok.NoArgsConstructor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class StripComments {

    /*
    Complete the solution so that it strips all text that follows any of a set of comment markers passed in. Any
    whitespace at the end of the line should also be stripped out.

    Example:

    Given an input string of:

    apples, pears # and bananas
    grapes
    bananas !apples
    The output expected would be:

    apples, pears
    grapes
    bananas
    The code would be called like so:

    var result = solution("apples, pears # and bananas\ngrapes\nbananas !apples", ["#", "!"])
    // result should == "apples, pears\ngrapes\nbananas"
     */

    public static String stripComments(String text, String[] commentSymbols) {
        String[] lines = text.split("\n");
        StringBuilder result = new StringBuilder();

        for (String line : lines) {
            for (String commentSymbol : commentSymbols) {
                int index = line.indexOf(commentSymbol);
                if (index != -1) {
                    line = line.substring(0, index);
                }
            }
            result.append(line.stripTrailing()).append("\n");
        }

        return result.toString().stripTrailing();
    }

    // Complexity: O(n * m), where n is the number of lines and m is the number of comment symbols
    // Space: O(n)

    public static String stripComments2(String text, String[] commentSymbols) {
        String regex = String.format(" *([%s].*)?$", String.join("", commentSymbols));

        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);

        Matcher matcher = pattern.matcher(text);
        String result = matcher.replaceAll("");

        return result;
    }

    // Complexity: O(n), where n is the number of characters in the text
    // Space: O(n)
}
