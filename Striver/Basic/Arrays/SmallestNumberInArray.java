import java.util.Arrays;

public class SmallestNumberInArray {
    public static void main(String[] args) {
        System.out.println("Hello");
        int[] arr = { 2, 5, 1, 3, 7 };
        System.out.println(fun(arr));
    }
    //1.sort the array index 0 will be min;
    // 2.using min variable
       
    static int fun(int[] arr) {
    Arrays.sort(arr);
    System.out.println(arr[0]);
    int min=Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]<min){
            min=arr[i];
        }
    }
    return min;
   }
}

