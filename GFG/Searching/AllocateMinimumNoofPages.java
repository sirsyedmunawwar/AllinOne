public class AllocateMinimumNoofPages {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40 };
        System.out.println(fn(arr, arr.length, 2));
        // Minimize the maximum pages allocated
        // only contiguous pages can be allocated
    }

    private static int fn(int[] arr, int n, int k) {
        // O(n*logsum)
        int sum = 0;
        int mx = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            mx = Math.max(mx, arr[i]);
        }
        int low = mx;
        int high = sum;
        int res = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (isFeasible(arr, n, k, mid)) {
                res = mid;
                high = mid - 1;

            } else {
                low = mid + 1;
            }
        }
        return res;
    }

    private static boolean isFeasible(int[] arr, int n, int k, int ans) {
        int req = 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (sum + arr[i] > ans) {
                req++;
                sum = arr[i];
            } else {
                sum += arr[i];
            }
        }
        return (req <= k);
    }

    // private static int fn(int[] arr, int n, int k) {
    // // Naive Recursive solution

    // if (k == 1) {
    // return sum(arr, 0, n - 1);
    // }
    // if (n == 1) {
    // return arr[0];
    // }
    // int res = Integer.MAX_VALUE;
    // for (int i = 1; i < n; i++) {
    // res = Math.min(res, Math.max(fn(arr, i, k - 1), sum(arr, i, n - 1)));
    // }
    // return res;
    // }

    // private static int sum(int[] arr, int b, int e) {
    // int s = 0;
    // for (int i = b; i <= e; i++) {
    // s += arr[i];
    // }
    // return s;
    // }

}
