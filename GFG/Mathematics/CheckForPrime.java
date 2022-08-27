public class CheckForPrime {
    public static void main(String[] args) {
        System.out.println(fun(1031));
    }

    private static boolean fun(int n) {
        if (n == 1)
            return false;
        if (n == 2 || n == 3)
            return true;

        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;

    }

    // private static boolean fun(int n) {
    // if (n == 1)
    // return false;
    // for (int i = 2; i * i <= n; i++) {
    // if (n % i == 0) {
    // return false;
    // }
    // }
    // return true;
    // // O(squareRoot of n)
    // }

    // private static boolean fun(int n) {
    // if (n == 1)
    // return false;
    // for (int i = 2; i < n; i++) {
    // if (n % i == 0) {
    // return false;
    // }
    // }
    // return true;
    // // O(n)
    // }
}
