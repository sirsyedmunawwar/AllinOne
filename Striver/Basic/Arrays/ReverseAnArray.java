import java.util.Arrays;
// 1.By using Auxiliary array and storing values in reverse
// 2.using reverse for loop in void method;
// 3.using start and end varible in while loop
// 4. 3rd using recursion
// 5.  Collections.reverse(Arrays.asList(arr));


public class ReverseAnArray {

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 12 };
        // int[] ans = fun(arr);
        int start = 0;
        int end = arr.length - 1;
        int[] ans1 = funRecur(arr,start,end);
       System.out.println(Arrays.toString(ans1));
    }

    // private static int[] fun(int[] arr) {
    //     // for (int i = arr.length - 1; i >= 0; i--) {
    //     //     System.out.println(arr[i]);
    //     // }
    //     int start = 0;
    //     int end = arr.length - 1;
    //     while (start < end) {
    //         int temp = arr[start];
    //         arr[start] = arr[end];
    //         arr[end] = temp;
    //         start++;
    //         end--;
    //     }
    //     return arr;
    // }
     private static int[] funRecur(int[] arr,int start,int end) {
         if (start > end) {
             return arr;
         }
             int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            return funRecur(arr, start + 1, end - 1);
    }
    
}
