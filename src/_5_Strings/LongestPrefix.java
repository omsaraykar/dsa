package _5_Strings;

import java.util.Arrays;

public class LongestPrefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String str1 = strs[0], str2 = strs[strs.length - 1];

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Math.min(str1.length(), str2.length()); i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                sb.append(str1.charAt(i));
            } else {
                break;
            }
        }

        return sb.toString();
    }
}
