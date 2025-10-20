package _1_Basics;

import java.util.ArrayList;
import java.util.Collections;

public class AllDivisors {
    public static void print_divisors(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    list.add(i);
                } else {
                    list.add(i);
                    list.add(n / i);
                }
            }
        }

        Collections.sort(list);

        for (int i: list) {
            System.out.print(i + " ");
        }
    }
}
