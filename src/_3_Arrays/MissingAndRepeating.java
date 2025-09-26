package _3_Arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class MissingAndRepeating {
    ArrayList<Integer> findTwoElementBrute(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>(2);
        int n = arr.length;

        int rep = -1, miss = -1;
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (i == arr[j]) count++;
            }

            if (count == 2) rep = i;
            else if (count == 0) miss = i;
        }

        ans.add(rep);
        ans.add(miss);
        return ans;
    }
}
