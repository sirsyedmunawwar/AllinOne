import java.util.HashMap;

// just printing the array
// 1. Brute force using HashSet
// 2. Using Hashmap
// 2. using two pointer and mark/visited array
public class RemoveDuplicatesInPlaceFromUnsortedArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,4,5,2};
        fun(arr);
    }

    // private static void fun(int[] arr) {
    //     boolean[] mark = new boolean[arr.length];

    //     for (int i = 0; i < arr.length; i++) {
    //         if (mark[i] == false) {
    //             for (int j = i + 1; j < arr.length; j++) {
    //                 if (arr[i] == arr[j]) {
    //                     mark[i] = true;
    //                 }
    //             }
    //         }
    //     }
    //     for (int i = 0; i < mark.length; i++) {
    //         if (mark[i] == false) {
    //             System.out.println(arr[i]);
    //         }
    //     }
    // }

private static void fun(int[] arr) {
    HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (mp.containsKey(arr[i])) {
                System.out.println(arr[i]);
                mp.put(arr[i], 1);
            } else {
            mp.put(arr[i], 1);
           }
        }
       
    }
}
