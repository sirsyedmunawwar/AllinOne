import java.lang.reflect.Array;
import java.util.Arrays;

public class RepeatingElement {
    public static void main(String[] args) {
        // int arr[] = { 1, 3, 2, 4, 6, 5, 7, 3 };
        int arr[] = { 0, 2, 1, 3, 5, 4, 6, 2 };

        // Only one element repeats (any number of times)
        // all the elements from 0 to max[arr] are present

        // conditons
        // O(n) time
        // O(1) AS
        // No Modifications of original array
        System.out.println(fn1(arr));
    }

    private static int fn1(int[] arr) {
        // O(n) & O(1) no changes to original array

        // for array 0 to max
        int slow = arr[0] + 1;
        int fast = arr[0] + 1;

        do {
            slow = arr[slow] + 1;
            fast = arr[arr[fast] + 1] + 1;
        } while (slow != fast);

        slow = arr[0] + 1;
        while (slow != fast) {
            slow = arr[slow] + 1;
            fast = arr[fast] + 1;
        }
        return slow - 1;
    }

    // private static int fn1(int[] arr) {
    // // O(n) & O(1) no changes to original array

    // //for array 1 to max
    // int slow = arr[0];
    // int fast = arr[0];

    // do {
    // slow = arr[slow];
    // fast = arr[arr[fast]];
    // } while (slow != fast);

    // slow = arr[0];
    // while (slow != fast) {
    // slow = arr[slow];
    // fast = arr[fast];
    // }
    // return slow;
    // }

    // private static int fn1(int[] arr) {
    // // Efficient O(n) & O(n)
    // boolean visited[] = new boolean[arr.length];
    // for (int i = 0; i < arr.length; i++) {
    // if (visited[arr[i]] == true) {
    // return arr[i];
    // }
    // visited[arr[i]] = true;
    // }
    // return -1;
    // }

    // private static int fn1(int[] arr) {
    // // Naive O(nlogn)
    // Arrays.sort(arr);
    // for (int i = 0; i < arr.length - 1; i++) {
    // if (arr[i] == arr[i + 1]) {
    // return arr[i];
    // }
    // }
    // return -1;
    // }

    // private static int fn1(int[] arr) {
    // //Super Naive O(n^2 )
    // for (int i = 0; i < arr.length - 1; i++) {
    // for (int j = i + 1; j < arr.length; j++) {
    // if (arr[i] == arr[j]) {
    // return arr[i];
    // }
    // }
    // }
    // return -1;
    // }
}
