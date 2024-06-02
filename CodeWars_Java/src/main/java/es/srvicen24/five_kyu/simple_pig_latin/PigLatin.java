package es.srvicen24.five_kyu.simple_pig_latin;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PigLatin {

    /*
    Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation
    marks untouched.

    Examples

    pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
    pigIt('Hello world !');     // elloHay orldway !

     */

    public static String pigIt(String str) {
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }

    // Complexity: O(n)
}
