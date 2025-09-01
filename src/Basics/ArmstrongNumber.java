package Basics;

public class ArmstrongNumber {
    public boolean isArmstrong(int n) {
        int temp = n;

        // Count the length
        int length = 0;
        while (temp>0) {
            length++;
            temp /= 10;
        }

        temp = n;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, length);
            temp /= 10;
        }

        return sum == n;
    }

    public static void main(String[] args) {
        ArmstrongNumber am = new ArmstrongNumber();
        System.out.println(am.isArmstrong(153));
    }
}
