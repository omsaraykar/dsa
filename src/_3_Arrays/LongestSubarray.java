package _3_Arrays;

import java.util.*;

public class LongestSubarray {
    // Longest Subarray with sum k
    static int longestSubarray(int[] arr, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        int res = 0;
        int prefSum = 0;

        for (int i = 0; i < arr.length; ++i) {
            prefSum += arr[i];

            // Check if the entire prefix sums to k
            if (prefSum == k)
                res = i + 1;

                // If prefixSum - k exists in the map then there exist such
                // subarray from (index of previous prefix + 1) to i.
            else if (mp.containsKey(prefSum - k))
                res = Math.max(res, i - mp.get(prefSum - k));

            // Store only first occurrence index of prefSum
            if (!mp.containsKey(prefSum))
                mp.put(prefSum, i);
        }

        return res;
    }

    public int longestSubarrayBrute(int[] arr, int target) {
        int n = arr.length;
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                int length = j - i + 1;

                sum += arr[j];

                if (sum == target) {
                    maxLength = Math.max(maxLength, length);
                }
            }
        }

        return maxLength;
    }
}
