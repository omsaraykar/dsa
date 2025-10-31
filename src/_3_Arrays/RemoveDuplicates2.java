package _3_Arrays;

public class RemoveDuplicates2 {
    // Input: nums = [1,1,1,2,2,3]
    // Output: 5, nums = [1,1,2,2,3,_]
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int count = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                nums[++i] = nums[j];
                count = 0;
            } else if (nums[j] == nums[i] && count < 2){
                nums[++i] = nums[j];
                count++;
            }
        }

        return i + 1;
    }
}
