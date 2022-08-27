import java.util.Arrays;

public class First
{
	public static void main(String[] args) {
        int[] arr = { 2, 22, 222,
                3, 33, 333,
                4, 44, 444,
                5, 55, 555,
                6, 66, 666,
                7, 77, 777,7777,
                8, 88, 888,
                9, 99, 999,9999
                
     };
     String s = "GEEKSFORGEEKS";
        System.out.println(stu(arr,s));
	}

    static String stu(int[] arr, String s) {
        String ans = new String();
        
        for (int i = 0; i < s.length(); i++) {
            int position = s.charAt(i) - 'A';
            ans = ans + arr[position];
        }

        return ans;

    }
}
