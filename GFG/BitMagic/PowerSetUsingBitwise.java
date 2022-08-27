public class PowerSetUsingBitwise {
    public static void main(String[] args) {
        fun("abc");
    }

    private static void fun(String string) {
        int n = string.length();
        double powSize = Math.pow(2, n);

        for (int counter = 0; counter < powSize; counter++) {
            for (int j = 0; j < n; j++) {
                int a = counter & (1 << j);
                if (a != 0) {
                    System.out.print(string.charAt(j));
                }
            }
            System.out.println();
        }
        // theta (2^n * n)
    }
}
