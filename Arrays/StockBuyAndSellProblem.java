public class StockBuyAndSellProblem {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 3, 8, 12 };

        // System.out.println(fun(arr, 0, arr.length - 1));
        System.out.println(fun(arr));
    }

    private static int fun(int[] arr) {
        // Efficient
        // O(n)
        // using cummulative addition
        int profit = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                profit += (arr[i] - arr[i - 1]);
            }
        }
        return profit;
    }

    // private static int fun(int[] arr, int start, int end) {
    // // Naive
    // // O(n^2)

    // if (end <= start) {
    // return 0;
    // }
    // int profit = 0;
    // for (int i = start; i < end; i++) {
    // for (int j = i + 1; j <= end; j++) {
    // if (arr[j] > arr[i]) {
    // int currProfit = arr[j] - arr[i] + fun(arr, start, i - 1) + fun(arr, j + 1,
    // end);
    // profit = Math.max(profit, currProfit);
    // }
    // }
    // }
    // return profit;
    // }
}
