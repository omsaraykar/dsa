package CodeChef;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x < y) {
                System.out.println(2);
            } else if (x > y) {
                if (y > 1 && y < x - 1) {
                    System.out.println(3);
                }
                else {
                    System.out.println(-1);
                }
            } else {
                System.out.println(-1);
            }
        }
    }
}
