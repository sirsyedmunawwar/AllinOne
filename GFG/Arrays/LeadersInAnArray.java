
public class LeadersInAnArray {
    public static void main(String[] args) {
        int arr[] = { 7, 10, 4, 3, 6, 5, 2 };
        // leader should be greather than all Element of right side
        fun(arr);
    }

    private static void fun(int[] arr) {
        // Efficient
        // T(n)
        // traversing an array from last and we'll get ans in reverse order
        // by using extra array and reverse array so that order can be corrected AS T(n)
        // and TC remain same
        int curr_ldr = arr[arr.length - 1];
        System.out.print(curr_ldr + " ");
        for (int i = arr.length - 1; i >= 0; i--) {
            if (curr_ldr < arr[i]) {
                curr_ldr = arr[i];
                System.out.print(curr_ldr + " ");
            }
        }
    }

    // private static void fun(int[] arr) {
    // // Naive
    // // O(n^2)
    // for (int i = 0; i < arr.length; i++) {
    // boolean flag = false;
    // for (int j = i + 1; j < arr.length; j++) {
    // if (arr[i] <= arr[j]) {
    // flag = true;
    // break;
    // }
    // }
    // if (flag == false) {
    // System.out.print(arr[i] + " ");
    // }
    // }
    // }
}
