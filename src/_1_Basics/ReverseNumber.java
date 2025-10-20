package _1_Basics;

public class ReverseNumber {
    public int reverse(int x) {
        int rev = 0;
        while (x!=0) {
            int lastDigit = x%10;
            x /= 10;

            // Check for overflow
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && lastDigit > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10 && lastDigit < -8)) {
                return 0;
            }

            rev = rev * 10 + lastDigit;
        }

        return rev;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Integer.MIN_VALUE); // -2147483648
    }
}
