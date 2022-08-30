import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 0, 0, 8, 0, 9, 0 };
        fun(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void fun(int[] arr) {
        // Efficient
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
        // O(n)
    }

    // private static void fun(int[] arr) {
    // // Naive
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] == 0) {
    // for (int j = i + 1; j < arr.length - 1; j++) {
    // if (arr[j] != 0) {
    // int temp = arr[i];
    // arr[i] = arr[j];
    // arr[j] = temp;
    // }
    // }
    // }
    // }
    // //O(n^2)
    // }
}
