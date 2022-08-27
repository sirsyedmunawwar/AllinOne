import java.util.stream.IntStream;
// using loops
// using int sum = IntStream.of(arr).sum();
// and I did using recursion
public class CalculateTheSumOfElementOfArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(fun(arr, 0, 0));
        int sum = IntStream.of(arr).sum();
      System.out.println(sum);
    }

    // private static void fun(int[] arr) {
    //     int sum = 0;
    //     for (int i = 0; i < arr.length; i++) {
    //         sum += arr[i];
    //     }
    //     System.out.println(sum);
    // }
    private static int fun(int[] arr,int idx,int sum) {
        if (idx == arr.length) {
         return sum;
        }
        sum+=arr[idx];
        return fun(arr,idx+1,sum);
    }
}
