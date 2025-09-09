package Codeforces;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            // count zeros to know the sorted target: zeros then ones
            int zeros = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') zeros++;
            }

            // count mismatches with the sorted string (first `zeros` chars = '0', rest = '1')
            int mismatches = 0;
            for (int i = 0; i < n; i++) {
                char expected = (i < zeros) ? '0' : '1';
                if (s.charAt(i) != expected) mismatches++;
            }

            // each operation can fix two mismatched positions
            System.out.println(mismatches / 2);
        }

        sc.close();
    }
}
