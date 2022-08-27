public class AverageOfAllTheElementsIntheArray {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6 };
        fun(arr);
    }

    private static void fun(int[] arr) {
        double sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum/arr.length);
    }
}
