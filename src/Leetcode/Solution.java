package Leetcode;

import java.util.*;

public class Solution {
    public int longestSubarray(int[] nums) {
        int[] window = getLongestAccendingSubarray(nums);
        int lo = window[0], hi = window[1];
        int left = lo, right = hi;

        int res = 0;
        // left check
        if (lo > 0) {
            nums[lo - 1] = nums[lo--];
            while (lo > 0 && nums[lo - 1] <= nums[lo]) {
                nums[lo - 1] = nums[lo];
                lo--;
            }
        }
        res = Math.max(res, hi - lo + 1);

        // right check
        lo = left;
        if (hi < nums.length) {
            nums[hi + 1] = nums[hi];
            while (hi < nums.length && nums[hi + 1] >= nums[hi]) {
                nums[hi + 1] = nums[hi];
                hi++;
            }
        }
        res = Math.max(res, hi - lo + 1);

        return res;
    }

    private int[] getLongestAccendingSubarray(int[] nums) {
        int n = nums.length;
        int[] res = new int[2];

        if (n == 0) return res;

        int start = 0;
        int bestStart = 0, bestEnd = 0;
        int longest = 1;

        for (int end = 1; end < n; end++) {
            if (nums[end] <= nums[end - 1]) {
                start = end;
            }

            int len = end - start + 1;
            if (len > longest) {
                longest = len;
                bestStart = start;
                bestEnd = end;
            }
        }

        res[0] = bestStart;
        res[1] = bestEnd;
        return res;
    }
}

