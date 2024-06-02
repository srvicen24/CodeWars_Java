package es.srvicen24.four_kyu.sum_of_intervals;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Interval {

    /*
    Write a function called sumIntervals/sum_intervals that accepts an array of intervals, and returns the sum of all
     the interval lengths. Overlapping intervals should only be counted once.

    Intervals

    Intervals are represented by a pair of integers in the form of an array. The first value of the interval will
    always be less than the second value. Interval example: [1, 5] is an interval from 1 to 5. The length of this
    interval is 4.

    Overlapping Intervals

    List containing overlapping intervals:

    [
       [1, 4],
       [7, 10],
       [3, 5]
    ]
    The sum of the lengths of these intervals is 7. Since [1, 4] and [3, 5] overlap, we can treat the interval as [1,
     5], which has a length of 4.

    Examples:

    sumIntervals( [
       [1, 2],
       [6, 10],
       [11, 15]
    ] ) => 9

    sumIntervals( [
       [1, 4],
       [7, 10],
       [3, 5]
    ] ) => 7

    sumIntervals( [
       [1, 5],
       [10, 20],
       [1, 6],
       [16, 19],
       [5, 11]
    ] ) => 19

    sumIntervals( [
       [0, 20],
       [-100000000, 10],
       [30, 40]
    ] ) => 100000030
    Tests with large intervals

    Your algorithm should be able to handle large intervals. All tested intervals are subsets of the range
    [-1000000000, 1000000000].
     */

    public static int sumIntervals(int[][] intervals) {
        List<int[]> initSortedIntervals = Arrays.stream(intervals)
                                                .sorted(Comparator.comparingInt(interval -> interval[0]))
                                                .toList();

        int next = 0;
        int result = 0;
        for (int i = 0; i < initSortedIntervals.size(); i = next) {
            int[] interval = initSortedIntervals.get(i);
            int init = interval[0];
            int end = interval[1];

            for (int j = i + 1; j < initSortedIntervals.size(); j++) {
                int[] nextInterval = initSortedIntervals.get(j);
                if (nextInterval[0] <= end) {
                    end = Math.max(nextInterval[1], end);
                    next = j;
                } else {
                    break;
                }
            }
            next++;
            result += end - init;
        }

        return result;
    }

    // Complexity: O(n long n)
    // Space: O(n)
}
