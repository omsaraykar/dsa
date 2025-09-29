package Leetcode;

import java.util.*;

public class Solution {
    public long splitArray(int[] nums) {
        int idx = 0;
        while (idx < nums.length - 1 && nums[idx + 1] > nums[idx]) {
            idx++;
        }

        long sumBefore = 0, sumAfter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < idx) {
                sumBefore += nums[i];
            } else if (i > idx) {
                sumAfter += nums[i];
            }
        }

        long diff1 = Math.abs(sumBefore - (sumAfter + nums[idx]));
        long diff2 = Math.abs((sumBefore + nums[idx]) - sumAfter);

        return Math.min(diff1, diff2);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        long ans = sol.splitArray(new int[] {1,2,4,3});
        System.out.println(ans);
    }
}
