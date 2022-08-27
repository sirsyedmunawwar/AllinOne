public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(fun(253));
    }

    private static int fun(int n) {
        if (n <= 9) {
            return n;
        } else
            return ((n % 10) + fun(n / 10));

        // T(d)
        // T(d)
    }
}
