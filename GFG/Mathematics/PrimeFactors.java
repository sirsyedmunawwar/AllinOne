public class PrimeFactors {
    public static void main(String[] args) {
        fun(450);
    }

    private static void fun(int n) {
        // if(n>=1) return
        while (n % 2 == 0) {
            System.out.println(2);
            n = n / 2;
        }
        while (n % 3 == 0) {
            System.out.println(3);
            n = n / 3;
        }
        for (int i = 5; i * i <= n; i = i + 6) {
            while (n % i == 0) {
                System.out.println(i);
                n = n / i;
            }
            while (n % (i + 2) == 0) {
                System.out.println(i + 2);
                n = n / (i + 2);
            }
        }
        if (n > 3) {
            System.out.println(n);
        }

        // theta (squareroot(n))
    }

    // private static void fun(int n) {
    // // if(n>=1) return
    // for (int i = 2; i * i <= n; i++) {
    // while (n % i == 0) {
    // System.out.println(i);
    // n = n / i;
    // }
    // }
    // if (n > 1) {
    // System.out.println(n);
    // }

    // }

    // private static void fun(int n) {
    // for (int i = 2; i < n; i++) {
    // if (isPrime(i)) {
    // int x = i;
    // while (n % i == 0) {
    // System.out.println(i);
    // x = x * i;
    // }
    // }
    // }
    // //O(n^2logn)
    // }

    // private static boolean isPrime(int n) {
    // if (n == 1)
    // return false;
    // if (n == 2 || n == 3)
    // return true;

    // for (int i = 5; i * i <= n; i = i + 6) {
    // if (n % i == 0 || n % (i + 2) == 0) {
    // return false;
    // }
    // }
    // return true;

    // }
}
