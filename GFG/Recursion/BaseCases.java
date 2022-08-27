public class BaseCases {
    public static void main(String[] args) {
        System.out.println(fact(4));
        System.out.println(fib(3));
    }

    private static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    private static int fact(int n) {
        if (n == 0) {
            return 1;
        }

        return n * fact(n - 1);
    }
}
