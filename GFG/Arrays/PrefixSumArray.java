public class PrefixSumArray {
    public static void main(String[] args) {
        // int arr[] = { 2, 8, 3, 9, 6, 5, 4 };
        // fun(arr);

        int[] arr = { 3, 4, 8, -9, 20, 6 };
        System.out.println(equilibriumPoint(arr));

        int l[] = { 1, 2, 5, 15 };
        int r[] = { 5, 8, 7, 18 };
        System.out.println(findMaximumAppearingElementInARangeN(l, r, 4));

        // Three Question given in the video
    }

    private static int findMaximumAppearingElementInARangeN(int[] l, int[] r, int n) {
        int arr[] = new int[1000];
        for (int i = 0; i < n; i++) {
            arr[l[i]]++;
            arr[r[i] + 1]--;
        }
        int maxm = arr[0];
        int res = 0;
        for (int i = 1; i < 1000; i++) {
            arr[i] += arr[i - 1];
            if (maxm < arr[i]) {
                maxm = arr[i];
                res = i;
            }
        }
        return res;
    }

    private static boolean equilibriumPoint(int[] arr) {
        // prefix sum tech
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int lsum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (lsum == sum - arr[i]) {
                return true;
            }
            lsum += arr[i];
            sum -= arr[i];
        }
        return false;
    }

    // private static boolean equilibriumPoint(int[] arr) {
    // // Naive
    // for (int i = 0; i < arr.length; i++) {
    // int lSum = 0;
    // int rSum = 0;
    // for (int j = 0; j < i; j++) {
    // lSum += arr[j];
    // }
    // for (int j = i + 1; j < arr.length; j++) {
    // rSum += arr[j];
    // }
    // if (lSum == rSum) {
    // return true;
    // }
    // }
    // return false;
    // }

    private static void fun(int[] arr) {
        // General Technique
        int preficSum[] = new int[arr.length];
        preficSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            preficSum[i] = preficSum[i - 1] + arr[i];
        }
        for (int i = 0; i < preficSum.length; i++) {
            System.out.print(preficSum[i] + " ");
        }
    }
}
