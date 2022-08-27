public class TrailingZeroesInFactorial {
    public static void main(String[] args) {
        System.out.println(fun(251));
    }

    private static int fun(int n) {
        // effecient way
        int res = 0;
        for (int i = 5; i <= n; i = i * 5) {
            res = res + n / i;
        }
        return res;

        // // TC theta(logn)

    }

    // private static int fun(int n) {
    // // naive approch
    // int fact = 1;
    // for (int i = 2; i <= n; i++) {
    // fact *= i;
    // }
    // int zeroes = 0;
    // while (fact % 10 == 0) {
    // zeroes++;
    // fact = fact / 10;
    // }
    // return zeroes;
    // }
}
