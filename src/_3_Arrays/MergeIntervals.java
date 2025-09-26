package _3_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        for (int[] interval: intervals) {
            if (ans.isEmpty() || interval[0] > ans.getLast()[1]) {
                ans.add(interval);
            } else {
                int[] newInterval = new int[2];
                newInterval[0] = ans.getLast()[0];
                newInterval[1] = Math.max(ans.getLast()[1], interval[1]);

                ans.set(ans.size() - 1, newInterval);
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }
}
