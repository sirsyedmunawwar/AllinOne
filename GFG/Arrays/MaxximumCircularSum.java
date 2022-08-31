public class MaxximumCircularSum {
    public static void main(String[] args) {
        int arr[] = { 5, -2, 3, 4 };
        System.out.println(fun(arr));
    }

    private static int fun(int[] arr) {
        // Efficient
        // O(n)0000
        // find the maxSubarr and maxcicular array
        // maxcircular = totalsubarray -minsubarray
        // we are finding minimum subarray as by doing inversion of array and finding
        // maxsubarray + totalsubarray
        int maxNormal = normalMaxSum(arr);
        if (maxNormal < 0) {
            return maxNormal;
        }
        int arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
            arr[i] = -arr[i];
        }
        int maxCircular = arrSum + normalMaxSum(arr);
        return Math.max(maxNormal, maxCircular);
    }

    private static int normalMaxSum(int[] arr) {
        int res = arr[0];
        int maxEnding = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEnding = Math.max(arr[i], maxEnding + arr[i]);
            res = Math.max(res, maxEnding);
        }
        return res;
    }

    // private static int fun(int[] arr) {
    // // Naive
    // // O(n^2)
    // int res = arr[0];
    // for (int i = 0; i < arr.length; i++) {
    // int currMax = arr[i];
    // int currSum = arr[i];
    // for (int j = 1; j < arr.length; j++) {
    // int index = (i + j) % arr.length;
    // currSum += arr[index];
    // currMax = Math.max(currMax, currSum);
    // }
    // res = Math.max(res, currMax);
    // }
    // return res;
    // }
}
