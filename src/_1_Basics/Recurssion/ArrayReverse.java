package _1_Basics.Recurssion;

public class ArrayReverse {
    public void reverseArray(int[] arr, int start, int end) {
        if (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverseArray(arr, start + 1, end - 1);
        }
    }

    public static void main(String[] args) {
        ArrayReverse obj = new ArrayReverse();
        int[] arr = new int[] {1, 2, 3, 4, 5, 6};
        obj.reverseArray(arr, 0, 5);

        for (int ele: arr) {
            System.out.print(ele + " ");
        }
    }
}
