package _3_Arrays;

import java.util.HashMap;

public class SubarrayWithXor {
    public long subarrayXor(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int xor = 0, count = 0;
        for (int ele: arr) {
            xor ^= ele;

            int x = xor ^ k;
            if (map.containsKey(x)) {
                count += map.get(x);
            }

            int freq = map.getOrDefault(xor, 0);
            map.put(xor, ++freq);
        }

        return count;
    }
}
