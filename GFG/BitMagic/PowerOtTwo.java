public class PowerOtTwo {
    public static void main(String[] args) {
        System.out.println(fun(31));
    }

    private static boolean fun(int n) {
        // power of 2 should have only one set bit

        if (n == 0) {
            return false;
        }
        int ans = n & (n - 1);
        return (ans == 0);

        // return (n!=0) && (n & (n - 1)==0)
    }

    // private static boolean fun(int n) {
    // if (n == 0) {
    // return false;
    // }
    // while (n != 1) {
    // if (n % 2 != 0) {
    // return false;
    // }
    // n = n / 2;
    // }
    // return true;
    // }
}
