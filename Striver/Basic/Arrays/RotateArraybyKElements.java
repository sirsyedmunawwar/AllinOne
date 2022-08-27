public class RotateArraybyKElements {

    // 1.Brute force using temp arr
    // 2.using recursion and calling it three times
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        funleft(arr, 2);
    }

    // keep eye on wheather is rotate left or right
    // 1. store k element in temp array
    // 2. change the original by moving forward/backward
    // 3. add temp in arr at correct position

    // private static void fun(int[] arr, int k) {
    // int n = arr.length;
    // int[] temp = new int[k];

    // for (int i = n - k; i < n; i++) {
    // temp[i - n + k] = arr[i];
    // }
    // for (int i = n - k - 1; i >= 0; i--) {
    // arr[i + k] = arr[i];
    // }
    // for (int i = 0; i < k; i++) {
    // arr[i] = temp[i];
    // }
    // for (int s = 0; s < arr.length; s++) {
    // System.out.println(arr[s]);
    // }
    // }

    // private static void funright(int[] arr, int k) {
    // int n = arr.length;
    // reverse(arr, 0, n - k - 1);
    // reverse(arr, n - k, n - 1);
    // reverse(arr, 0, n - 1);

    // for (int i : arr) {
    // System.out.print(i + " ");
    // }
    // }

    private static void funleft(int[] arr, int k) {
        int n = arr.length;
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
