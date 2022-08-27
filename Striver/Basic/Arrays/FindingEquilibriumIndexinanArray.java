public class FindingEquilibriumIndexinanArray {

    // 1.Using Two Loops(Brute Force)
    // 2.Using Total Sum

    public static void main(String[] args) {
        int arr[] = { 2, 3, -1, 8, 4 };
        fun(arr);
    }

    // private static void fun(int[] arr) {
    // int leftsum;
    // int rightsum;
    // for (int i = 0; i < arr.length; i++) {
    // leftsum = 0;
    // for (int j = 0; j < i; j++) {
    // leftsum += arr[j];
    // }
    // rightsum = 0;
    // for (int j = i + 1; j < arr.length; j++) {
    // rightsum += arr[j];
    // }
    // if (leftsum == rightsum) {
    // System.out.println(i);
    // }
    // }
    // }

    private static void fun(int[] arr) {
        int totalsum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalsum += arr[i];
        }
        int leftsum = 0;
        int rightsum = totalsum;
        for (int j = 0; j < arr.length; j++) {
            rightsum -= arr[j];
            if (rightsum == leftsum) {
                System.out.println(j);
            }
            leftsum += arr[j];
        }
    }
}
