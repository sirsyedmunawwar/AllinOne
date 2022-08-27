public class SortElementsofanArraybyFrequency {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 4, 3, 1, 2 };
        fun(arr);
    }

    private static void fun(int[] arr) {
        int[] count = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]+=1;
        }
        for (int i = 0; i < count.length; i++) {
            System.out.println(i);
        }
    }
}
