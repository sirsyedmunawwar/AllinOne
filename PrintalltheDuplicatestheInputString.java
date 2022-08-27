public class PrintalltheDuplicatestheInputString {
    public static void main(String[] args) {
        printdup("munawwar");
    }

    static void printdup(String s) {
    
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > 1) {
                System.out.println((char) (j + 'a') + " - " + arr[j]);
            }
        }
    }
   
    
}
