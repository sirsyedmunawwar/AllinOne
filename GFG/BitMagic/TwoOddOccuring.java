public class TwoOddOccuring {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 3, 4, 5, 4, 4, 6, 7, 7 };
        fun(arr);
    }

    private static void fun(int[] arr) {
        int res1 = 0;
        int res2 = 0;
        int xor = 0;

        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }
        int sb = xor & ~(xor - 1); // rightmost set bit
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & sb) != 0) {
                res1 = res1 ^ arr[i];
            } else {
                res2 = res2 ^ arr[i];
            }
        }
        System.out.println(res1 + " " + res2);

    }

    // private static void fun(int[] arr) {
    // for (int i = 0; i < arr.length; i++) {
    // int count = 0;
    // for (int j = 0; j < arr.length; j++) {
    // if (arr[j] == arr[i]) {
    // count++;
    // }
    // }
    // if (count % 2 != 0) {
    // System.out.println(arr[i]);
    // }
    // }
    // // theta (n^2)
    // }
}
