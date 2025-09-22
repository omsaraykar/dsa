package Strings;

import java.util.Stack;

public class RemoveParenthesis {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (char ch: s.toCharArray()) {
            if (ch == '(' && count++ > 0) {
                sb.append('(');
            } else if (ch == ')' && count-- > 1){
                sb.append(')');
            }
        }

        return sb.toString();
    }
}
