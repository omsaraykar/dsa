package _3_Arrays;

import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int res = Integer.MAX_VALUE;
        int resAbs = Integer.MAX_VALUE;
        Arrays.sort(nums);

        for (int i = 0; i < n - 2; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) continue;

            int j = i + 1, k = n - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < target) {
                    if (Math.abs(sum - target) < resAbs) {
                        resAbs = Math.abs(sum - target);
                        res = sum;
                    }
                    j++;
                } else if (sum > target) {
                    if (Math.abs(sum - target) < resAbs) {
                        resAbs = Math.abs(sum - target);
                        res = sum;
                    }
                    k--;
                } else {
                    return target;
                }
            }
        }

        return res;
    }
}
