public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = { 8, 3, 4, 8, 8 };
        System.out.println(fun(arr));
    }

    private static int fun(int[] arr) {
        // Efficient
        // O(n)
        int count = 1;
        int res = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[res] == arr[i]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                res = i;
                count = 1;
            }
        }

        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[res] == arr[i]) {
                count++;
            }
        }
        if (count <= arr.length / 2) {
            res = -1;
        }
        return res;
    }

    // private static int fun(int[] arr) {
    // // majority shouls be more than half
    // // Naive
    // //O(n^2)
    // for (int i = 0; i < arr.length; i++) {
    // int count = 1;
    // for (int j = i + 1; j < arr.length; j++) {
    // if (arr[i] == arr[j]) {
    // count++;
    // }
    // }
    // if (count > arr.length / 2) {
    // return arr[i];
    // }
    // }
    // return -1;
    // }
}
