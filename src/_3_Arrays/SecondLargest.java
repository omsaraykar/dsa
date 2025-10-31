package _3_Arrays;

public class SecondLargest {
    public int getSecondLargest(int[] arr) {
        int largest = -1, secondLargest = -1;

        for (int ele: arr) {
            if (ele > largest) {
                secondLargest = largest;
                largest = ele;
            } else if (ele > secondLargest && ele < largest) {
                secondLargest = ele;
            }
        }

        return secondLargest;
    }
}
