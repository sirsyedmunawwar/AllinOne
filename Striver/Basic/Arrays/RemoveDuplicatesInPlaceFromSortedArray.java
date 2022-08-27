import java.util.HashSet;
// Changing same array(inplace change)
// 1. Brute force using HashSet
// 2. using two pointer (SA)
public class RemoveDuplicatesInPlaceFromSortedArray {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 3, 3 };
        int k = fun(arr);
      
        for (int i = 0; i < k; i++) {
            System.out.println(arr[i]);
        }
    }

    // private static int fun(int[] arr) {
    //     int i = 0;
    //     for (int j = 1; j < arr.length; j++) {
    //         if (arr[i] != arr[j]) {
    //             arr[++i] = arr[j];
    //         }
    //     }
    //     return i + 1;
    // }
    private static int fun(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int j = 0; j < arr.length; j++) {
            set.add(arr[j]);
        }
        int i=0;
        for (int s : set) {
            arr[i++]=s;
        }
        return set.size();
    }
}
