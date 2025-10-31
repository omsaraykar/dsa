package _5_Strings;

public class IsIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] arr = new int[200];

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if (arr[ch1 - 'a'] == 0) {
                arr[ch1 - 'a'] = ch2;
            } else if (arr[ch1 - 'a'] == ch2) {
                continue;
            } else {
                return false;
            }
        }

        return true;
    }
}
