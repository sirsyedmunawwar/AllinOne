import java.util.Arrays;
import java.util.Collections;

class Pracice {
    static char[] csort(char arr[])
    {
        int n = arr.length;
        char output[] = new char[n];
        int count[] = new int[256];
        for (int i = 0; i < arr.length; ++i)
            count[arr[i]]++;
        for (int i = 1; i <= 255; ++i)
            count[i] += count[i - 1];
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }
        return output;
    }

    static int[] numsort(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int count[] = new int[256];
        
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        for (int i = 1; i <= 255; i++) {
            count[i] += count[i - 1];
        }
        for (int i = n-1; i >=0; i--) {
            ans[count[arr[i] - 1]] = arr[i];
            count[arr[i]]--;
        }
        return ans;
    }
    
    // Driver method
    public static void main(String args[])
    {
       
        char arr[] = { 'g', 'e', 'e', 'k', 's', 'f', 'o',
                       'r', 'g', 'e', 'e', 'k', 's' };
 
        char a[]=csort(arr);
 
        System.out.print("Sorted character array is ");
        for (int i = 0; i < a.length; ++i)
            System.out.print(a[i]);
        int[] as = { 1, 2, 3, 1, 2, 3 };
        int[] ss = numsort(as);
        System.out.println();
        for (int i : ss) {
            System.out.println(i);
        }
    }
}