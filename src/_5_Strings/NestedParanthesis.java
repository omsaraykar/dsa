package _5_Strings;

import java.util.Stack;

public class NestedParanthesis {
    public int maxDepth(String s) { // Expected Approach
        int curr = 0, max = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                curr++;
                max = Math.max(max, curr);
            } else if (ch == ')') {
                curr--;
            }
        }

        return max;
    }
    public int maxDepthNaive(String s) { // Naive Approach
        int maxDepth = 0;
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                st.push(ch);
                maxDepth = Math.max(maxDepth, st.size());
            } else if (ch == ')') {
                st.pop();
            }
        }

        return maxDepth;
    }
}
