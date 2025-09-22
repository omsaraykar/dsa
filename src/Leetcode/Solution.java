package Leetcode;

import java.util.*;

public class Solution {
    public long maximumTotalValue(int[] nums, int k) {
        int n = nums.length;
        if (n == 0 || k == 0) return 0L;

        PriorityQueue<Long> minHeap = new PriorityQueue<>();

        for (int left = 0; left < n; left++) {
            int curMax = nums[left];
            int curMin = nums[left];
            for (int right = left; right < n; right++) {
                if (nums[right] > curMax) curMax = nums[right];
                if (nums[right] < curMin) curMin = nums[right];

                long val = (long) curMax - (long) curMin;

                if (minHeap.size() < k) {
                    minHeap.add(val);
                } else if (val > minHeap.peek()) {
                    minHeap.poll();
                    minHeap.add(val);
                }
            }
        }

        long ans = 0L;
        while (!minHeap.isEmpty()) ans += minHeap.poll();
        return ans;
    }

    // quick test
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums1 = {1,3,2};
        System.out.println(s.maximumTotalValue(nums1, 2)); // expected 4

        int[] nums2 = {4,2,5,1};
        System.out.println(s.maximumTotalValue(nums2, 3)); // expected 12

        int[] nums3 = {5,2,3,4,1};
        System.out.println(s.maximumTotalValue(nums3, 3)); // expected 10
    }
}
// multiple max
// k i max