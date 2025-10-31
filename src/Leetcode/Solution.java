package Leetcode;

import java.util.*;

public class Solution {
    public int longestBalanced(String s) {
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                int[] freqArray = new int[26];
                char ch = s.charAt(j);
                freqArray[ch - 'a']++;

                int equalFreq = 0; boolean balanced = true;
                for (int freq: freqArray) {
                    if (freq > 0) {
                        if (equalFreq == 0) {
                            equalFreq = freq;
                        }
                        else if (freq != equalFreq){
                            balanced = false;
                            break;
                        }
                    }
                }
                if (balanced) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
    }
}
