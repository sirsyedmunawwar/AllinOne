import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 20, 25 };
        fun(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void fun(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        // T(n)
        // T(1)
    }
}
