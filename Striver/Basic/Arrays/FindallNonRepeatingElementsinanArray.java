import java.util.Map.Entry;
import java.util.HashMap;

// 1.brute force using two loops and check varible
// 2. sorting with edge cases
// 3.HashMap and Entry



public class FindallNonRepeatingElementsinanArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, -1, 1, 3, 1, 4, 5, 6, 7, 4, 5, 8, 9, 11, 12, 13 };
        fun(arr);
    }

    // private static void fun(int[] arr) {
    //     boolean check;
    //     for (int i = 0; i < arr.length; i++) {
    //         check = false;
    //         for (int j = 0; j < arr.length ; j++) {
    //             if (i!=j && arr[i] == arr[j]) {
    //                 check = true;
    //             }
    //         }
    //         if (!check) {
    //             System.out.println(arr[i]);
    //         }
    //     }
    // }

    // private static void fun(int[] arr) {
    //     Arrays.sort(arr);
    //     if (arr[0] != arr[1]) {
    //         System.out.println(arr[0]);
    //     }
    //     for (int i = 1; i < arr.length - 1; i++) {
    //         if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1]) {
    //             System.out.println(arr[i]);
    //         }
    //     }
    //      if (arr[arr.length-2] != arr[arr.length-1]) {
    //         System.out.println(arr[arr.length-1]);
    //     }
    // }

    private static void fun(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            if (map.get(i) == null) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }
         for(Entry<Integer,Integer> entry:map.entrySet()) {
	        if(entry.getValue()==1)
	            System.out.print(entry.getKey()+" ");
	    } 
    }
}
