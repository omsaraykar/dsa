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
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            boolean found = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i + 1] < arr[i]) {
                    found = true;
                    System.out.println(arr[i]);
                    break;
                }
            }

            if (!found) {
                System.out.println(arr[n - 1]);
            }

        }
    }
}
