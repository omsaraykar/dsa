package _4_Binary_Search;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        while (lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if (target == nums[mid]) return mid;
            else if (target > nums[mid]) lo = mid + 1;
            else hi = mid - 1;
        }
        return -1;
    }
}
