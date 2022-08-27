public class AddingElementinanArray {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 0 };
        // // begining(arr, 10);
        // ending(arr, 20);
        index(arr, 30, 4);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    // private static void begining(int[] arr, int i) {
    // for (int j = arr.length - 1; j >= 1; j--) {
    // arr[j] = arr[j - 1];
    // }
    // arr[0] = i;
    // }
    // private static void ending(int[] arr, int i) {
    // arr[arr.length - 1] = i;
    // }
    private static void index(int[] arr, int i, int k) {
            for (int j = arr.length - 1; j >= k; j--) {
                arr[j] = arr[j - 1];
            }
            arr[k] = i;
    }
}
