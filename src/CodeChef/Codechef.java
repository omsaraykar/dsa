package CodeChef;

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = (n * (n - 1)) / 2;
            int[] weights = new int[m];

            for (int i = 0; i < m; i++) {
                weights[i] = sc.nextInt();
            }

            Arrays.sort(weights);

            long maxMSTValue = 0;
            for (int i = 0; i < n - 1; i++) {
                maxMSTValue += weights[i];
            }

            System.out.println(maxMSTValue);
        }
    }
}
