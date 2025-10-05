package _5_Strings;

public class RotateString {
    public boolean rotateString(String s1, String s2) { // KMP Algorithm
        s1 += s1;
        return s1.contains(s2);
    }
    public boolean rotateStringBrute(String s1, String s2) { // brute
        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.equals(s2)) return true;

            char last = s2.charAt(s2.length() - 1);
            s2 = last + s2.substring(0, s2.length() - 2);
        }

        return false;
    }
}
