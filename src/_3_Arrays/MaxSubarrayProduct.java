package _3_Arrays;

public class MaxSubarrayProduct {
    public int maxProduct1(int[] nums) {
        int n = nums.length;
        int maxProduct = Integer.MIN_VALUE;

        int prefix = 1, suffix = 1;
        for (int i = 0; i < n; i++) {
            if (prefix == 0) prefix = 1;
            if (suffix == 0) suffix = 1;

            prefix *= nums[i];
            suffix *= nums[n - i - 1];

            maxProduct = Math.max(maxProduct, Math.max(prefix, suffix));
        }

        return maxProduct;
    }

    public int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }


    public int min(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    public int maxProduct2(int[] nums) {
        int n = nums.length;
        int currMin = nums[0], currMax = nums[0];
        int maxProduct = nums[0];

        for (int i = 1; i < n; i++) {
            int temp = max(nums[i], nums[i] * currMax, nums[i] * currMin);

            currMin = min (nums[i], nums[i] * currMax, nums[i] * currMin);

            currMax = temp;

            maxProduct = Math.max(maxProduct, currMax);
        }

        return maxProduct;
    }
}
