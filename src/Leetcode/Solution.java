package Leetcode;

import java.util.*;

class Solution {
    public int minArrivalsToDiscard(int[] arrivals, int w, int m) {
        Map<Integer, Integer> freq = new HashMap<>();
        ArrayDeque<Integer> kept = new ArrayDeque<>(); // stores indices of kept arrivals
        int discards = 0;

        for (int i = 0; i < arrivals.length; i++) {
            // window [i - w + 1, i]
            while (!kept.isEmpty() && kept.peekFirst() < i - w + 1) {
                int outIdx = kept.removeFirst();
                int outVal = arrivals[outIdx];
                int newFreq = freq.get(outVal) - 1;
                if (newFreq == 0) freq.remove(outVal);
                else freq.put(outVal, newFreq);
            }

            int val = arrivals[i];
            int arrivalFreq = freq.getOrDefault(val, 0);
            if (arrivalFreq >= m) {
                discards++;
            } else {
                kept.addLast(i);
                freq.put(val, arrivalFreq + 1);
            }
        }
        return discards;
    }
}