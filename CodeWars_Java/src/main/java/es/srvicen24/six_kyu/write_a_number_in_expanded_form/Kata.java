package es.srvicen24.six_kyu.write_a_number_in_expanded_form;

import java.util.LinkedList;
import java.util.List;

public class Kata {

    /*
    Write Number in Expanded Form

    You will be given a number and you will need to return it as a string in Expanded Form. For example:

    Kata.expandedForm(12); # Should return "10 + 2"
    Kata.expandedForm(42); # Should return "40 + 2"
    Kata.expandedForm(70304); # Should return "70000 + 300 + 4"
    NOTE: All numbers will be whole numbers greater than 0.

    If you liked this kata, check out part 2!!
     */
    public static String expandedForm(int num) {
        List<String> numbers = new LinkedList<>();

        int number = num;
        int iteration = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit > 0) {
                numbers.add(0, Integer.toString((int) (digit * Math.pow(10, iteration))));
            }
            iteration++;
            number /= 10;
        }
        return String.join(" + ", numbers);
    }

    // O(d) where d = number of digits in n
    // Space O(d^2) where d = number of digits in n
}
