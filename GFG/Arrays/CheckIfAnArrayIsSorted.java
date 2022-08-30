public class CheckIfAnArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 20 };
        System.out.println(fun(arr));
    }

    private static boolean fun(int[] arr) {
        // Efficient
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
        // O(n)
    }

    // private static boolean fun(int[] arr) {
    // // Naive
    // for (int i = 0; i < arr.length - 1; i++) {
    // for (int j = i + 1; j < arr.length; j++) {
    // if (arr[j] > arr[i]) {
    // return false;
    // }
    // }
    // }
    // return true;
    // // O(n ^ 2)
    // }
}
