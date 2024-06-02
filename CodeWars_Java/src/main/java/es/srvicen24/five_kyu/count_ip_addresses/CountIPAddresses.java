package es.srvicen24.five_kyu.count_ip_addresses;

import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class CountIPAddresses {

    /*
    mplement a function that receives two IPv4 addresses, and returns the number of addresses between them (including
     the first one, excluding the last one).

    All inputs will be valid IPv4 addresses in the form of strings. The last address will always be greater than the
    first one.
     */

    public static long ipsBetween(String start, String end) {
        List<Long> startParts = Arrays.stream(start.split("\\.")).map(Long::parseLong).toList();
        List<Long> endParts = Arrays.stream(end.split("\\.")).map(Long::parseLong).toList();

        long result = 0;

        for (int i = 0; i < 4; i++) {
            long ips = endParts.get(i) - startParts.get(i);
            int pow = 4 - (i + 1);
            ips *= (long) Math.pow(256, pow);
            result += ips;
        }

        return result;
    }

    // Complexity: O(1)
    // Space: O(1)
}
