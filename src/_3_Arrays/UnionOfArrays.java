package _3_Arrays;

import java.util.ArrayList;

public class UnionOfArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j] && nums1[i] != 0) {
                i++;
            } else if (nums1[i] <= nums2[j] && nums1[i] == 0) {
                nums1[i++] = nums2[j++];
            } else {
                int temp = nums1[i];
                nums1[i] = nums2[j++];
                nums2[++i] = temp;
            }
        }


    }
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        int i = 0, j = 0;

        ArrayList<Integer> list = new ArrayList<>();

        while (i < a.length && j < b.length) {
            if (i > 0 && a[i - 1] == a[i]) {
                i++;
                continue;
            }

            if (j > 0 && b[j - 1] == b[j]) {
                j++;
                continue;
            }



            if (a[i] < b[j]) {
                list.add(a[i++]);
            } else if (a[i] == b[j]) {
                list.add(a[i++]);
                j++;
            } else {
                list.add(b[j++]);
            }
        }

        while (i < a.length) {
            if(i > 0 && a[i - 1] == a[i]) {
                i++;
                continue;
            }
            list.add(a[i++]);
        }

        while (j < b.length) {
            if(j > 0 && b[j - 1] == b[j]) {
                j++;
                continue;
            }
            list.add(b[j++]);
        }

        return list;
    }
}
