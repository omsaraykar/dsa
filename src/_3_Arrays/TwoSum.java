package _3_Arrays;

import java.util.*;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
            int required = target - nums[i];
            if (map.containsKey(required)) {
                return new int [] {i, map.get(required)};
            }
        }

        return new int[2];
    }

    public int[] twoSumBrute(int[] nums, int target) {
        int n = nums.length;
        int[] res = new int[2];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }

        return res;
    }
}
