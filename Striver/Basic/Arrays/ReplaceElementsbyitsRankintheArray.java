import java.util.*;

// 1.naive approach with HashSet
// 2.optimized approach with HashMap

public class ReplaceElementsbyitsRankintheArray {
    public static void main(String[] args) {
        int[] arr = { 20, 15, 26, 2, 98, 6 };
        fun(arr);
    }

    // private static void fun(int[] arr) {
    //     for (int i = 0; i < arr.length; i++) {
    //         HashSet<Integer> s = new HashSet<>();
    //         for (int j = 0; j < arr.length; j++) {
    //             if (arr[j] < arr[i]) {
    //                 s.add(arr[j]);
    //             }
    //         }
    //         System.out.println(s.size() + 1);

    //     }

    // }

    private static void fun(int[] arr) {
        int[] dummy = new int[arr.length];
        for (int i = 0; i < dummy.length; i++) {
            dummy[i] = arr[i];
        }
        Arrays.sort(dummy);
        int temp = 1;
        HashMap<Integer,Integer> m = new HashMap<>();
        for (int i = 0; i < dummy.length; i++) {
            if (m.get(dummy[i]) == null) {
                m.put(dummy[i], temp);
                temp++;
            }
        }
        // print directly or return array
        for (int i = 0; i < dummy.length; i++) {
            dummy[i] = m.get(arr[i]);
        }

        for (int i : dummy) {
            System.out.print(i + " ");
        }

    }
}
