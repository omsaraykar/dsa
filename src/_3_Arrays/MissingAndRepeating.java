package _3_Arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class MissingAndRepeating {
    ArrayList<Integer> findTwoElement2(int[] arr) {
        // Time: O(n), Space: O(1)
        ArrayList<Integer> res = new ArrayList<>(2);

        int repeating = -1;
        for (int i = 0; i < arr.length; i++) {
            int val = Math.abs(arr[i]);

            if (arr[val - 1] > 0) {
                arr[val - 1] *= -1;
            } else {
                repeating = arr[i];
            }
        }
        res.add(repeating);

        int missing = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                missing = i + 1;
                break;
            }
        }
        res.add(missing);

        return res;
    }
    ArrayList<Integer> findTwoElement1(int[] arr) {
        // Time: O(n), Space: O(n)
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int ele: arr) {
            int freq = map.getOrDefault(ele, 0);
            map.put(ele, ++freq);
        }

        ArrayList<Integer> res = new ArrayList<>(2);
        int missing = -1, repeating = -1;
        for (int i = 1; i <= arr.length; i++) {
            if (!map.containsKey(i)) {
                missing = i;
            }
            else if (map.containsKey(i) && map.get(i) > 1 ) {
                repeating = i;
            }
        }
        res.add(repeating);
        res.add(missing);

        return res;
    }
}
