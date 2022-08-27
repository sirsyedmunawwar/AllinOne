import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfEachElementInArray {
    // 1.using two loops ,visited array and count varible
    //2.Using maps

    public static void main(String[] args) {
        int[] arr = { 10, 5, 10, 15, 10, 5 };
        fun(arr);
    }

    // public static void fun(int[] arr) {
    //     int n = arr.length ;
    //     boolean[] visited = new boolean[n];
    //     for (int i = 0; i < arr.length; i++) {
    //         if (visited[i] == true) {
    //             continue;
    //         }
    //         int count = 1;
    //         for (int j = i + 1; j < arr.length; j++) {
    //             if (arr[i] == arr[j]) {
    //                 count++;
    //                 visited[j] = true;
    //             }
    //         }
    //             System.out.println(arr[i] +" "+ count);
    //     }
    // }
    public static void fun(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet())
    {
        System.out.println(entry.getKey() + " " + entry.getValue());
    }
    }
   
}
