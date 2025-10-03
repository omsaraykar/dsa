package Leetcode.Daily;

public class Solution {
    public int maxBottlesDrunk(int filledBottles, int exchange) {
        int emptyBottles = 0;
        int drunk = 0;

        while (true) {
            if (emptyBottles >= exchange) {
                filledBottles += 1;
                emptyBottles -= exchange;
                exchange++;
            } else {
                if (filledBottles == 0) break;
                emptyBottles += filledBottles;
                drunk += filledBottles;
                filledBottles = 0;
            }
        }

        return drunk;
    }
}
