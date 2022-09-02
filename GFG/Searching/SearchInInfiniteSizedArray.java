public class SearchInInfiniteSizedArray {
    public static void main(String[] args) {
        int arr[] = { 1, 10, 15, 20, 40, 50, 90, 100, 120, 500 };
        System.out.println(fn(arr, 100));
    }

    private static int fn(int[] arr, int x) {
        // Efficient
        if (arr[0] == x) {
            return 0;
        }
        int i = 1;
        while (arr[i] < x) {
            i = i * 2;
            if (arr[i] == x) {
                return i;
            }
        }
        // when loop breaks then apply BS btw pre valu and greater value
        return BinarySearch(arr, x, i / 2 + 1, i - 1);
    }

    private static int BinarySearch(int[] arr, int x, int low, int high) {

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    // private static int fn(int[] arr, int x) {
    // // Naive
    // // I cant use forloop because i cant use arr.length
    // int i = 0;
    // while (true) {
    // if (arr[i] == x) {
    // return i;
    // }
    // if (arr[i] > x) {
    // return -1;
    // }
    // i++;
    // }
    // }
}
