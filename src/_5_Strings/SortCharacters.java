package _5_Strings;

import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class SortCharacters {
    class Pair implements Comparable<Pair>{
        char ch;
        int freq;

        Pair (char ch, int freq) {
            this.ch = ch;
            this.freq = freq;
        }

        public int compareTo (Pair o) {
            if (this.freq == o.freq) {
                return Math.max(this.ch, o.ch) - Math.min(this.ch, o.ch);
            }
            return o.freq - this.freq;
        }
    }
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int freq = map.getOrDefault(s.charAt(i), 0);
            map.put(ch, ++freq);
        }

        PriorityQueue<Pair> heap = new PriorityQueue<>();
        for (char ch: map.keySet()) {
            heap.add(new Pair(ch, map.get(ch)));
        }

        StringBuilder sb = new StringBuilder();
        while (!heap.isEmpty()) {
            int freq = heap.peek().freq;
            char ch = heap.poll().ch;
            for (int i = 1; i < freq; i++) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        SortCharacters obj = new SortCharacters();
        System.out.println(obj.frequencySort("ah"));
    }
}
