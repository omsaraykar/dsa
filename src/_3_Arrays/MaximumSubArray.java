package _3_Arrays;

import java.util.ArrayList;
import java.util.List;

public class MaximumSubArray {
    // Print Subarray with Maximum Sum
    public ArrayList<Integer> printSubarray(int[] arr) {
        int resStart = 0, resEnd = 0;
        int currStart = 0;

        int maxSum = arr[0];
        int sum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (sum + arr[i] < arr[i]) {
                sum = arr[i];
                currStart = i;
            }
            else {
                sum += arr[i];
            }

            if (sum > maxSum) {

                maxSum = sum;
                resStart = currStart;
                resEnd = i;
            }
        }

        ArrayList<Integer> res = new ArrayList<>();
        for (int i = resStart; i <= resEnd; i++) {
            System.out.println(arr[i] + " ");
            res.add(arr[i]);
        }

        return res;
    }
}
