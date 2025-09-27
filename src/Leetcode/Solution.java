package Leetcode;

import java.util.*;

public class Solution {
    class Cords {
        int x;
        int y;

        Cords(int x, int y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Cords)) return false;
            Cords other = (Cords) o;
            return this.x == other.x && this.y == other.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
    public int distinctPoints(String s, int k) {
        int n = s.length();
        HashSet<Cords> set = new HashSet<>();

        int idx = 0;
        while (idx + k <= n) {
            int x = 0, y = 0;
            for (int i = 0; i < s.length(); i++) {
                if (i >= idx && i < idx + k) continue;
                char ch = s.charAt(i);
                if (ch == 'U') {
                    y += 1;
                } else if (ch == 'D') {
                    y -= 1;
                } else if (ch == 'L') {
                    x -= 1;
                } else if (ch == 'R') {
                    x += 1;
                }
            }
            idx++;
            set.add(new Cords(x, y));
            System.out.println(x + " " + y);
        }

        return set.size();
    }


    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.distinctPoints("LUL", 1));;
    }
}
