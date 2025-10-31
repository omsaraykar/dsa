package _4_Binary_Search;

public class SmallestDivisor {
    public int smallestDivisor(int[] nums, int threshold) {
        int lo = 1, hi = findMax(nums);
        int res = -1;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            int sum = sumByD(nums, mid);

            if (sum <= threshold) {
                res = mid;
                hi = mid;
            }
            else lo = mid + 1;
        }

        return res;
    }

    private int sumByD(int[] nums, int mid) {
        int sum = 0;
        for (int num: nums) {
            sum += (int) Math.ceil((double) num / mid);
        }
        return sum;
    }

    private int findMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int num: nums) {
            if (num > max) max = num;
        }
        return max;
    }
}
