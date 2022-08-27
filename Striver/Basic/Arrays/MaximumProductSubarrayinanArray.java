public class MaximumProductSubarrayinanArray {

    // 1.brute force using three loops
    // 2.using two loops
    // 3.using two traversel
    // 4.using kadane's algorithm

    public static void main(String[] args) {
        int[] arr = { 2,3,-2,4 };
        fun(arr);

    }

    // private static void fun(int[] arr) {
    //     int product = 0;
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = 0; j < arr.length; j++) {
    //             int sum = 1;
    //             for (int j2 = i; j2 <= j; j2++) {
    //                 sum *= arr[j2];
    //             }
    //             product = Math.max(product, sum);

    //         }
    //     }
    //     System.out.println(product);
    // }

    // private static void fun(int[] arr) {
    //     int result = 1;
    //     for (int i = 0; i < arr.length - 1; i++) {
    //         int product = arr[i];
    //         for (int j = i + 1; j < arr.length; j++) {
    //             result = Math.max(result, product);
    //             product *= arr[j];
    //         }
    //         result = Math.max(result, product);
    //     }
    //     System.out.println(result);
    // }

    //  private static void fun(int[] arr) {
    //      int maxleft = arr[0];
    //      int maxright = arr[0];
    //      boolean zero = false;
    //      int product = 1;

    //      for (int i = 0; i < arr.length; i++) {
    //          product *= arr[i];
    //          if (arr[i] == 0) {
    //              zero = true;
    //              product = 1;
    //              continue;
    //          }
    //          maxleft = Math.max(maxleft, product);
    //      }
    //      product = 1;
    //      for (int j = arr.length - 1; j >= 0; j--) {
    //          product *= arr[j];
    //          if (arr[j] == 0) {
    //              zero = true;
    //              product = 1;
    //              continue;
    //          }
    //          maxright = Math.max(maxright, product);
    //      }

    //      if (zero) {
    //         System.out.println(Math.max(Math.max(maxleft, maxright), 0));
    //     } else {
    //           System.out.println(Math.max(maxleft, maxright));
    //      }
    // }

    
    private static void fun(int[] arr) {
        int pro1 = arr[0];
        int pro2 = arr[0];
        int result = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int temp = Math.max(Math.max(pro1 * arr[i], pro2 * arr[i]), arr[i]);
            pro2 = Math.min(arr[i], Math.min(pro1 * arr[i], pro2 * arr[i]));
            pro1 = temp;

            result = Math.max(result, pro1);
        }
        System.out.println(result);
    }

}
