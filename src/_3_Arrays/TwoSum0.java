package _3_Arrays;

import java.util.*;

public class TwoSum0 {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        int left = 0, right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == 0) {
                result.add(new ArrayList<>(Arrays.asList(arr[left], arr[right])));

                // === skip duplicates ===
                int leftVal = arr[left];
                int rightVal = arr[right];
                while (left < right && arr[left] == leftVal) left++;
                while (left < right && arr[right] == rightVal) right--;
                // =======================
            }

            else if (sum < 0) left++;
            else right--;
        }

        return result;
    }
}
