package Basics;

public class GCDorHCF {
    public int gcd(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }

        if (a == 0) return b;
        return a;
    }
    public static void main(String[] args) {
        GCDorHCF obj = new GCDorHCF();
        System.out.println(obj.gcd(20, 28));
    }
}
