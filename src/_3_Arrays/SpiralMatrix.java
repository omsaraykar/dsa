package _3_Arrays;

import java.util.*;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> list = new ArrayList<>();

        int left = 0, right = n - 1;
        int top = 0, bottom = m - 1;

        while (left <= right && top <= bottom) {
            // --->
            for (int i = left; i <= right; i++) {
                list.add(matrix[left][i]);
            }
            top++;

            // down
            if (left <= right) {
                for (int i = top; i <= bottom; i++) {
                    list.add(matrix[i][right]);
                }
                right--;
            }

            // <---
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // up
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }

        return list;
    }
}
