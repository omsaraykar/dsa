package CodeChef;

import java.sql.SQLOutput;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int n = (x + y) / 3;

            int sum;

            if (y >= x) sum = 2 * n;
            else sum = (2 * y) + (n - y);

            System.out.println(sum);
        }
    }
}
