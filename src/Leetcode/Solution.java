package Leetcode;

import java.util.*;

public class Solution {
    public long minimumTime(int[] d, int[] r) {
        long lo = 1, hi = (long) 1e18;
        long ans = hi;

        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            if (canComplete(mid, d, r)) {
                ans = mid;
                hi = mid - 1; // try smaller time
            } else {
                lo = mid + 1; // need more time
            }
        }

        return ans;
    }

    private boolean canComplete(long T, int[] d, int[] r) {
        // Deliveries each drone *could* complete in T hours
        long done1 = Math.min(d[0], T - T / r[0]);
        long done2 = Math.min(d[1], T - T / r[1]);

        // Only one delivery can happen per hour total
        long totalPossible = Math.min(done1 + done2, T);

        return totalPossible >= (long) d[0] + d[1];
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
    }
}

