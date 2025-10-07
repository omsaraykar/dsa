package Leetcode;

import java.util.*;

public class Solution {
    public String removeSubstring(String s, int k) {
        ArrayDeque<Character> st = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            st.addLast(c);

            if (st.size() >= 2 * k) {
                boolean isKBalanced = true;
                int i = 0;

                for (char ch : st.toArray(new Character[0])) {
                    if (i >= k) break;
                    if (ch != '(') {
                        isKBalanced = false;
                        break;
                    }
                    i++;
                }

                if (isKBalanced) {
                    int j = 0;
                    Character[] arr = st.toArray(new Character[0]);
                    for (int idx = k; idx < 2 * k; idx++) {
                        if (arr[idx] != ')') {
                            isKBalanced = false;
                            break;
                        }
                        j++;
                    }
                }

                if (isKBalanced) {
                    for (int x = 0; x < 2 * k; x++) st.removeLast();
                }
            }
        }

        // Rebuild string
        StringBuilder sb = new StringBuilder();
        for (char c : st) sb.append(c);
        return sb.toString();
    }


    public static void main(String[] args) {
        Solution sol = new Solution();



    }
}
