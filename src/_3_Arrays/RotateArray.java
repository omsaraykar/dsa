package _3_Arrays;

public class RotateArray {
    public void revArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        revArray(nums, 0, n - k - 1);
        revArray(nums, n - k, n - 1);
        revArray(nums, 0 , n - 1);
    }
}
