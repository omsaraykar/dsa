package _1_Basics.Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CountFrequency {
    public List<List<Integer>> countFrequencies(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num: nums) {
            int freq = map.getOrDefault(num, 0);
            map.put(num, ++freq);
        }

        for (int key: map.keySet()) {
            res.add(new ArrayList<>(List.of(key, map.get(key))));
        }

        return res;
    }

    public static void main(String[] args) {
        CountFrequency obj = new CountFrequency();
        System.out.println(obj.countFrequencies(new int[] {5,5,5,5}));
    }
}
