package _5_Strings;

public class SumOfBeautyOfSubstrings {
    private int getMax(int[] freq) {
        int max = Integer.MIN_VALUE;
        for (int count: freq) {
            max = Math.max(count, max);
        }
        return max;
    }

    private int getMin(int[] freq) {
        int min = Integer.MAX_VALUE;
        for (int count: freq) {
            if (count > 0) {
                min = Math.min(count, min);
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }

    public int beautySum(String s) { // Naive Approach
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            int[] freq = new int[26];
            for (int j = i; j < s.length(); j++) {
                freq[s.charAt(j) - 'a']++;
                int max = getMax(freq);
                int min = getMin(freq);
                ans += (max - min);
            }
        }
        return ans;
    }
}
