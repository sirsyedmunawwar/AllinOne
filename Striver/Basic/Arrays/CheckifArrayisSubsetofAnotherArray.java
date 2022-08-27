import java.util.*;

// 1.using two loops
// 2.using one loop and binary Search
// 3.using HashMap

public class CheckifArrayisSubsetofAnotherArray {
    public static void main(String[] args) {
        int arr1[] = { 1, 3, 4, 5, 2 };
        int arr2[] = { 11, 12, 13, 15, 16 };
        int m = arr1.length;
        int n = arr2.length;
        boolean ans = isSubset(arr1, m, arr2, n);
        if (ans == true)
            System.out.print("arr1[] is a subset of arr2[]");
        else
            System.out.print("arr1[] is not a subset of arr2[]");
    }

    // FIRST FIRST
    // private static boolean isSubset(int[] arr1, int m, int[] arr2, int n) {
    // if (m > n)
    // return false;
    // for (int i = 0; i < arr1.length; i++) {
    // boolean present = false;
    // for (int j = 0; j < arr2.length; j++) {
    // if (arr1[i] == arr2[j]) {
    // present = true;
    // break;
    // }
    // }
    // if (!present)
    // return false;

    // }
    // return true;
    // }

    // SECOND SECOND
    // private static boolean isSubset(int[] arr1, int m, int[] arr2, int n) {
    // if (m > n)
    // return false;
    // Arrays.sort(arr2);

    // for (int i = 0; i < arr1.length; i++) {
    // boolean present = (BS(arr2, arr1[i]));
    // if (!present)
    // return false;
    // }
    // return true;
    // }

    // static Boolean BS(int[] arr, int i) {
    // int start = 0;
    // int end = arr.length - 1;
    // while (start <= end) {
    // int mid = start + (end - start) / 2;
    // if (arr[mid] == i) {
    // return true;
    // }
    // if (arr[mid] < i) {
    // start = mid + 1;
    // } else {
    // end = mid - 1;
    // }
    // }
    // return false;
    // }

    // THIRD THIRD
    private static boolean isSubset(int[] arr1, int m, int[] arr2, int n) {
        if (m > n)
            return false;
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            map.put(arr2[i], true);
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!map.containsKey(arr1[i])) {
                return false;
            }
        }
        return true;
    }
}
