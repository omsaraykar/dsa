package _1_Basics;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int num = x;
        int rev = 0;

        while (x > 0) {
            int lastDigit = x % 10;
            x /= 10;
            rev = rev * 10 + lastDigit;
        }

        return num == rev;
    }
}
