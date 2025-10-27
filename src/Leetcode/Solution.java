package Leetcode;

import java.util.*;

public class Solution {
    public long countStableSubarrays(int[] nums) {
        int n = nums.length;
        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        long count = 0;
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 2; i < n; i++) {
            long nextPrefix = prefix[i - 1];
            String nextKey = nums[i - 2] + "#" + nextPrefix;
            map.put(nextKey, map.getOrDefault(nextKey, 0) + 1);

            long targetPrefix = prefix[i] - nums[i];
            String key = nums[i] + "#" + targetPrefix;
            if (map.containsKey(key)) {
                count += map.get(key);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
    }
}
