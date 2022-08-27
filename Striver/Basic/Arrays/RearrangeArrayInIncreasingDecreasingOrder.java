import java.util.*;
//using Arrays.sort and two loops
public class RearrangeArrayInIncreasingDecreasingOrder {
    public static void main(String[] args) {
        int[] arr = { 8, 7, 1, 6, 5, 9 };
        fun(arr);
    }

    public static void fun(int [] arr){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            System.out.println(arr[i]);
        }
        for (int i = arr.length-1; i >= arr.length/2; i--) {
              System.out.println(arr[i]); 
        }
    }
}
