public class SecondSmallestAndLargestElementInArray {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 6, 2, 6, 10, 17 };
        fun(arr);
    }
// Find the smallest and largest element in the array in a single traversal
// After this, we once again traverse the array and find an element that is just greater than the smallest element we just found.
// for (i = 0;i < n;i++)
// 	{
// 		small = Math.min(small,arr[i]);
// 		large = Math.max(large,arr[i]);
// 	}

    private static void fun(int[] arr) {
            int max1 = Integer.MIN_VALUE;
            int max2 = Integer.MIN_VALUE;
            int min1 = Integer.MAX_VALUE;
            int min2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
              
                 max2 = max1;
                max1 = arr[i];
               
            }
            if (arr[i] < min1) {
                min2 = min1;
                min1 = arr[i];
            }
        }
        System.out.println(max2);
        System.out.println(min2);

    }
}
