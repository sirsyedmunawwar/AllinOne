public class FactorialOfANumber {
    public static void main(String[] args) {
        System.out.println(fun(4));
    }

    private static int fun(int n) {
        if (n == 0) {
            return 1;
        }
        return n * (fun(n - 1));

        // // TC theta(n)
        // // Ax O(n)
    }

    // private static int fun(int n) {
    // int fact = 1;
    // for (int i = 1; i <= n; i++) {
    // fact *= i;
    // }

    // return fact;
    // // TC theta(n)
    // // Ax O(1)
    // }
}
