public class LargestElementInAnArray {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 20, 10 };
        System.out.println(fun(arr));
    }

    private static int fun(int[] arr) {
        // Efficient
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[res]) {
                res = i;
            }
        }
        return res;
        // t(n)
    }

    // private static int fun(int[] arr) {
    // //naive
    // for (int i = 0; i < arr.length; i++) {
    // boolean flag = true;
    // for (int j = 0; j < arr.length; j++) {
    // if (arr[j] > arr[i]) {
    // flag = false;
    // }
    // }
    // if (flag == true) {
    // return i;
    // }
    // }
    // return -1;
    // // O(n^2)
    // }
}