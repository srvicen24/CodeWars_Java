package es.srvicen24.five_kyu.maximum_subarray_sum;

public class Max {

    /*
    The maximum sum subarray problem consists in finding the maximum sum of a contiguous subsequence in an array or
    list of integers:

    Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
    // should be 6: {4, -1, 2, 1}

    Easy case is when the list is made up of only positive numbers and the maximum sum is the sum of the whole array. If
    the list is made up of only negative numbers, return 0 instead.

    Empty list is considered to have zero greatest sum. Note that the empty list or array is also a valid
    sublist/subarray.
     */

    public static int sequence(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int maxCurrent = arr[0];
        int maxGlobal = Math.max(arr[0], 0);

        for (int i = 1; i < arr.length; i++) {
            maxCurrent = Math.max(arr[i], maxCurrent + arr[i]);
            if (maxCurrent > maxGlobal) {
                maxGlobal = maxCurrent;
            }
        }

        return maxGlobal;
    }

    // O(n)
}
