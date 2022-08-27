public class SubsetSumProblem {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 15 };
        System.out.println(fun(arr, arr.length, 25));
    }

    private static int fun(int[] arr, int n, int sum) {
        if (n == 0) {
            return (sum == 0) ? 1 : 0;
        }
        return fun(arr, n - 1, sum) + fun(arr, n - 1, sum - arr[n - 1]);
    }
    // t(2^n)
}
