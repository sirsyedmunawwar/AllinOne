
public class MaximumDifference {
    public static void main(String[] args) {
        // maximum value of arr[j]-arr[i] such that j>i
        int arr[] = { 2, 3, 10, 6, 4, 8, 1 };
        System.out.println(fun(arr));
    }

    private static int fun(int[] arr) {
        // Efficient (We have kept the track of Minimum element and comapared with
        // arr[j])
        // t(n)
        int res = arr[1] - arr[0];
        int minVal = arr[0];
        for (int j = 1; j < arr.length; j++) {
            res = Math.max(res, arr[j] - minVal);
            minVal = Math.min(minVal, arr[j]);
        }
        return res;
    }

    // private static int fun(int[] arr) {
    // // Naive
    // //t(n^2)

    // int res = arr[1] - arr[0];
    // for (int i = 0; i < arr.length - 1; i++) {
    // for (int j = i + 1; j < arr.length; j++) {
    // res = Math.max(res, arr[j] - arr[i]);
    // }
    // }
    // return res;
    // }
}
