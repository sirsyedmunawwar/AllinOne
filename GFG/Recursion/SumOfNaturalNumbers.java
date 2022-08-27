public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        System.out.println(fun(10));
    }

    private static int fun(int n) {
        if (n == 0) {
            return 0;
        }
        return n + (fun(n - 1));
        // t(n)
        // t(n)
    }
}
