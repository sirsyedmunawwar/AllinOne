public class MinimumGroupFlipsToMakeSame {
    public static void main(String[] args) {
        int arr[] = { 0, 0, 1, 1, 0, 0, 1, 1, 0, 1 };
        fun(arr);
    }

    private static void fun(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                if (arr[i] != arr[0]) {
                    System.out.println("from " + i + " to");
                } else {
                    System.out.println(i - 1);
                }
            }
        }
        // Explicitly handling the end of
        // last interval
        if (arr[arr.length - 1] != arr[0]) {
            System.out.println(arr.length - 1);
        }
    }
}
