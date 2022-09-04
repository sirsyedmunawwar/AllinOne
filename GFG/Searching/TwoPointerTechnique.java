public class TwoPointerTechnique {
    public static void main(String[] args) {
        // Given an unsorted array and a number x, we need to find, if there is a pair
        // in the array with sum equals to x
        int[] arr = { 3, 5, 9, 2, 8, 10, 11 };
        System.out.println(fn1(arr, 17));

        // Technique used based on array is sorted or unsorted
        System.out.println(fn2(arr, 17));

        int ar[] = { 2, 3, 4, 8, 9, 20, 40 };
        System.out.println(tripletWithGivenSum(ar, 30));

    }

    private static boolean tripletWithGivenSum(int[] arr, int x) {
        // Naive approach with loops
        // for (int i = 0; i < arr.length - 2; i++) {
        // for (int j = i + 1; j < arr.length; j++) {
        // for (int k = j + 1; k < arr.length; k++) {
        // if (arr[i] + arr[j] + arr[k] == x) {
        // return true;
        // }
        // }
        // }
        // }
        // return false;

        // Efficient

        for (int i = 0; i < arr.length; i++) {
            // using two pointers approach
            if (isPair(arr, i + 1, arr.length - 1, x - arr[i])) {
                return true;
            }
        }
        return false;
    }

    private static boolean isPair(int[] arr, int left, int right, int x) {
        while (left < right) {
            if (arr[left] + arr[right] == x) {
                return true;
            } else if (arr[left] + arr[right] > x) {
                right--;
            } else {
                left++;
            }
        }
        return false;
    }

    private static boolean fn2(int[] arr, int x) {
        // Two Pointers approach
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] + arr[right] == x) {
                return true;
            } else if (arr[left] + arr[right] > x) {
                right--;
            } else {
                left++;
            }
        }
        return false;
    }

    private static boolean fn1(int[] arr, int x) {
        // Naive
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == x) {
                    return true;
                }
            }
        }
        return false;
    }
}
