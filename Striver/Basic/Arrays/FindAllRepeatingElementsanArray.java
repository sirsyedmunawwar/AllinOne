import java.util.Arrays;
// 1.Brute force using two loops and an dup array
// 2.Sorting
// 3.Hashmap

public class FindAllRepeatingElementsanArray {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 4, 4, 5, 2 };
        fun(arr);
    }

    // private static void fun(int[] arr) {
    //     int[] dup = new int[arr.length];
    //     int k=0;
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = i + 1; j < arr.length; j++) {
    //             if (arr[i] == arr[j]) {
    //                 dup[k++] = arr[i];
    //             }
    //         }
    //     }
    //     for (int i = 0; i < k; i++) {
    //         if (dup[i] != dup[i + 1]) { //additional check
    //             System.out.println(dup[i]);
    //         }

    //     }
    // }


    private static void fun(int[] arr) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
            System.out.println(arr[i]);
           }
        }   
    }}
