package es.srvicen24.five_kyu.perimeter_of_squares_in_a_rectangle;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class SumFct {

    /*
    The drawing shows 6 squares the sides of which have a length of 1, 1, 2, 3, 5, 8. It's easy to see that the sum
    of the perimeters of these squares is : 4 * (1 + 1 + 2 + 3 + 5 + 8) = 4 * 20 = 80

    Could you give the sum of the perimeters of all the squares in a rectangle when there are n + 1 squares disposed in
    the same manner as in the drawing:

    alternative text

    Hint:

    See Fibonacci sequence

    Ref:

    http://oeis.org/A000045

    The function perimeter has for parameter n where n + 1 is the number of squares (they are numbered from 0 to n) and
    returns the total perimeter of all the squares.

    perimeter(5)  should return 80
    perimeter(7)  should return 216
     */

    public static BigInteger perimeter(BigInteger n) {
        if (n.compareTo(BigInteger.TWO) < 1) {
            return BigInteger.valueOf(4);
        }

        BigInteger last = BigInteger.ONE;
        BigInteger lastLast = BigInteger.ONE;
        BigInteger sum = BigInteger.TWO;

        for (BigInteger i = BigInteger.TWO; i.compareTo(n) < 1; i = i.add(BigInteger.ONE)) {
            sum = sum.add(last).add(lastLast);
            BigInteger aux = last;
            last = last.add(lastLast);
            lastLast = aux;
        }

        return sum.multiply(BigInteger.valueOf(4));
    }

    // O(n)

    public static BigInteger perimeter2(BigInteger n) {
        int nInt = n.intValue();

        List<Integer> fibonacci = new ArrayList<>(nInt);
        fibonacci.add(1);
        fibonacci.add(1);

        for (int i = 2; i <= nInt; i++) {
            fibonacci.add(fibonacci.get(i - 1) + (fibonacci.get(i - 2)));
        }

        return BigInteger.valueOf(fibonacci.stream().reduce(Integer::sum).orElse(0) * 4L);
    }
}
