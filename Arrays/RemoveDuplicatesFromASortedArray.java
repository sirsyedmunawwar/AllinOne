import java.util.Arrays;

public class RemoveDuplicatesFromASortedArray {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 20, 30, 30, 30, 40, 50 };
        int r = fun(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < r; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    private static int fun(int[] arr) {
        // Efficient
        int res = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[res - 1]) {
                arr[res] = arr[i];
                res++;
            }
        }
        System.out.println(res);
        return res;
        // O(n)
        // O(1)
    }

    // private static void fun(int[] arr) {
    // // naive
    // int[] temp = new int[arr.length];
    // temp[0] = arr[0];
    // int res = 1;
    // for (int i = 1; i < temp.length; i++) {
    // if (temp[res - 1] != arr[i]) {
    // temp[res] = arr[i];
    // res++;
    // }
    // }
    // for (int i = 0; i < temp.length; i++) {
    // arr[i] = temp[i];
    // }
    // //O(n)
    // //O(n)
    // }
}
