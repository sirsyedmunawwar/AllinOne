public class IndexOfAllOccurence {
    public static void main(String[] args) {
        // count the no of occurence
        int arr[] = { 5, 10, 15, 20, 20, 20, 20, 30, 40 };
        // System.out.println(LinearS(arr, 20));

        System.out.println(all(arr, 20));
    }

    private static int all(int[] arr, int x) {
        // Efficient using Binary Search
        // calling two functions totol occ=last-first+1
        int first = IndexOfFirstOccurence(arr, x);
        if (first == -1) {
            return 0;
        }
        return (IndexOfLastOccurence(arr, x) - first + 1);
    }

    private static int IndexOfFirstOccurence(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > x) {
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                if (mid == 0 || arr[mid - 1] != arr[mid]) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }

    private static int IndexOfLastOccurence(int[] arr, int x) {
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

    // private static int LinearS(int[] arr, int x) {
    // // Naive
    // int count = 0;
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] == x) {
    // count++;
    // }
    // }
    // return count;
    // }
}
