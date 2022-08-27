public class OneOddOccuring {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 2, 2, 4, 4, 3, 8, 8, };
        fun(arr);
    }

    private static void fun(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res = res ^ arr[i];
        }
        System.out.println(res);

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

    // }
}
