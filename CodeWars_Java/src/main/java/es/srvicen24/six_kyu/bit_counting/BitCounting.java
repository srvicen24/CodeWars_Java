package es.srvicen24.six_kyu.bit_counting;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BitCounting {

    /*
    Write a function that takes an integer as input, and returns the number of bits that are equal to one in the
    binary representation of that number. You can guarantee that input is non-negative.

    Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case
     */

    public static int countBits(int n) {
        String binary = Integer.toBinaryString(n);
        return (int) binary.chars().filter(b -> b == '1').count();
    }

    // O(n)

    public static int countBait2(int n) {
        return Integer.bitCount(n); // O(1)
    }
}
