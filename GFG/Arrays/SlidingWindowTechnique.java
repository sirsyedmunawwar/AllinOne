
public class SlidingWindowTechnique {
    public static void main(String[] args) {
        // Tips
        // subarray array sum with negatives integers then SWT will not work

        // int[] arr = { 1, 8, 30, -5, 20, 7 };
        // System.out.println(givenAnArrayOfIntegerAndKFindTheMaximumSumOfKConsecutive(arr,
        // 3));

        // int[] arr = { 1, 4, 20, 3, 10, 5 };
        // System.out.println(subarryWithGivenSumInAnUnsortedArrayOfNonNegativeInteger(arr,
        // 33));

        // Two exercise questions given in the video

    }

    // private static boolean
    // subarryWithGivenSumInAnUnsortedArrayOfNonNegativeInteger(int[] arr, int
    // givenSum) {
    // // O(n)
    // int currSum = arr[0];
    // int s = 0;
    // for (int e = 0; e < arr.length; e++) {
    // // Clean the prev window
    // while (currSum > givenSum && s < e - 1) {
    // currSum -= arr[s];
    // s++;
    // }
    // if (currSum == givenSum) {
    // return true;
    // }
    // if (e < arr.length) {
    // currSum += arr[e];
    // }
    // }
    // return (currSum == givenSum);
    // }

    // private static boolean
    // subarryWithGivenSumInAnUnsortedArrayOfNonNegativeInteger(int[] arr, int
    // givenSum) {
    // // naive
    // for (int i = 0; i < arr.length; i++) {
    // int sum = 0;
    // for (int j = i; j < arr.length; j++) {
    // sum += arr[j];
    // if (sum == givenSum) {
    // return true;
    // }
    // }
    // }
    // return false;
    // }

    // private static int
    // givenAnArrayOfIntegerAndKFindTheMaximumSumOfKConsecutive(int[] arr, int k) {
    // // using Sliding window
    // // O(n)
    // int currSum = 0;
    // for (int i = 0; i < k; i++) {
    // currSum += arr[i];
    // }
    // int maxSum = currSum;
    // for (int i = k; i < arr.length; i++) {
    // currSum += (arr[i] - arr[i - k]);
    // maxSum = Math.max(maxSum, currSum);
    // }
    // return maxSum;
    // }

    // private static int
    // givenAnArrayOfIntegerAndKFindTheMaximumSumOfKConsecutive(int[] arr, int k) {
    // // Naive
    // // O(n-k)*k =O(n^2)
    // int max_sum = Integer.MIN_VALUE;
    // for (int i = 0; i + k - 1 < arr.length; i++) {
    // int sum = 0;
    // for (int j = 0; j < k; j++) {
    // sum += arr[i + j];
    // }
    // max_sum = Math.max(sum, max_sum);
    // }
    // return max_sum;
    // }
}
