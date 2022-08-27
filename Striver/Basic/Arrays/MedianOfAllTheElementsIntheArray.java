import java.util.Arrays;

public class MedianOfAllTheElementsIntheArray {
    public static void main(String[] args) {
        int[] arr = {2,5,1,7};
        fun(arr);
    }

    private static void fun(int[] arr) {
        Arrays.sort(arr);
        double med = 0;
        if (arr.length % 2 == 0) {
            med =(double) (arr[(arr.length -1) - 2] + arr[arr.length/2])/2;
        } else {
            med = arr[arr.length / 2];
        }
        System.out.println(med);
    }
}
