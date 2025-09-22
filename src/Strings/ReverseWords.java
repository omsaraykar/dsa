package Strings;

public class ReverseWords {
    public static String reverseWords(String s) {
        int i = s.length() - 1;

        StringBuilder sb = new StringBuilder();
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') i--;
            System.out.println(i);
            int j = i;

            while (i >= 0 && s.charAt(i) != ' ') i--;
            sb.append(s, i + 1, j + 1);
            sb.append(' ');
            System.out.println(sb);
        }


        return sb.toString().trim();
    }
    public static String reverseWords_usingSplit(String s) {
        s = s.trim();
        String[] arr = s.split("\\s+");

        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
            if (i > 0) sb.append(" ");
        }

        return sb.toString();

        // Time Complexity: O(n)
        // Space Complexity: O(n)
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("  the sky is blue     "));;
    }
}
