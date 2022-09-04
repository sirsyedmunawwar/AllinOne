public class FindAPeakElement {
    public static void main(String[] args) {
        int arr[] = { 5, 10, 20, 15, 7 };
        System.out.println(fn(arr, 20));
    }

    private static int fn(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == arr.length - 1 || arr[mid + 1] <= arr[mid])) {
                return mid;
            }
            if (mid > 0 && arr[mid - 1] >= arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;

            }

        }
        return -1;
    }

    // private static int fn(int[] arr, int x) {
    // // Naive
    // int n = arr.length;
    // if (n == 1)
    // return arr[0];
    // if (arr[0] >= arr[1])
    // return arr[0];
    // if (arr[n - 1] >= arr[n - 2])
    // return arr[n - 2];

    // for (int i = 1; i < n - 1; i++) {
    // if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1])
    // return arr[i];
    // }
    // return -1;
    // }
}
