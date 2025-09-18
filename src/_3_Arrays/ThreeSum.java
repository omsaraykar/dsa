package _3_Arrays;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSumBetter(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int req = - (nums[i] + nums[j]);
                if (map.containsKey(req)) {
                    List<Integer> list = Arrays.asList(nums[i], nums[j], req);
                    Collections.sort(list);

                    set.add(list);
                }
                map.put(nums[j - 1], j - 1);
            }
            map.clear();


        }

        return new ArrayList<>(set);
    }
    public List<List<Integer>> threeSumBrute(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(list);
                        set.add(list);
                    }
                }
            }
        }

        return new ArrayList<>(set);
    }
}
