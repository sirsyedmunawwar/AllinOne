public class PrintsUsingRecursion {
    public static void main(String[] args) {
        // printNto1(5);
        // print1ToN(5);
        // print1ToN(5, 1);
        System.out.println(fact(5, 1));
    }

    private static int fact(int n, int k) {
        // Tail Recursive Equivalent
        if (n == 0 || n == 1) {
            return k;
        }
        return fact(n - 1, k * n);
    }

    // private static void print1ToN(int n, int k) {
    // // Tail Recursive Equivalent
    // if (n == 0) {
    // return;
    // }
    // System.out.println(n);
    // print1ToN(n - 1, k + 1);

    // // theta(n)
    // // theta(n)
    // }

    // private static void printNto1(int n) {
    // if (n == 0) {
    // return;
    // }
    // System.out.println(n);
    // printNto1(n - 1);
    // // theta(n)
    // // theta(n)
    // }

    // private static void print1ToN(int n) {
    // if (n == 0) {
    // return;
    // }
    // print1ToN(n - 1);
    // System.out.println(n);
    // // theta(n)
    // // theta(n)
    // }
}