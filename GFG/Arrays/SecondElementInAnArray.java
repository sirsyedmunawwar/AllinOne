public class SecondElementInAnArray {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 20, 10 };
        // {10,10,10} edge cases
        // {20,20,10,8}
        System.out.println(fun(arr));
    }

    private static int fun(int[] arr) {
        // efficient
        int res = -1;
        int largest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[largest]) {
                res = largest;
                largest = i;
            } else if (arr[i] != arr[largest]) {
                if (res == -1 || arr[i] > arr[res]) {
                    res = i;
                }
            }
        }
        return res;
        // t(n);
    }

    // private static int fun(int[] arr) {
    // // naive
    // int largest = getLargest(arr);
    // int res = -1;
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] != arr[largest]) {
    // if (res == -1) {
    // res = i;
    // } else if (arr[i] > arr[res]) {
    // res = i;
    // }
    // }
    // }
    // return res;
    // // O(n^2)
    // }

    // private static int getLargest(int[] arr) {
    // // Efficient
    // int res = 0;
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] > arr[res]) {
    // res = i;
    // }
    // }
    // return res;
    // // t(n)
    // }
}