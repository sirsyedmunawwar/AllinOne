public class CheckIfKthBitIsSet {
    public static void main(String[] args) {
        fun(12, 3);
    }

    private static void fun(int n, int k) {
        // using left shift
        int a = (n >> (k - 1)) & 1;
        if (a != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    // private static void fun(int n, int k) {
    // // using left shift
    // int a = n & (1 << (k - 1));
    // if (a != 0) {
    // System.out.println("Yes");
    // } else {
    // System.out.println("No");
    // }

    // }
}