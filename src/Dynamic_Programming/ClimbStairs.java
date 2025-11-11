package Dynamic_Programming;

import java.util.Arrays;

public class ClimbStairs {
    // Memo
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return helper(n, dp);
    }
    private int helper(int n, int[] dp) {
        if (n <= 1) return 1;
        if (dp[n] != -1) return dp[n];

        int left = (dp[n - 1] == -1 ? helper(n - 1, dp) : dp[n - 1]);
        dp[n - 1] = left;
        int right = (dp[n - 2] == -1 ? helper(n - 2, dp) : dp[n - 2]);
        dp[n - 2] = right;

        return left + right;
    }
}
