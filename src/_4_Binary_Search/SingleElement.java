package _4_Binary_Search;

public class SingleElement {
    public int singleNonDuplicate(int[] nums) { // Expected Approach
        // [1,1,3,3,4,4,7,8,8]
        int lo = 0, hi = nums.length - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (mid % 2 == 1) {
                mid--;
            }

            if (nums[mid] == nums[mid + 1]) {
                lo = mid + 2;
            } else {
                hi = mid - 1;
            }
        }

        return nums[lo];
    }
    public int singleNonDuplicateNaive(int[] nums) { // Naive Approach
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res ^= nums[i];
        }

        return res;
    }
}
