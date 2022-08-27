import java.util.HashMap;
// 1.brute force two loops
// 2.HashMap

public class FindAllSymmetricPairsinArray {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2 }, { 3, 4 }, { 2, 1 }, { 4,5}, { 5, 4 } };
        fun(arr);  
    }

    // private static void fun(int[][] arr) {
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = i + 1; j < arr.length; j++) {
    //             if (arr[i][0] == arr[j][1] && arr[i][1] == arr[j][0]) {
    //                 System.out.println(arr[i][0] + " " + arr[i][1]);
    //             }
    //         }
    //     }
    // }
    private static void fun(int[][] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
          for (int i = 0; i < arr.length; i++) {
              int first = arr[i][0];
              int second = arr[i][1];
              if (map.get(second) != null && map.get(second) == first) {
                System.out.println(first + " " + second);
            } else {
                map.put(first, second);
              }
           
        }
    }
}
