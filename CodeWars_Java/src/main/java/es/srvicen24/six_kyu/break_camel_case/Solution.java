package es.srvicen24.six_kyu.break_camel_case;

public class Solution {

    /*
    Complete the solution so that the function will break up camel casing, using a space between words.

    Example

    "camelCasing"  =>  "camel Casing"
    "identifier"   =>  "identifier"
    ""             =>  ""
     */

    public static String camelCase(String input) {
        return input.replaceAll("([A-Z])", " $1");
    }
}
