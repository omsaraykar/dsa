package _5_Strings;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int start = 0, end = s.length() - 1;

        while (start < end) {
            char leftChar = s.charAt(start), rightChar = s.charAt(end);
            if (!Character.isLetterOrDigit(leftChar)) start++;
            else if (!Character.isLetterOrDigit(rightChar)) end--;
            else if (leftChar != rightChar) {
                System.out.println(leftChar + " " + rightChar);
            }
            else {
                start++;
                end--;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome obj = new ValidPalindrome();
        System.out.println(obj.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
