<<<<<<< HEAD
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
=======
package Leetcode;

import java.util.*;

public class Solution {
    public long countStableSubarrays(int[] nums) {
        int n = nums.length;
        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        long count = 0;
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 2; i < n; i++) {
            long nextPrefix = prefix[i - 1];
            String nextKey = nums[i - 2] + "#" + nextPrefix;
            map.put(nextKey, map.getOrDefault(nextKey, 0) + 1);

            long targetPrefix = prefix[i] - nums[i];
            String key = nums[i] + "#" + targetPrefix;
            if (map.containsKey(key)) {
                count += map.get(key);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
    }
}
>>>>>>> c1cfe5f89ae2d9a7e1a983ef85df03329b1c1fdc
