package _3_Arrays;

import java.util.*;

public class LongestSubarray {
    // Longest Subarray with sum k
    static int longestSubarray(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        int prefixSum = 0, maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            if (prefixSum == k) {
                maxLength = i + 1;
            } else if (map.containsKey(prefixSum - k)) {
                maxLength = Math.max(maxLength, i - map.get(prefixSum - k));
            }

            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
        }

        return maxLength;
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
