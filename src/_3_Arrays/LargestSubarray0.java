package _3_Arrays;

import java.util.HashMap;

public class LargestSubarray0 {
    // Largest Subarray with 0 sum
    int maxLength(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0, length = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum)) {
                length = Math.max(length, i - map.get(sum));
            }
            else map.put(sum, i);
        }

        return length;
    }
}
