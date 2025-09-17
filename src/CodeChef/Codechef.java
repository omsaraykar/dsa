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
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];

            int sum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }

            for (int i = 0; i < m; i++) {
                int newSum = 0;
                for (int j = 0; j < n; j++) {
                    arr[j] = (arr[j] + 1) % m;
                    newSum += arr[j];
                }
                sum = Math.min(sum, newSum);
            }

            System.out.println(sum);
        }
    }
}
