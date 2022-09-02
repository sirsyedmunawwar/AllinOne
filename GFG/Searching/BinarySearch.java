public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60 };
        System.out.println(binarySearchIterative(arr, 40));
        // Naive app linear Search for both sorted and unsorted array
        // Efficient app binary Search for sorted array TC : O(logN)

        System.out.println(binarySearchRecursive(arr, 40, 0, arr.length - 1));
        // TC : O(logN)
        // AS: O(logN)
    }

    private static int binarySearchRecursive(int[] arr, int x, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == x) {
            return mid;
        } else if (arr[mid] > x) {
            return binarySearchRecursive(arr, x, low, mid - 1);
        } else {
            return binarySearchRecursive(arr, x, mid + 1, high);
        }

    }

    private static int binarySearchIterative(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
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
}