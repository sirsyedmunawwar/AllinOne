public class AllDivisorsOfANumber {
    public static void main(String[] args) {
        fun(25);

    }

    private static void fun(int n) {
        int i;
        for (i = 1; i * i < n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        for (; i >= 1; i--) {
            if (n % i == 0) {
                System.out.println(n / i);
            }
        }

    }

    // private static void fun(int n) {
    // for (int i = 1; i * i <= n; i++) {
    // if (n % i == 0) {
    // System.out.println(i);
    // if (i != n / i) {
    // System.out.println(n / i);
    // }
    // }
    // }
    // //but factors are not insorted order
    // }

    // private static void fun(int n) {
    // for (int i = 1; i <= n; i++) {
    // if (n % i == 0) {
    // System.out.println(i);
    // }
    // }
    // theta (n);
    // }
}
