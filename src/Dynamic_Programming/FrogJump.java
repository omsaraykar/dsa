package Dynamic_Programming;

import java.util.*;

public class FrogJump { // Memoization
    int minCost(int[] height) {
        int n = height.length;

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        return minCostRec(n - 1, height, dp);
    }
    int minCostRec(int n, int[] height, int[] dp) {
        if (n == 0) return 0;
        if (n == 1) return Math.abs(height[n] - height[n - 1]);

        if (dp[n] != -1) return dp[n];

        dp[n] = Math.min(
                minCostRec(n - 1, height, dp) + Math.abs(height[n] - height[n - 1]),
                minCostRec(n - 2, height, dp) + Math.abs(height[n] - height[n - 2])
        );

        return dp[n];
    }
}
