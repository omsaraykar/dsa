package _4_Binary_Search;

public class NoOfOccurance {
    int countFreq(int[] arr, int target) {
        int lo = 0, hi = arr.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] >= target) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        System.out.println(lo);
        System.out.println(hi);

        int count = 0 ;
        for (int i = hi; i < arr.length; i++) {
            if (arr[i] == target)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        NoOfOccurance obj = new NoOfOccurance();
        System.out.println(obj.countFreq(new int[] {1, 1, 2, 2, 2, 2, 3}, 2));
    }
}
