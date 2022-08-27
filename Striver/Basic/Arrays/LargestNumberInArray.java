public class LargestNumberInArray{
    public static void main(String[] args) {
        int arr[] = {8,10,5,7,9};
        System.out.println(fun(arr));
    }
    static int fun(int [] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}