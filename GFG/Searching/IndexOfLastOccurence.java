public class IndexOfLastOccurence {
    public static void main(String[] args) {
        int arr[] = { 5, 10, 15, 20, 20, 20, 40 };
        // includes duplicates and sorted

        // System.out.println(linearS(arr, 20));
        System.out.println(binarySearchRecursive(arr, 20, 0, arr.length - 1));
        System.out.println(binarySearchIterative(arr, 20));
    }

    private static int binarySearchIterative(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > x) {
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                if (mid == arr.length - 1 || arr[mid + 1] != arr[mid]) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

    private static int binarySearchRecursive(int[] arr, int x, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (x > arr[mid]) {
            return binarySearchRecursive(arr, x, mid + 1, high);
        } else if (x < arr[mid]) {
            return binarySearchRecursive(arr, x, low, mid - 1);
        } else {
            if (mid == arr.length - 1 || arr[mid + 1] != arr[mid]) {
                return mid;
            } else {
                return binarySearchRecursive(arr, x, mid + 1, high);
            }
        }
    }

}
