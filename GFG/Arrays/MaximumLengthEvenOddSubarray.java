public class MaximumLengthEvenOddSubarray {
    public static void main(String[] args) {
        int arr[] = { 5, 10, 20, 6, 3, 8 };
        System.out.println(fun(arr));
    }

    private static int fun(int[] arr) {
        // Efficient
        // Based on kadane
        // O(n)
        int res = 1;
        int curr = 1;
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) || (arr[i] % 2 != 0 && arr[i -
                    1] % 2 == 0)) {
                curr++;
                res = Math.max(res, curr);
            } else {
                curr = 1;
            }
        }
        return res;
    }

    // private static int fun(int[] arr) {
    // // Naive
    // // O(n^2)
    // int res = 0;
    // for (int i = 0; i < arr.length; i++) {
    // int curr = 1;
    // for (int j = i + 1; j < arr.length; j++) {
    // if ((arr[j] % 2 == 0 && arr[j - 1] % 2 != 0) || (arr[j] % 2 != 0 && arr[j -
    // 1] % 2 == 0)) {
    // curr++;
    // } else {
    // break;
    // }
    // }
    // res = Math.max(res, curr);
    // }
    // return res;
    // }
}
