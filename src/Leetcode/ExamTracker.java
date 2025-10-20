package Leetcode;

import java.util.HashMap;

class ExamTracker {
    HashMap<Integer, Integer> map;
    public ExamTracker() {
        map = new HashMap<>();
    }

    public void record(int time, int score) {
        map.put(time, score);
    }

    public long totalScore(int startTime, int endTime) {
        long total = 0;
        if (startTime == endTime) {
            return map.get(startTime);
        }
        for (int i = startTime; i <= endTime; i++) {
            if (map.containsKey(i)) {
                total += map.get(i);
            }
        }

        return total;
    }
}