package _10_Sliding_Window;

import java.util.ArrayList;
import java.util.Arrays;

public class LengthOfLongestSubstring {
    // Length of the longest Substring without duplicate characters
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) return 0;

        int left = 0, right = 0;
        int[] seen = new int[256];
        Arrays.fill(seen, -1);

        int maxLength = Integer.MIN_VALUE;
        while (right < s.length()) {
            char ch = s.charAt(right);
            if (seen[ch] >= left) { //seen
                left = seen[ch] + 1;
            } else { // not seen
                maxLength = Math.max(maxLength, right - left + 1);
            }
            right++;
            seen[ch] = right;
        }

        return maxLength;
    }
}
