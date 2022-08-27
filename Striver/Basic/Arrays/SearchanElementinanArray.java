// 1. Linear Search 
// 2. Binary Search if array is sorted 

public class SearchanElementinanArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(fun(arr, 3));
    }

    // private static int fun(int[] arr, int i) {
    //     for (int j = 0; j < arr.length; j++) {
    //         if (arr[j] == i) {
    //             return j;
    //         }
    //     }
    //     return -1;
    // }
    //   private static int fun(int[] arr, int i) {
    //       int start = 0;
    //       int end = arr.length - 1;
    //       while (start < end) {
    //           int mid = start + (end - start) / 2;
    //           if (arr[mid] == i) {
    //               return mid;
    //           }
    //           if (arr[mid] < i) {
    //               start = mid + 1;
    //           } else {
    //               end = mid - 1;
    //           }
    //       }
    //       return -1;
    // }

 private static int fun(int[] arr, int i) {
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == i) {
                return j;
            }
        }
        return -1;
    }}
