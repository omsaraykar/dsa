package _3_Arrays;

public class InversionCount {
    static int inversionCount(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) count++;
            }
        }

        return count;
    }
}
