import java.util.Arrays;

public class LeftRotateAnArrayByOne {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 0, 0, 8, 0, 9, 0 };
        fun(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void fun(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
        // T(n)
    }
}
