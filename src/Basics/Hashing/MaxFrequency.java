package Basics.Hashing;

import java.util.HashMap;

public class MaxFrequency {
    // Count the elements with the maximum frequency
    class Solution {
        public int maxFrequencyElements(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int maxFreq = 0;

            for (int num: nums) {
                int freq = map.getOrDefault(num, 0);
                map.put(num, ++freq);
                maxFreq = Math.max(maxFreq, freq);
            }

            int count = 0;
            for (int freq: map.values()) {
                if (freq == maxFreq) {
                    count += freq;
                }
            }

            return count;
        }
    }
}
