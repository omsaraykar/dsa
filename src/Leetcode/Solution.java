package Leetcode;

import java.util.*;

class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for (int num: nums) set.add(num);

        int[] ans = new int[set.size()];
        for (int i = 0; i < set.size(); i++) {
            ans[i] = set.getFirst();
            set.removeFirst();
        }

        return ans;
    }
}