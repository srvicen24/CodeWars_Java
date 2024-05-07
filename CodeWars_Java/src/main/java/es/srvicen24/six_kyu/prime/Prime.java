package es.srvicen24.six_kyu.prime;

public class Prime {
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        if (num == 2 || num == 3) {
            return true;
        }

        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        int sqrt = (int) Math.sqrt(num);
        for (int i = 5; i <= sqrt; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    // Complexity: O(sqrt(n))
    // Space: O(1)
}
