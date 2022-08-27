public class SieveOfEratorthenes {
    public static void main(String[] args) {
        fun(24);
    }

    private static void fun(int n) {
        boolean[] arr = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                for (int j = i * i; j <= n; j = j + i) {
                    arr[i] = false;
                }
            }
        }

        // shorter code
        // O(nloglogn)
    }

    // private static void fun(int n) {
    // boolean[] arr = new boolean[n + 1];
    // for (int i = 2; i * i <= n; i++) {
    // if (isPrime(i)) {
    // for (int j = i * i; j <= n; j = j + i) {
    // arr[i] = false;
    // }
    // }
    // }
    // for (int i = 2; i <= n; i++) {
    // if (arr[i] == true) {
    // System.out.println(i);
    // }
    // }

    // }

    // private static void fun(int n) {
    // for (int i = 2; i < n; i++) {
    // if (isPrime(i)) {
    // System.out.println(i);
    // }
    // }
    // // O(n*SqR(n))
    // }

    private static boolean isPrime(int n) {
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

}
