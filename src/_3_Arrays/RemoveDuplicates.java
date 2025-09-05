package _3_Arrays;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {
    // Using two pointers
    public int removeDuplicates(int[] nums) {
        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                nums[++i] = nums[j];
            }
        }

        return i + 1;
    }

    // Using TreeSet
    public int removeDuplicates_(int[] nums) {
        Set<Integer> set = new TreeSet<>();

        for (int num: nums) {
            set.add(num);
        }

        int idx = 0;
        for (int ele: set) {
            nums[idx++] = ele;
        }

        return set.size();
    }
}
