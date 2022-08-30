import java.util.Arrays;

public class LeftRotateAnArrayByD {
    // left means anticlockwise
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        fun(arr, 2);
        System.out.println(Arrays.toString(arr));
    }

    private static void fun(int[] arr, int d) {
        // using extra function reverse
        int n = arr.length;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
        // T(n)
    }

    private static void reverse(int[] arr, int low, int high) {
        while (low <= high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    // private static void fun(int[] arr, int d) {
    // // using temp arr
    // int temp[] = new int[d];
    // int n = arr.length;
    // for (int i = 0; i < d; i++) {
    // temp[i] = arr[i];
    // }
    // for (int i = d; i < n; i++) {
    // arr[i - d] = arr[i];
    // }
    // for (int i = 0; i < d; i++) {
    // arr[n - d + i] = temp[i];
    // }
    // // T(n)
    // // t(d)
    // }

    // private static void fun(int[] arr, int d) {
    // //calling LeftRotateAnArrayByOne d tims
    // for (int i = 0; i < d; i++) {
    // LeftRotateAnArrayByOne(arr);
    // }
    // }

    // private static void LeftRotateAnArrayByOne(int[] arr) {
    // int temp = arr[0];
    // for (int i = 0; i < arr.length - 1; i++) {
    // arr[i] = arr[i + 1];
    // }
    // arr[arr.length - 1] = temp;
    // // T(nd)
    // //T(1)
    // }
}
