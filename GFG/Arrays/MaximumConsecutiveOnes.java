public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1 };
        System.out.println(fun(arr));
    }

    private static int fun(int[] arr) {
        // Efficient
        // T(n)
        int res = 0;
        int curr = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                curr = 0;
            } else {
                curr++;
                res = Math.max(res, curr);
            }
        }
        return res;
    }

    // private static int fun(int[] arr) {
    // // Naive
    // // O(n^2)
    // int res = 0;
    // for (int i = 0; i < arr.length; i++) {
    // int curr = 0;
    // for (int j = i; j < arr.length; j++) {
    // if (arr[j] == 1) {
    // curr++;
    // } else {
    // break;
    // }
    // }
    // res = Math.max(curr, res);
    // }
    // return res;
    // }
}
